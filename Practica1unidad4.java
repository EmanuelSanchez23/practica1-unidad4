package practica1unidad4;

import static java.lang.System.out;
import java.util.Scanner;

public class Practica1unidad4 {

    public static void main(String[] args) {
        int opc = 0;

        double[] numero = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};
        Scanner menu = new Scanner(System.in);

        do {
            System.out.println(" Quiere sumar o multiplicar ");
            System.out.println("1. Sumar");
            System.out.println("2.Multiplicar");
            System.out.println("3.Salir");
            opc = menu.nextInt();

            switch (opc) {
                case 1:
                    double suma = 0;
                    for (int i = 0; i < numero.length; i++) {
                        suma += numero[i];

                    }
                    System.out.println("La suma es" + suma);

                    break;
                case 2:
                    double mul = 1;
                    for (int i = 0; i < numero.length; i++) {
                        mul *= numero[i];

                    }
                    System.out.println("La multiploicacion es" + mul);
                    break;
                case 3:
                    System.out.println("salir");
                    break;

                default:
                    System.out.println("opcion no valida");
                    throw new AssertionError();
            }
        } while (opc != 3);
    }
}
