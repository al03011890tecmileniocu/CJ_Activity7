/*
Inicia un nuevo proyecto y escribe una clase en Java con dos métodos donde se implementarán dos algoritmos.

    1. Declara e inicia un atributo tipo entero.
        o El primer método implementará un algoritmo para calcular n números primos. El método recibirá como parámetro el valor del atributo declarado; por ejemplo: si el atributo se inicializa en 100, el método calculará 100 números primos. Los números primos se almacenarán en un arreglo y el método regresará el arreglo con los n números primos.
        o El segundo método implementará un algoritmo para calcular la Sucesión de Fibonacci. El método recibirá como parámetro el valor del atributo declarado; por ejemplo: si el atributo se inicializa en 100, el método calculará 100 números de la Sucesión de Fibonacci. Los números se almacenarán en un arreglo y el método regresará el arreglo con los n números primos.
            - Itera el arreglo de números primos para imprimir el resultado en pantalla.
            - Itera el arreglo de números de la Sucesión de Fibonacci para imprimir el resultado en pantalla.
            - La salida del programa deberá verse con el siguiente formato:

                Números primos:
                * 2, 3, 5, 7, 11, …, {hasta n números}

                Sucesión de Fibonacci:
                * 0, 1, 1, 2, 3, …,  {hasta n números}

    Crea un repositorio en línea y sube el programa realizado.
    Realiza un reporte sobre la solución implementada para el problema y explica el funcionamiento del programa, incluye capturas de pantalla como evidencia del funcionamiento del programa.
        Incluye una breve definición de número primo.
        Incluye una breve definición de la Sucesión de Fibonacci.
        Incluye la liga al repositorio en el reporte realizado.

NOTA: Sé cauteloso al calcular un número alto de números primos, ya que esta es una tarea que puede agotar los recursos del sistema.
 */

import java.util.Arrays;

public class NumerosPrimosFibonacci {
    private int valor;
 
    public NumerosPrimosFibonacci(int valor) {
        this.valor = valor;
    }
 
    // Método para calcular los números primos
    public int[] calcularPrimos() {
        int[] primos = new int[valor];
        int count = 0;
        for (int num = 2; count < valor; num++) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[count] = num;
                count++;
            }
        }
        return primos;
    }
 
     // Método para calcular la sucesión de Fibonacci
    public int[] calcularFibonacci() {
        int[] fibonacci = new int[valor];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < valor; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }
        return fibonacci;
     }
 
     // Método para imprimir los resultados
     public void imprimirResultados(int[] primos, int[] fibonacci) {
        System.out.println("Números primos:");
        imprimirArray(primos);
        System.out.println("\nSucesión de Fibonacci:");
        imprimirArray(fibonacci);
     }
 
     // Método auxiliar para imprimir un arreglo
    private void imprimirArray(int[] arr) {
        System.out.print("* ");
        for (int i = 0; i < valor; i++) {
            if (arr[i] != 0) {
                System.out.print(arr[i]);
                if (i < valor - 1 && arr[i + 1] != 0) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(" ...");
    }
 
    public static void main(String[] args) {
        int n = 10; // Cambia este valor según necesites
        NumerosPrimosFibonacci npf = new NumerosPrimosFibonacci(n);
        int[] primos = npf.calcularPrimos();
        int[] fibonacci = npf.calcularFibonacci();
        npf.imprimirResultados(primos, fibonacci);
    }
}
