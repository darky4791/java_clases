import java.util.Scanner;
public class INTROEjercicio4 {
    public static void main(String[] args) {
        double valor;
        double resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("valor que se desea convertir ba grados Celsius: ");
        valor = sc.nextDouble();
    
        
        resultado = ((valor - 32) * 5)/9; 
        System.out.println("el valor en Farenheit " + valor + " convertido a " + resultado);
    
        
        sc.close();
    }
}

