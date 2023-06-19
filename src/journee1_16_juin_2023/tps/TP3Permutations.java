package journee1_16_juin_2023.tps;

import java.util.Scanner;

public class TP3Permutations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la première valeur (a) : ");
        int a = scanner.nextInt();

        System.out.print("Entrez la deuxième valeur (b) : ");
        int b = scanner.nextInt();

        System.out.print("Entrez la troisième valeur (c) : ");
        int c = scanner.nextInt();

        System.out.printf("Les valeurs entrées sont : a = %d, b = %d et c = %d\n", a, b, c);

        int temp = a;
        a = c;
        c = b;
        b = temp;

        System.out.println("Permutation: b <== a, c <== b, a <== c");
        System.out.printf("Les valeurs permutées sont : a = %d, b = %d et c = %d\n", a, b, c);
    }
}
