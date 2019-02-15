package com.stackroute.practice;
import java.io.*;

public class Unit {
    String palindromeCheck(String str)  //test 1 que
    {

        String str1 = "";
        for (int i = str.length() - 1; i >= 0; i--) {

            str1 = str1 + str.charAt(i);
        }
        return str1;


    }

    int isPower(int number) {
        int pow = 2;
        int result = 1;
        for (; pow != 0; --pow) {
            result *= 4;
        }
        return result;
    }


    boolean isEven(int number) {

        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    int isFact(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {


            fact = fact * i;
        }
        return fact;
    }

    int[] isGrades(int inputArray[], int n) {
       int avg;
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        int sum=0;
        for(int i = 0; i < n ; i++)
        {
            sum = sum + inputArray[i];
        }
        avg =sum / n;
           inputArray[0]=avg;
           inputArray[1]=minValue;
           inputArray[2]=maxValue;
           return inputArray;
    }

    String contentPrintTextFile(String filename) throws IOException {

        File f;
        FileInputStream fis = null;
        String out = "";
        byte[] b = null;

        try {
            f = new File("/home/upasana/Documents/unitest2/src/main/java/com/stackroute/practice/file.txt");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }


        try {
            fis = new FileInputStream(f);
            b = new byte[(int) f.length()];
            fis.read(b);
        } catch (Exception e) {
            System.out.println(e);
        }

        out = new String(b);
        System.out.println(out);

        return out.toUpperCase();


    }

    int contentOfFileTimes(String filename) throws IOException {

        File file = new File("/home/upasana/Documents/unitest2/src/main/java/com/stackroute/practice/FileDemo.txt");
        FileInputStream fileStream = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fileStream);
        BufferedReader reader = new BufferedReader(input);
        String line;
        int countWord = 0;
        while ((line = reader.readLine()) != null) {
            if (!(line.equals(""))) {
                String[] wordList = line.split("\\s+");
                countWord += wordList.length;
            }
        }
        return countWord;
    }

    String[] memberData(String name, int age, double Salary) {
        String age1=String.valueOf(age);
        String sal=String.valueOf(Salary);
        String[] s= new String[3];
        s[0]=name;
        s[1]=age1;
        s[2]=sal;
        return s;

    }

    byte[] byteFileContent(String Filename) throws IOException {

        File file = new File("/home/upasana/Documents/unitest2/src/main/java/com/stackroute/practice/file.txt");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String s="";
        String st;
        while ((st = br.readLine()) != null)
        {
            s+=st;
        }
        byte[] bytearr1= s.getBytes();

        return bytearr1;
    }
}

