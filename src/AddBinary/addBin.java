package AddBinary;

//https://leetcode.com/problems/add-binary/description/

import java.math.BigInteger;

public class addBin {

    public static String addBinary(String a, String b) {
        int aInt = Integer.parseInt(a, 2);
        int bInt = Integer.parseInt(b, 2);



        return Integer.toBinaryString(aInt + bInt);


    }

    public static void main(String[] args) {
        String a = "111";
        String b = "101";
        System.out.println(addBinary(a,b));
    }

}
