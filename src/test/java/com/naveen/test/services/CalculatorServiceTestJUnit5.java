package com.naveen.test.services;

import org.junit.jupiter.api.*;

public class CalculatorServiceTestJUnit5 {

    // execute the logic before all test cases
    @BeforeAll
    public static void init(){

        System.out.println("This is single time logic");
    }

    // execute the logic afters all test cases
    @AfterAll
    public static void cleanup(){

        System.out.println("After all test case logic");
    }

    // execute the logic after each  test cases
    @BeforeEach
    public void eachTestCase(){
        System.out.println("Before each");
    }

    // execute the logic after each  test cases
    @AfterEach
    public void afterEachTestCase(){

        System.out.println("After each");
    }

    @Test
    @DisplayName("This is custom name") // custom test name
    public void addTwoNumbersTest(){

        System.out.println("First Test Case");
       int actualResult = CalculatorService.addTwoNumbers(12,12);
       int expectedResult = 24;
       Assertions.assertEquals(expectedResult, actualResult,"Test failed");

    }

    @Test
    @Disabled // ignore test case
    public void addAnyNumbersTest(){

        System.out.println("Second Test Case");
       int actualResult = CalculatorService.sumAnyNumbers(12,1,2,3);
       int expectedResult = 18;
       Assertions.assertEquals(expectedResult, actualResult);

    }

//    @Tag // tag test class
//    @Nested // used inside nested class
//    @TestFactory // used to mark

}
