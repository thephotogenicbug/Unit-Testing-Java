package com.naveen.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.Arrays;
import java.util.List;

public class AssertExample {

    // Assertion - validating actual result with expected result
    // Assertions class

    @Test
    public void test1(){

        System.out.println("Testing some assertion methods");
//        float actual = 12;
//        Float expected = 12.0f;
        // overloaded method
//        Assertions.assertEquals(expected, actual);
//        int []actualIntArray={1,2,3,4,5};
//        int []expectedIntArray={1,2,3,4,5};
//        Assertions.assertArrayEquals(expectedIntArray, actualIntArray);

//        String actualname = "Rahul";
//        String expectedName = "Rahul";
//        Assertions.assertSame(expectedName, actualname);
//        Assertions.assertEquals(expectedName, actualname);

//        Assertions.assertNull();
//        Assertions.assertNotNull();
//         boolean value = true;
//         Assertions.assertTrue(value);
//        Assertions.assertFalse();

//        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
//        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6);
//        Assertions.assertIterableEquals(list2, list1);

        Assertions.assertThrows(RuntimeException.class, () -> {

//            throw new RuntimeException("This is testing exception");
            System.out.println("This is testing executable");
        });


    }


}
