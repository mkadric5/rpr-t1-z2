package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n)
    {
        int cifra, suma = 0;
        do {
            cifra = n % 10;
            suma = suma + cifra;
            n = n / 10;
        } while (n>0);

        return suma;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Unesite broj n: ");
        int n = in.nextInt();
        System.out.println(" Brojevi izmedju 1 i " + n + " koji su djeljivi sumom svojih cifara su: ");
        for (int i=1; i<=n; i++)
            if (i % sumaCifara(i) == 0) System.out.println(i + " ");
    }
}
