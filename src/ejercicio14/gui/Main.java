package ejercicio14.gui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       //  CocheServices serviceCoche = new CocheServices();

        // cargarDatos(serviceCoche);

        int opcion=0;

        do {
            // mostrarMenu();
            opcion= sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;

                default:
                    break;
            }
        } while (opcion!=0);

    }

}
