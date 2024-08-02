import java.util.Scanner;

public class Ejecucion {

    //Codigo mejorado que representa el pseudocodigo y diagrama presentado en el taller 1

    public static void main(String[] args) {
        Scanner scannerkmart12 = new Scanner(System.in);

        System.out.println("Ingresa el primer valor: ");
        int valor1 = scannerkmart12.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        int valor2 = scannerkmart12.nextInt();

        System.out.println("Ingresa el tercer valor: ");
        int valor3 = scannerkmart12.nextInt();

        if (valor1 == valor2 || valor1 == valor3 || valor2 == valor3) {
            System.out.println("Los valores ingresados son iguales. Por favor revisar");
        } else {

            int mayor;
            if (valor1 >= valor2 && valor1 >= valor3) {
                mayor = valor1;
            } else if (valor2 >= valor1 && valor2 >= valor3) {
                mayor = valor2;
            } else
                mayor = valor3;

            int menor;
            if (valor1 <= valor2 && valor1 <= valor3) {
                menor = valor1;
            } else if (valor2 <= valor1 && valor2 <= valor3) {
                menor = valor2;
            } else
                menor = valor3;

            System.out.println("El numero mayor es " + mayor);
            System.out.println("El numero menor es " + menor);
        }

    }

}