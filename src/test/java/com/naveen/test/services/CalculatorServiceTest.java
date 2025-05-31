//package com.naveen.test.services;
//
//import org.junit.*;
//
//import java.util.Date;
//
//public class CalculatorServiceTest {
//
//    int counter = 0;
//
//   // @BeforeClass
//    @BeforeClass // before all test cases
//    public static void init(){
//
//        System.out.println("Before all test cases :");
//        System.out.println("Started Test : " + new Date());
//        // connection open | file open
//    }
//
//
//    @Before // executes the method before each test case
//    public void BeforeEach(){
//        System.out.println("Before each test case");
//        counter = 0;
//    }
//
//    // test method of addTwoNumbers
//    @Test(timeout =  2000)
//    public void addTwoNumbersTest(){
//        for(int i = 1; i <= 20; i++){
//
//            counter += i;
//        }
//
//        System.out.println("Test for addTwoNumbersTest");
//        int result = CalculatorService.addTwoNumbers(12,45);
//        int expected = 57;
//        System.out.println("Counter int first test case : " + counter);
//        Assert.assertEquals(expected, result);
//
//        // actual result
//        // expected result
//
//
//    }
//
//    @Test
//    public void sumAnyNumberTest(){
//        for(int i = 1; i <= 100; i++){
//
//            counter += i;
//        }
//        System.out.println("Test for sumAnyNumberTest");
//        int result = CalculatorService.sumAnyNumbers(2,7,8,9);
//
//        int expectedResult = 26;
//        System.out.println("Counter int second test case : " + counter);
//        Assert.assertEquals(expectedResult, result);
//    }
//
//    @AfterClass // after all test cases
//    public static void cleanup(){
//        System.out.println("After all test cases");
//        System.out.println("End test cases : " + new Date());
//    }
//
//    // Junit 4 test cases
//    // Test
//    // BeforeClass
//    // AfterClass
//    // Before
//    // After
//
//
//}
