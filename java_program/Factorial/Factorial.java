package Factorial;

import java.util.Scanner;

class Factorial {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");
        int a = sc.nextInt();
        int res = 1;
        for (int i = a; i > 0; i--)
            res *= i;
        System.out.println(res);
    }
}