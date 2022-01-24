package tut.esop.aau;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println("=== WHILE ===");
        int counter = 1;

        while(counter <= 10) {
            System.out.println(counter + " x " + num + " = " + counter*num);
            counter = counter + 1; // counter++
        }

        System.out.println("=== FOR ===");
        for(int i = 10; i > 0; i--) {
            System.out.println(i + " x " + num + " = " + i*num);
        }
    }
}
