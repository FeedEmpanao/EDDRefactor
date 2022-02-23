import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el número para la criba de Erastótenes:");
        int numCriba =teclado.nextInt();
        int[] vectorTrabajo =new int[numCriba];
        System.out.println("\nVector inicial hasta :"+numCriba);
        for (int i = 0; i < vectorTrabajo.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(i+1+"\t");
        }
        vectorTrabajo=generarPrimos(numCriba);
        System.out.println("\nVector de primos hasta:"+numCriba);
        for (int i = 0; i < vectorTrabajo.length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(vectorTrabajo[i]+"\t");
        }
    }
    // Generar números primos de 1 a max
    public static int[] generarPrimos (int max)
    {
        int i,j;
        if (max >= 2) {
            // Declaraciones
            boolean[] esPrimo = new boolean[max+1];
            // Inicializar el array
            for (i=0; i<max+1; i++)
                esPrimo[i] = true;
            // Eliminar el 0 y el 1, que no son primos
            esPrimo[0] = esPrimo[1] = false;
            // Criba
            for (i=2; i<Math.sqrt(max+1)+1; i++) {
                if (esPrimo[i]) {
                    // Eliminar los múltiplos de i
                    for (j=2*i; j<max+1; j+=i)
                        esPrimo[j] = false;
                }
            }
            // ¿Cuántos primos hay?
            int cuenta = 0;
            for (i=0; i<max+1; i++) {
                if (esPrimo[i])
                    cuenta++;
            }
            // Rellenar el vector de números primos
            int[] primos = new int[cuenta];
            for (i=0, j=0; i<max+1; i++) {
                if (esPrimo[i])
                    primos[j++] = i;
            }
            return primos;
        } else { // max < 2
            return new int[0];
            // Vector vacío
        }
    }
}