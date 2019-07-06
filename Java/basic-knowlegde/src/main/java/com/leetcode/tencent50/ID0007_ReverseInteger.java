package com.leetcode.tencent50;

public class ID0007_ReverseInteger {
    public static void main(String[] args) {
        ID0007_ReverseInteger o = new ID0007_ReverseInteger();
        //System.out.println(o.reverse(-2147483648));
        //System.out.println(o.reverse(2147483647));
        //System.out.println(o.reverse(-1234560100));

        o.test();
    }

    public static void test(){
        int a = -2147483648;

        a = -2147483648;

        System.out.println(Math.abs(a));

    }

    public int reverse(int x) {

        /**
         * Get the length of x
         *
         * Example:
         *     x == 123     ->  lenth = 3
         *     x == -12345  ->  lenth = 5
         *     x == 0       ->  lenth = 1
         *     x == 7       ->  lenth = 1
         */
        int length;
        if (x == 0){
            length = 1;
        }else {
            length = (int)(Math.log10(Math.abs(x)) + 1);
        }

        System.out.println("length = " + length);

        int response = 0;
        for(int i=1; i<=length; i++){
            int reminder = x % 10;
            x = x/10;

            response += reminder * (Math.pow(10, length-i));

            System.out.println("response = " + response + ", reminder = " + reminder);
        }

        return response;
    }


}
