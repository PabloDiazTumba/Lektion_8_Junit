package com.pablodiaz.test;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


// Test class
class StudentTest {

    @Test
    public void myTest() {

        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = sc.nextLine();

        assertEquals("Benny","Benny");

    }

}