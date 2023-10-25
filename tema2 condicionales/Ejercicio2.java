import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El mutiplo del numero es 2");
        }
        else if (numero % 3 == 0) {
            System.out.println("El mutiplo del numero es 3");
        }
    
        else if (numero % 5 == 0) {
            System.out.println("El mutiplo del numero es 5");
        }
    
        else if (numero % 7 == 0) {
            System.out.println("El mutiplo del numero es 7");
        }
    sc.close();
    }
}
