import java.util.Scanner;

/**
 * Clase para el cálculo de combinaciones utilizando recursividad para el factorial[cite: 2].
 */
public class combinacionesRecursividad {

    /**
     * Método recursivo para calcular el factorial de un número.
     * @param x Número entero no negativo[cite: 3].
     * @return Factorial de x[cite: 3].
     */
    public static int factorial(int x) {
        // Caso base: factorial(0) = 1[cite: 3]
        if (x == 0) {
            return 1;
        }
        // Llamada recursiva: factorial(x) = x * factorial(x - 1)[cite: 3]
        return x * factorial(x - 1);
    }

    /**
     * Método para calcular las combinaciones C(m, n) = n! / (m! * (n - m)!)[cite: 2, 3, 4].
     * @param m Cantidad de elementos en cada combinación[cite: 2, 3].
     * @param n Cantidad total de elementos[cite: 2, 3].
     * @return Número total de combinaciones[cite: 2].
     */
    public static int combinacion(int m, int n) {
        // Fórmula de combinaciones aplicando el método factorial recursivo[cite: 2, 3]
        return factorial(n) / (factorial(m) * factorial(n - m));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar valores de n y m al usuario[cite: 2, 4]
        System.out.print("Ingrese n: ");
        int n = sc.nextInt();

        System.out.print("Ingrese m: ");
        int m = sc.nextInt();

        // Llamada al método que calcula C(m, n)[cite: 2, 4]
        int resultado = combinacion(m, n);

        // Mostrar salida esperada[cite: 2, 3]
        System.out.println("C(" + m + ", " + n + ") = " + resultado);

        sc.close();
    }
}