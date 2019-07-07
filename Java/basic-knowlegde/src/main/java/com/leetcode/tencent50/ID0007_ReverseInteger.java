package com.leetcode.tencent50;

public class ID0007_ReverseInteger {
    public static void main(String[] args) {
        ID0007_ReverseInteger o = new ID0007_ReverseInteger();

        System.out.println(o.reverse(-2147483648));
        System.out.println(o.reverse(2147483647));
        System.out.println(o.reverse(-1234560100));

    }

    public int reverse(int x){
        String xString = String.valueOf(x);

        if (x < 0){
            xString = xString.substring(1);
        }

        StringBuffer sb = new StringBuffer();
        String xReverse = sb.append(xString).reverse().toString();

        if (x < 0){
            xReverse = "-" + xReverse;
        }

        Integer response;

        try {
            response = Integer.valueOf(xReverse);
        } catch (NumberFormatException e){
            response = 0;
        }

        return response;
    }

    public int reverse_deprected(int x) {

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


    public static int getLength(int x){
        if (x < 0){
            x = Math.abs(x);

            // x = - 2^31
            if (x < 0){
                return 0;
            }
        }

        String value = String.valueOf(x);
        System.out.println("value = " + value);
        return value.length();
    }

}
