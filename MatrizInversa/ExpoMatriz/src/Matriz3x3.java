import java.util.Scanner;

public class Matriz3x3 {

    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la matriz
        System.out.println("Ingrese la matriz 3x3:");

        // Declarar y leer la matriz desde la entrada del usuario
        double[][] matrizA = new double[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Solicitar y leer cada elemento de la matriz
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        // Calcular la inversa
        double[][] matrizInversa = calcularInversa(matrizA);

        // Imprimir la matriz inversa
        System.out.println("Matriz Inversa:");
        imprimirMatriz(matrizInversa);

        // Cerrar el Scanner para evitar fugas de recursos
        scanner.close();
    }

    // Método para calcular la inversa de una matriz 3x3
    private static double[][] calcularInversa(double[][] matriz) {
        // Calcular el determinante de la matriz
        double determinante = calcularDeterminante(matriz);

        // Verificar si la matriz es invertible (determinante no igual a cero)
        if (determinante == 0) {
            System.err.println("La matriz no es invertible.");
            return null;  // Si no es invertible, se devuelve null
        }

        // Calcular la matriz adjunta
        double[][] matrizAdjunta = calcularMatrizAdjunta(matriz);

        // Calcular el inverso del determinante
        double inversoDeterminante = 1 / determinante;

        // Inicializar la matriz inversa 
        double[][] matrizInversa = new double[3][3];

        // Calcular los elementos de la matriz inversa
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizInversa[i][j] = matrizAdjunta[i][j] * inversoDeterminante;
            }
        }

        // Devolver la matriz inversa
        return matrizInversa;
    }

    // Método para calcular el determinante de una matriz 3x3
    private static double calcularDeterminante(double[][] matriz) {
        // Fórmula para el determinante de una matriz 3x3
        return matriz[0][0] * (matriz[1][1] * matriz[2][2] - matriz[1][2] * matriz[2][1])
                - matriz[0][1] * (matriz[1][0] * matriz[2][2] - matriz[1][2] * matriz[2][0])
                + matriz[0][2] * (matriz[1][0] * matriz[2][1] - matriz[1][1] * matriz[2][0]);
    }

    // Método para calcular la matriz adjunta de una matriz 3x3
    private static double[][] calcularMatrizAdjunta(double[][] matriz) {
        // Calcular la matriz de cofactores
        double[][] matrizCofactores = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizCofactores[i][j] = calcularCofactor(matriz, i, j);
            }
        }

        // Calcular la matriz adjunta (transponer la matriz de cofactores)
        double[][] matrizAdjunta = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAdjunta[i][j] = matrizCofactores[j][i];
            }
        }

        return matrizAdjunta;
    }

    // Método para calcular el cofactor de una entrada específica de una matriz 3x3
    private static double calcularCofactor(double[][] matriz, int fila, int columna) {
        // Fórmula para el cofactor de una matriz 3x3
        int signo = (fila + columna) % 2 == 0 ? 1 : -1;

        // Submatriz obtenida eliminando la fila y columna específicas
        double[][] submatriz = new double[2][2];
        int submatrizFila = 0, submatrizColumna = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i != fila && j != columna) {
                    submatriz[submatrizFila][submatrizColumna++] = matriz[i][j];

                    // Avanzar a la siguiente columna cuando se llena una fila
                    if (submatrizColumna == 2) {
                        submatrizColumna = 0;
                        submatrizFila++;
                    }
                }
            }
        }

        // Calcular el cofactor multiplicando el determinante de la submatriz por el signo
        return signo * (submatriz[0][0] * submatriz[1][1] - submatriz[0][1] * submatriz[1][0]);
    }

    // Método para imprimir una matriz
    private static void imprimirMatriz(double[][] matriz) {
        // Iterar sobre las filas y columnas e imprimir cada elemento
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();  // Nueva línea después de cada fila
        }
    }
}
