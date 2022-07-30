import java.util.Scanner;

import static java.lang.System.in;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hafta kunlari");

        Scanner scanner = new Scanner(in);

        System.out.print(" = ");

        int n= scanner.nextInt();

        switch (n){
            case 1 -> System.out.println("Dushanba");
            case 2 -> System.out.println("Seshaba");
            case 3 -> System.out.println("Chorsanba");
            case 4 -> System.out.println("Payshanba");
            case 5 -> System.out.println("Juma");
            case 6 -> System.out.println("Shanba");
            case 7 -> System.out.println("Yakshanba");
            default ->    System.out.println("Error");

        }

















    }
}