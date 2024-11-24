package Sqrt;

import java.math.BigDecimal;

//https://leetcode.com/problems/sqrtx/description/
public class sqrt {

    public static double mySqrt(int x) {
        Double result = (double) 0;
        Double l = (double) (-1 * x);
        Double r = (double) (x + 2);
        Double m = (double) 0;
        double t = x;
        while (true) {
            m = (r + l) / 2;
            if (m == t || m * m == x) break;
            if (m * m > x)
                r = m;
            else
                l = m;
            t = m;
        }
        result = m;
        return result;
    }



    public static void main(String[] args) {
        System.out.println(mySqrt(2147483647));
    }
}
