package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {

        method1();
        System.out.println("Fim do programa!");

    }

    public static void method1() {
        System.out.println("*******Method1 start**********");
        method2();
        System.out.println("*******Method2 end**********");

    }

    public static void method2() {

        System.out.println("*******Method2 start**********");
        Scanner sc = new Scanner(System.in);
        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Posição inválida!");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
        }
        System.out.println("*******Method2 end**********");

        sc.close();
    }
}
