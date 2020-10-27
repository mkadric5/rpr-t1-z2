package ba.unsa.etf.rpr;

public class Main {

    public static int sumaCifara (int n)
    {
        int cifra, suma = 0;
        do {
            cifra = n % 10;
            suma = suma + cifra;
            n = n / 10;
        }while (n>0);

        return suma;
    }

    public static void main(String[] args) {

    }
}
