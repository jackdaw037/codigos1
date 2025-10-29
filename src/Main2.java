import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Berta Arenas
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el altura (m):");
        double a = sc.nextDouble(); //altura

        System.out.println("Introduzca la peso (kg):");
        double b = sc.nextDouble(); //peso

        double c = b / (a * a); // IMC
        System.out.println("Su IMC es de: "+c+".");

        if (c < 18.5) {
            System.out.println("Bajo");
        } else if (c < 24.9) {
            System.out.println("Medio");
        } else if (c < 29.9) {
            System.out.println("Alto");
        } else {
            System.out.println("Obeso");
        }

        sc.close();
    }
}