import java.util.Scanner;

class Table {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter tw numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
            System.out.println(a + " X " + i + " = " + a * i);
        }
    }
}
