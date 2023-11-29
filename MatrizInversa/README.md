
.-Una matriz inversa es una matriz cuadrada A-1 que, al multiplicarse por otra matriz cuadrada A del mismo orden, da como resultado la matriz identidad. Se puede       encontrar la matriz inversa mediante la multiplicación del inverso del determinante de A por la matriz adjunta o metodo de Gauss.

.-La matriz inversa se multiplica por la matriz original.

.-La existencia de una matriz inversa indica que la matriz tiene una solución única.

.-Si el determinante es cero, la matriz no tiene una inversa.

.-De lo contrario si es dierente a cero entonces tiene una inversa que se llama A-1.

Matriz Inversa 2x2:
1.-Utiliza la clase Scanner para leer la entrada del usuario.
2.-Solicita al usuario que ingrese los elementos de una matriz 2x2.
3.-Lee los elementos ingresados por el usuario y almacena la matriz en la variable matrizA.
4.-Calcula la inversa de la matriz ingresada utilizando el método calcularInversa.
5.-Imprime la matriz inversa resultante en la consola.
6.-Cierra el objeto Scanner para liberar recursos.
7.-Si el determinante es cero , no es una matriz invertible
Matriz Inversa 3x3:
1.-Utiliza un objeto Scanner para leer la entrada del usuario.
2.-Solicita al usuario que ingrese los elementos de una matriz 3x3.
3.-Llama al método calcularInversa para calcular la inversa de la matriz ingresada por el usuario.
4.-Calcula el determinante de la matriz mediante el método calcularDeterminante.
5.-Verifica si la matriz es invertible (si es cero se cancela ya que no es inversa).
6.-calcula la matriz con el metodo calcularMatrizAdjunta.
7.-Imprime los valores de la matriz.
8.-se cierra el objeto scanner.
Matriz Inversa 4x4:
1.-Este código Java calcula la inversa de una matriz cuadrada de tamaño 4x4 utilizando el método de eliminación gaussiana.  -->
2.-Se le solicita al usuario ingresar los elementos de la matriz, y luego el programa realiza los cálculos necesarios para obtener la matriz inversa. 
3.-El resultado se imprime con maximo 15 decimales utilizando la clase BigDecimal para evitar errores de redondeo en las operaciones.
4.-La matriz inversa se imprime al final con el resultado correcto.