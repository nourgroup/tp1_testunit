package com.howtodoinjava.junit5.examples;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
 
public class AppTest {

    // 1- exécuter avant tous
    @Test
    @BeforeAll
    static void setup(){
        System.out.println("@BeforeAll executed");
    }

    // 2- exe avant chacun
    void setupThis(){
        System.out.println("@BeforeEach executed");
    }
     
    // 3- c'est un test de DEV
    @Test
    void testCalcOne()
    {
        System.out.println("======TEST ONE EXECUTED=======");
        Assertions.assertEquals( 4 , Calculator.add(2, 2));
    }

    // 4- c'est un test de prod
    // 6- ignorer ce test
    @Test
    void testCalcTwo()
    {
        System.out.println("======TEST TWO EXECUTED=======");

        // 5- tester l'addition de 4  et 2
    }

    // 7- exe après chacun
    void tearThis(){
        System.out.println("@AfterEach executed");
    }

    // 8- exex après tous
    static void tear(){
        System.out.println("@AfterAll executed");
    }
}
