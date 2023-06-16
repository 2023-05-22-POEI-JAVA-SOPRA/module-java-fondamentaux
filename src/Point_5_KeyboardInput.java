import java.util.Scanner;

public class Point_5_KeyboardInput {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Votre nom: ");
        String nom=input.nextLine();

        System.out.print("Votre age : ");
        int age=input.nextInt();

        System.out.printf("Votre nom est %s, et vous avez %d ans.",nom,age);
    }
}
