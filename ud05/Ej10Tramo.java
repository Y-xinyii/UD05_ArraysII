
import java.util.Scanner;

public class Ej10Tramo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[12];

        // Pedir 12 numeros
        for (int i = 0; i < 12; i++) {
            System.out.print("Introduce un numero: ");
            numeros[i] = sc.nextInt();
        }

        // Primera suma de 3 numeros
        int sumaMayor = numeros[0] + numeros[1] + numeros[2];
        int posicion = 0;

        // Buscar la suma mayor
        for (int i = 1; i < 10; i++) {
            int suma = numeros[i] + numeros[i + 1] + numeros[i + 2];

            if (suma > sumaMayor) {
                sumaMayor = suma;
                posicion = i;
            }
        }

        // Mostrar resultado
        System.out.println("Numeros: " + numeros[posicion] + " " + numeros[posicion + 1] + " " + numeros[posicion + 2]);

        System.out.println("Posiciones: " + posicion + " " + (posicion + 1) + " " + (posicion + 2));

        System.out.println("Suma maxima: " + sumaMayor);

        sc.close();
    }
}
