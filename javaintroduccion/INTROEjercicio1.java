import java.util.Scanner;
public class INTROEjercicio1 {
    public static void main(String[] args) {
        String nombre;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("dime tu nombre: ");
        nombre = sc.nextLine();
        
        System.out.println("bienvenido precioso: " + nombre);
        sc.close();
    }
}
