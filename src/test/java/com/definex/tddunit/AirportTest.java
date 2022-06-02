package com.definex.tddunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AirportTest {
    @DisplayName("Given there is an economy flight")
    @Nested
    class EconomyFlightTest {
        private Flight economyFlight;
        private Passenger baris;
        private Passenger alp;

        @BeforeEach
        void setUp() {
            economyFlight = new EconomyFlight("1");
            baris = new Passenger("Baris", false);
            alp = new Passenger("Alp", true);
        }

        @Nested
        @DisplayName("When have a usual passanger")
        class UsualPassenger {
            @Test
            @DisplayName("Then get Economy Id")
            public void testGetEconomyId() {
                //Arrange
                //Flight economyFlight = new EconomyFlight("1");
                //Passenger baris = new Passenger("Baris",false);
                //Act
                //Assertion
                assertEquals("1", economyFlight.getId());

            }

            @Test
            public void testAddPassengerforEconomy() {
                //Arrange
                // Flight economyFlight = new EconomyFlight("1");
                // Passenger baris = new Passenger("Baris",false);
                //Act

                //Assertion
                assertEquals(true, economyFlight.addPassenger(baris));

            }

            @Test
            public void testGetPassengerListforEconomy() {
                //Arrange
                // Flight economyFlight = new EconomyFlight("1");
                // Passenger baris = new Passenger("Baris",false);
                //Act
                economyFlight.addPassenger(baris);
                //Assertion
                assertEquals(1, economyFlight.getPassengerList().size());

            }
        }
    }


}
