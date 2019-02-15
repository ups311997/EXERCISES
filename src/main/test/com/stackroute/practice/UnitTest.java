package com.stackroute.practice;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class UnitTest {

    Unit app;

    @BeforeClass
    public static void setUpOnce() {
        System.out.println("Inside setup once");

    }

    @AfterClass
    public static void teardownOnce() {
        System.out.println("Inside teardown once");

    }

    @Before
    public void setUp() {
        System.out.println("Inside setup");
        app = new Unit();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        app = null;
    }

    @Test
    public void test1() throws Exception {
        //Arrange
        String expectedValue = "ihba";

        //Act
        String actualValue = app.palindromeCheck("abhi");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test2() throws Exception {
        //Arrange
        int expectedValue = 16;

        //Act
        int actualValue = app.isPower(2);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void test5() throws Exception {
        //Arrange
        boolean expectedValue = true;

        //Act
        boolean actualValue = app.isEven(2);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }


    @Test
    public void test6() throws Exception {
        //Arrange
        boolean expected=true,actual=false;
        int[] expectedValue=new int[3];
        expectedValue[0]=81;
        expectedValue[1]=65;
        expectedValue[2]=98;
        int a[]=new int[4];//declaration and instantiation
        a[0]=86;//initialization
        a[1]=65;
        a[2]=98;
        a[3]=77;

        //Act
        int[] actualValue=app.isGrades(a,4);
        if (expectedValue[0]==actualValue[0]&&expectedValue[1]==actualValue[1]&&expectedValue[2]==actualValue[2])
        {
            actual=true;
        }
        //Assert
        assertEquals(expected, actual);
        assertNotNull(actualValue);

    }

    @Test
    public void test7() throws Exception {
        //Arrange
        int expectedValue=479001600;

        //Act
        int actualValue=app.isFact(12);
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }
    @Test
    public void test4() throws Exception {
        //Arrange
        String expectedValue="THIS IS TEST FILE";

        //Act
        String actualValue=app.contentPrintTextFile("file.txt");
        //Assert
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }
    @Test
    public void test8() throws Exception {
        //Arrange
        int expectedValue=1;
        int actualValue=0;

        String str="this is test file";
        byte[] bytearr1= str.getBytes();
        byte[] bytearr2;

        //Act
         bytearr2=app.byteFileContent("file.text");
        //Assert
        if (Arrays.equals(bytearr1, bytearr2))
        {
            actualValue=1;
        }
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }

    @Test
    public void test9() throws Exception {
        //Arrange
        int expectedValue=12;

        //Act
        int actualValue =app.contentOfFileTimes("FileDemo.txt");
        //Assert

        assertEquals(expectedValue, actualValue);

    }
    @Test
    public void test3() throws Exception {
        //Arrange
        String[] Es= new String[3];
        Es[0]="Harry Potter";
        Es[1]="30";
        Es[2]="2500.3";
        int  expectedValue=1;
        int actualValue=0;

        //Act
        String[] As = app.memberData("Harry Potter", 30, 2500.3);
        //Assert
            if (Es[0].equals(As[0])&&Es[1].equals(As[1])&&Es[2].equals(As[2]))
            {
                actualValue=1;
            }
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);

    }

}