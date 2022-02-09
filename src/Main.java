
public class Main {
    public static void main(String[] args) {

        System.out.println("Introduce el número para la criba de Erastótenes:");
        Criba vector = new Criba(17);
        System.out.println("\nVector inicial hasta :"+vector.getMaximo());
        for (int i = 0; i < vector.getVector().length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(i+1+"\t");
        }
        vector.generarPrimos();
        System.out.println("\nVector de primos hasta:"+vector.getMaximo());
        for (int i = 0; i < vector.getVector().length; i++) {
            if (i%10==0) System.out.println();
            System.out.print(vector.getVector()[i]+"\t");
        }
    }
}