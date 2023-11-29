    // import java.util.Scanner;

    // public class Matriz2x2 {

    //     public static void main(String[] args) {
    //         // Crear un objeto Scanner para leer la entrada del usuario
    //         Scanner scanner = new Scanner(System.in);

    //         // Solicitar al usuario que ingrese la matriz
    //         System.out.println("Ingrese la matriz 2x2:");

    //         // Declarar y leer la matriz desde la entrada del usuario
    //         double[][] matrizA = new double[2][2];
    //         for (int i = 0; i < 2; i++) {
    //             for (int j = 0; j < 2; j++) {
    //                 // Solicitar y leer cada elemento de la matriz
    //                 System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
    //                 matrizA[i][j] = scanner.nextDouble();
    //             }
    //         }

    //         // Calcular la inversa
    //         double[][] matrizInversa = calcularInversa(matrizA);

    //         // Imprimir la matriz inversa
    //         System.out.println("Matriz Inversa:");
    //         imprimirMatriz(matrizInversa);

    //         // Cerrar el Scanner para evitar fugas de recursos
    //         scanner.close();
    //     }

    //     // Método para calcular la inversa de una matriz 2x2
    //     private static double[][] calcularInversa(double[][] matriz) {
    //         // Calcular el determinante de la matriz
    //         double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];

    //         // Verificar si la matriz es invertible (determinante no igual a cero)
    //         if (determinante == 0) {
    //             System.err.println("La matriz no es invertible.");
    //             return null;  // Si no es invertible, se devuelve null
    //         }

    //         // Calcular el inverso del determinante
    //         double inversoDeterminante = 1 / determinante;

    //         // Inicializar la matriz inversa 
    //         double[][] matrizInversa = new double[2][2];

    //         // Calcular los elementos de la matriz inversa
    //         matrizInversa[0][0] = matriz[1][1] * inversoDeterminante;
    //         matrizInversa[0][1] = -matriz[0][1] * inversoDeterminante;
    //         matrizInversa[1][0] = -matriz[1][0] * inversoDeterminante;
    //         matrizInversa[1][1] = matriz[0][0] * inversoDeterminante;

    //         // Devolver la matriz inversa
    //         return matrizInversa;
    //     }

    //     // Método para imprimir una matriz
    //     private static void imprimirMatriz(double[][] matriz) {
    //         // Iterar sobre las filas y columnas e imprimir cada elemento
    //         for (int i = 0; i < matriz.length; i++) {
    //             for (int j = 0; j < matriz[0].length; j++) {
    //                 System.out.print(matriz[i][j] + " ");
    //             }
    //             System.out.println();  // Nueva línea después de cada fila
    //         }
    //     }
    // }
