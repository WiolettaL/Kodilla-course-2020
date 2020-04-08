package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        BigMac bigmac = new BigMac.BigMacBuilder()
                .bun("type: sezame")
                .burgers(2)
                .sauce("barbecue")
                .ingredient("onion")
                .ingredient("lettuce")
                .build();
        System.out.println(bigmac);

        //When
        int howManyBuns = bigmac.getBurgers();

        //Then
        Assert.assertEquals(2, howManyBuns);
    }
}
