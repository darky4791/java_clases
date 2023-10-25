import java.util.Scanner;
public class INTROEjercicio2 {
    public static void main(String[] args) {
        double base, altura;
        double resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("medida de la base del rectangulo: ");
        base = sc.nextDouble();
        
        System.out.println("medida de la altura del rectangulo: ");
        altura = sc.nextDouble();
        
        resultado = base * altura; 

        System.out.println("el area de tu rectangulo es:" + resultado);
        sc.close();
    }
}
