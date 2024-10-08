package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ResponseInput {
//    public static List<Response> readInput(String fileName){
//        List<Response> endResult = new ArrayList<>();
//        String line = null;
//
//        try{
//            FileReader reader = new FileReader(fileName);
//            BufferedReader bufferedReader = new BufferedReader(reader);
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] result = line.split("\n");
//                endResult.add(new Response(result.));
//            }
//            } catch (FileNotFoundException e) {
//                System.out.println("Error opening file '" + fileName + "'");
//            } catch (IOException e) {
//                System.out.println("Error reading from file '" + fileName + "'");
//            }
//        return endResult;
//    }
//    private static List<Response> input = new ArrayList<>();

    public static List<Response> readInput(String fileName) {
        List<Response> input = new ArrayList<>();
        String line = null;
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println("Read: " + line);
                input.add(new Response(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error opening file '" + fileName + "'");
        } catch (IOException e) {
            System.out.println("Error reading from file '" + fileName + "'");
        }
        return input;
    }
}
