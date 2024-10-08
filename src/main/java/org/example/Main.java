package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Response> responses = ResponseInput.readInput("verbs.txt");
        for (Response response : responses){
            System.out.println(response.toString());
            response.printWords();
        }
    }
}