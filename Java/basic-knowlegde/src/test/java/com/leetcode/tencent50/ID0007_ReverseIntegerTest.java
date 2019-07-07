package com.leetcode.tencent50;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ID0007_ReverseIntegerTest {

    @Test
    public void getLengthTest(){

        Integer size = Integer.SIZE;

        // [-2^31, 2^31-1]
        Double maxPositive = Math.pow(2, size-1) - 1;
        Double maxNegitave = 0 - Math.pow(2, size-1);

        Integer a = maxPositive.intValue();
        System.out.println(a);
        System.out.println(ID0007_ReverseInteger.getLength(a));

        Integer b = maxNegitave.intValue();
        System.out.println(b);
        System.out.println(ID0007_ReverseInteger.getLength(b));

        System.out.println(ID0007_ReverseInteger.getLength(b-2));

        Assertions.assertEquals(3, ID0007_ReverseInteger.getLength(-234));
        Assertions.assertEquals(3, ID0007_ReverseInteger.getLength(234));

    }
}
