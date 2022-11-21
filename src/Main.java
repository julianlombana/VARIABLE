
import java.util.Scanner;

public class julian {
    public julian(){


    }

    public static void main(String[] args) {
        System.out.println("Hola empleado, por favor digite:");
        Scanner entrada = new Scanner(System.in);
        System.out.println("su nombre");
        String cadena = entrada.nextLine();
        System.out.println("su apellido");
        String cadena1 = entrada.nextLine();
        System.out.println("su edad");
        int num = entrada.nextInt();
        System.out.println("¿cuantas horas trabaja?");
        int num1 = entrada.nextInt();
        System.out.println(" cual es tu nombre es " + cadena + " su apellido es " + cadena1);
        System.out.println("su edad es " + num);
        System.out.println("usted trabaja: " + num1 + " horas");
        System.out.println("su salario es de " + 800000 * num1);
    }

