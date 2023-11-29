import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Matriz4x4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la matriz 4x4:");
        double[][] matrizA = new double[4][4];

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento (" + (i + 1) + "," + (j + 1) + "): ");
                matrizA[i][j] = scanner.nextDouble();
            }
        }

        double[][] matrizInversa = calcularInversa(matrizA);

        if (matrizInversa != null) {
            System.out.println("Matriz Inversa:");
            imprimirMatriz(matrizInversa);
        }

        scanner.close();
    }

    private static double[][] calcularInversa(double[][] matriz) {
        int n = matriz.length;
        BigDecimal[][] matrizAumentada = new BigDecimal[n][2 * n];

        // Convertir la matriz original a BigDecimal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAumentada[i][j] = BigDecimal.valueOf(matriz[i][j]);
                matrizAumentada[i][j + n] = (i == j) ? BigDecimal.ONE : BigDecimal.ZERO;
            }
        }

        // Aplicar eliminación gaussiana
        for (int i = 0; i < n; i++) {
            // Hacer que el pivote sea 1
            BigDecimal pivote = matrizAumentada[i][i];
            if (pivote.compareTo(BigDecimal.ZERO) == 0) {
                System.err.println("La matriz no es invertible.");
                return null;
            }

            for (int j = 0; j < 2 * n; j++) {
                matrizAumentada[i][j] = matrizAumentada[i][j].divide(pivote, 15, RoundingMode.HALF_UP);
            }

            // Hacer ceros en las otras filas
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    BigDecimal factor = matrizAumentada[k][i];
                    for (int j = 0; j < 2 * n; j++) {
                        matrizAumentada[k][j] = matrizAumentada[k][j].subtract(factor.multiply(matrizAumentada[i][j]));
                    }
                }
            }
        }

        // Extraer la matriz inversa de la parte derecha de la matriz aumentada
        double[][] matrizInversa = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizInversa[i][j] = matrizAumentada[i][j + n].doubleValue();
            }
        }

        return matrizInversa;
    }

    private static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
