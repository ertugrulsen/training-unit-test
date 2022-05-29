package com.definex.tddunit;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AirportTest {

    @DisplayName("Given There is second class")
    @Nested
    class SecondClassTest {
        private FlightClass secondClass;
        private Passenger uzay;
        private Passenger derin;

        @BeforeEach
        void setUp() {
            secondClass = new SecondClassFlight("1");
            uzay = new Passenger("Mike", false);
            derin = new Passenger("derin",true);
        }
        @Nested
        @DisplayName("When we have a usual passenger")
        class UsualPassenger {

            @Test
            @DisplayName("Then you can add and remove him from an second class")
            public void testSecondClassFlightUsualPassenger() {
                //FlightClass secondClass = new SecondClassFlight("1");
                Passenger Uzay = new Passenger("Uzay", false);
                assertEquals("1", secondClass.getId());
                assertEquals(true, secondClass.addPassenger(Uzay));
                assertEquals(1, secondClass.getPassengersList().size());
                assertEquals("Uzay", secondClass.getPassengersList().get(0).getName());
            }
        }



    }

    @DisplayName("Given There is first class")
    @Nested
    class FirstClassTest {
        private FlightClass firstClass;
        private Passenger uzay;
        private Passenger derin;

        @BeforeEach
        void setUp() {
            firstClass = new FirstClassFlight("2");
            uzay = new Passenger("Mike", false);
            derin = new Passenger("derin",true);
        }
        @Nested
        @DisplayName("When we have a usual passenger")
        class UsualPassenger {

            @Test
            @DisplayName("Then you can add and remove him from an first class")
            public void testSecondClassFlightUsualPassenger() {
                assertAll("Verify all conditions",
                        () -> assertEquals(false, firstClass.addPassenger(uzay)),
                        ()-> assertEquals(0, firstClass.getPassengersList().size()));
            }
        }



    }


}
