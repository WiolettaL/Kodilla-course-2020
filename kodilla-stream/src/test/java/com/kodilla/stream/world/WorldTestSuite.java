package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //given
        World wholeWorld = new World();

        //when
        List<Country> europeCountries = new ArrayList<>();
        europeCountries.add(new Country("France", new BigDecimal("40")));
        europeCountries.add(new Country("Greece", new BigDecimal("69")));
        europeCountries.add(new Country("Norway", new BigDecimal("82")));

        List<Country> asiaCountries = new ArrayList<>();
        asiaCountries.add(new Country("Bhutan", new BigDecimal("160")));
        asiaCountries.add(new Country("India", new BigDecimal("110")));
        asiaCountries.add(new Country("Malaysia", new BigDecimal("115")));

        List<Country> africaCountries = new ArrayList<>();
        africaCountries.add(new Country("Algeria", new BigDecimal("100")));
        africaCountries.add(new Country("Chad", new BigDecimal("70")));
        africaCountries.add(new Country("Ethiopia", new BigDecimal("60")));

        Continent europe = new Continent(europeCountries);
        Continent asia = new Continent(asiaCountries);
        Continent africa = new Continent(africaCountries);

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //when
        BigDecimal totalPeople = world.getPeopleQuantity();
        //then

        Assert.assertEquals(new BigDecimal("806"), totalPeople);
    }
}
