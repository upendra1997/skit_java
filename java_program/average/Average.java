package com.java_program.Average;

class Average {
    public static void main(String Args[]) {
        int sum = 0;
        for (String i : Args) {
            sum += Integer.parseInt(i);
        }
        System.out.println("Average is " + sum * 1.0 / Args.length);
    }
}
