package com.kodilla.good.patterns.challenges.food2doorCompany;

import java.util.HashSet;

public final class ProducersService {

    public HashSet<Producer> producersSet = new HashSet<>();

    public HashSet<Producer> contractProducer(Producer producer) {
        if(producer.getProducerName() != null) {
            producersSet.add(producer);
        } else {
            System.out.println("This producer probably already exists in the database!");
        }
        return producersSet;
    }

    public HashSet<Producer> getProducersSet() {
        System.out.println("Current producers quantity:" + producersSet.size());
        return producersSet;
    }

}
