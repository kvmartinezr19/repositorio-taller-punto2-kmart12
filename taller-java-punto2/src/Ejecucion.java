import java.util.Scanner;
public class Ejecucion {

    //Codigo que representa el pseudocodigo y diagrama presentado en el taller 1

    public static void main(String[] args) {
        Scanner scannerkmart12 = new Scanner(System.in);

        System.out.println("Ingresa el primer valor: ");
        int valor1 = scannerkmart12.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        int valor2 = scannerkmart12.nextInt();

        System.out.println("Ingresa el tercer valor: ");
        int valor3 = scannerkmart12.nextInt();

        if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3){
            System.out.println("Los valores ingresados son iguales. Por favor revisar");
        }else  if (valor1 > valor2 && valor1 > valor3) {
            System.out.println(valor1 + " Es el mayor");
        } else if (valor2 > valor1 && valor2 > valor3) {
            System.out.println(valor2 + " Es el mayor");
        } else System.out.println(valor3 + " Es el mayor");

        if (valor1 < valor2 && valor1 < valor3){
            System.out.println(valor1 + " Es el menor");
        } else if (valor2 < valor1 && valor2 < valor3) {
            System.out.println(valor2 + " Es el menor");
        }else System.out.println(valor3 + " Es el menor");

    }

}