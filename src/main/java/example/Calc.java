package example;

import java.util.ArrayList;
import java.util.List;

public class Calc {

    public long fibo1(int n) {
        if (n <= 0 || n > 10) {
            throw new IllegalArgumentException("引数は1から10までの整数でお願いします");
        }
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            long num1 = 1;
            long num2 = 1;
            long result = 0;
            for (int i = 3; i <= n; i++) {
                result = num1 + num2;
                num1 = num2;
                num2 = result;
            }
            return result;
        }
    }

    public List<Long> fibo2(int n) {
        if (n <= 0 || n > 10) {
            throw new IllegalArgumentException("引数は1から10までの整数でお願いします");
        }
        List<Long> fiboList = new ArrayList<>();
        if (n == 1) {
            fiboList.add(0,1L);
            return fiboList;
        }
        if (n >= 2) {
            fiboList.add(0,1L);
            fiboList.add(1,1L);
        }
        for (int i = 3; i <= n; i++) {
            fiboList.add(fiboList.get(i-3) + fiboList.get(i-2));
        }
        return fiboList;
    }

}
