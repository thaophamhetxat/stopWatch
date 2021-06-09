package com.codegym;

public class Main {

    public static void main(String[] args) {
        stopWatch input = new stopWatch();
        int []arr = new int[100000];
        System.out.println("time: ");
        System.out.println("start: " + input.reset());
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i;
        }
        System.out.println("end: " + input.stop());
        System.out.println("ElapsedTime:" + input.getElapsedTime());




    }
}
