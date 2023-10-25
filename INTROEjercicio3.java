import java.util.Scanner;
public class INTROEjercicio3 {
    public static void main(String[] args) {
        double numero1, numero2;
        double resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("valor del primer numero: ");
        numero1 = sc.nextDouble();
        
        System.out.println("valor del segundo numero: ");
        numero2 = sc.nextDouble();
        
        resultado = numero1 + numero2; 
        System.out.println("la suma de los dos numeros ingreasados es: " + resultado);
        
        resultado = numero1 - numero2; 
        System.out.println("la resta de los dos numeros ingreasados es: " + resultado);
        
        resultado = numero1 * numero2; 
        System.out.println("la multiplicación de los dos numeros ingreasados es: " + resultado);
        
        resultado = numero1 / numero2; 
        System.out.println("la división de los dos numeros ingreasados es: " + resultado);
        
        sc.close();
    }
}
