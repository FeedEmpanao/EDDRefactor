public class Criba {
    private final int maximo;
    private int[] vector;

    // Generar números primos de 1 a max
    public int[] generarPrimos() {
        {
            int i, j;
            if (maximo >= 2) {
// Declaraciones
                int dim = maximo + 1; // Tamaño del array
                boolean[] esPrimo = new boolean[dim];
                // Inicializar el array
                for (i = 0; i < dim; i++)
                    esPrimo[i] = true;
                // Eliminar el 0 y el 1, que no son primos
                esPrimo[0] = esPrimo[1] = false;
                // Criba
                for (i = 2; i < Math.sqrt(dim) + 1; i++) {
                    if (esPrimo[i]) {
                        // Eliminar los múltiplos de i
                        for (j = 2 * i; j < dim; j += i)
                            esPrimo[j] = false;
                    }
                }
// ¿Cuántos primos hay?
                int cuenta = 0;
                for (i = 0; i < dim; i++) {
                    if (esPrimo[i])
                        cuenta++;
                }
// Rellenar el vector de números primos
                vector = new int[cuenta - 1];
                for (i = 0, j = 0; i < dim; i++) {
                    if (esPrimo[i] && i != 2)
                        vector[j++] = i;
                }
                return vector;
            } else { // max < 2
                return new int[0];
// Vector vacío
            }
        }
    }

        public int getMaximo () {
            return maximo;
        }

    public Criba(int maximo){
            this.maximo = maximo;
            vector = new int[maximo];
        }

        public int[] getVector () {
            return vector;
        }
    }

