package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User john = new Millenials("John Snow");
        User ibra = new ZGeneration("Zlatan Ibrahimovic");
        User ellen = new YGeneration("Ellen Lee DeGeneres");

        //When
        String johnCommunicateBy = john.sharePost();
        System.out.println("John is communicating by " + johnCommunicateBy);

        String ibraCommunicateBy = ibra.sharePost();
        System.out.println("Zlatan is communicating by " + ibraCommunicateBy);

        String ellenCommunicateBy = ellen.sharePost();
        System.out.println("Ellen is communicating by " + ellenCommunicateBy);

        //Then
        Assert.assertEquals("Snapchat", johnCommunicateBy);
        Assert.assertEquals("Twitter", ibraCommunicateBy);
        Assert.assertEquals("Facebook", ellenCommunicateBy);

    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jd = new Millenials("Johnny Depp");

        //When
        String jdCommunicateBy = jd.socialPublisher.share();
        System.out.println("Johnny is communicating by " + jdCommunicateBy);

        jd.setSocialStrategy(new TwitterPublisher());
        String jdNewSocialStrategy = jd.socialPublisher.share();
        System.out.println("Now Johnny is using " + jdNewSocialStrategy);

        //Then
        Assert.assertEquals("Twitter", jdNewSocialStrategy);


   }
}
