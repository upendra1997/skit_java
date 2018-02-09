package com.company;

public class test extends test1{
    test(){
        this(10); //should be first.
        System.out.println("Inside test()");
//        this(10); //call to constructor must be in first statements.
    }
    test(int num){
//        this(); //Recursive invocation
        System.out.println("inside test(10)");
    }
    public static void main(String[] args){
        test a = new test();
        System.out.println("inside Main");
    }
}
