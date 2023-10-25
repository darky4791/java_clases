import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int ingresado;

         Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el monto a ingresar: ");
        ingresado = sc.nextInt();

        if ((ingresado/200)>0) {
            System.out.println("");
        }
    }
}
