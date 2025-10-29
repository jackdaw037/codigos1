import java.util;

public class main {
    public static void main(String args) { // Aqui falta las [] para que el programa compile
        Scaner sc = new Scaner(System.an); //En esta scann lo cambio a Scanner sc = new Scanner(System.in);

        System.out.print("a "); // En el print pongo introduzca el peso para que quede más claro.
        Double a = sc.nextDouble() // Añado el ; y pongo Double en minúscula.
        System.out.print("b "); // Falta al final el ln, seria println.
        Double b = sc.nextDouble(); // Pongo el Double en minúscula.
        Double a = b / (a * a);
        system.out.printf("a"a); // Este print lo cambio entero a: System.out.println("Su IMC es de: "+c+".");
        if (a <= "18.5") {System.out.println("a"); // Quito las comillas para que lea el 18.5 como un double y en el print pongo que el IMC es bajo.
         else if (a < "24.9") {System.out.println("b"); // Quito las comillas para que lea el 24.9 como un double y en el print pongo que el IMC es medio.
         else if (a < "29.9") System.out.println("c"); // Quito las comillas para que lea el 29.9 como un double y en el print pongo que el IMC es alto.
         else {Systen.out.pritln("d");} // Cambio el print cambiando la n po m y pongo que el Imc seria Obeso.

        sc.close; // Añado ()
    }

  //Añado } que falta para cerrar.