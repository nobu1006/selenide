package example;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sample2 {

    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://rakuplus.jp/wp-login.php");

        String USER_EMAIL = System.getenv("USER_EMAIL");
        String USER_PASSWORD = System.getenv("USER_PASSWORD");
        if (USER_EMAIL == null || USER_PASSWORD == null) {
            System.err.println("環境変数が設定されていません。");
            System.exit(1);
        }
        WebElement emailElement = driver.findElement(By.id("user_login"));
        emailElement.sendKeys(USER_EMAIL);
        WebElement passwordElement = driver.findElement(By.id("user_pass"));
        passwordElement.sendKeys(USER_PASSWORD);

        driver.findElement(By.id("wp-submit")).click();
        driver.navigate().to("https://rakuplus.jp/shainlist");

        driver.findElement(By.cssSelector("label.tab5")).click();

        driver.findElement(By.linkText("2025年3月16日・4月")).click();

        List<WebElement> elements = driver.findElements(By.cssSelector(".entry-content > div"));
        int i = 0;
        for (WebElement elem : elements) {
            if (i == 0) {
                i++;
                continue;
            }
            List<WebElement> items = elem.findElements(By.cssSelector("div.staff > div"));
            // System.out.println(items.size());
            WebElement nameAndPhoto = items.get(0);
            WebElement info = items.get(1);
            nameAndPhoto.findElements(By.cssSelector("p.has-text-align-center")).forEach((e) -> {
                System.out.println(e.getText());
            });
            System.err.println(nameAndPhoto.findElement(By.tagName("img")).getAttribute("src"));
            System.out.println("-------------");
            info.findElements(By.tagName("p")).forEach((e) -> {
                System.out.println(e.getText());
                System.out.println("-----");
            });
            System.out.println("=============");
        } 










        //driver.quit();

    }

}
