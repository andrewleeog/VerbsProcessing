package org.example;

public class Response {
    private String response;
    private String[] words;

    Response(String r){
        response = r;
        words = r.split(" ");
    }

    @Override
    public String toString(){
        return response;
    }

    public void printWords(){
        for (String s : words) {
            System.out.println(s);
        }
    }
}
