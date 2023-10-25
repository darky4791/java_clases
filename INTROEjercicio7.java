import java.util.Scanner;
public class INTROEjercicio7 {
    public static void main(String[] args) {  
        double compra1, compra2, compra3, resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("valor de la compra1: ");
        compra1 = sc.nextDouble();
            
        System.out.println("valor de la compra1: ");
        compra2 = sc.nextDouble();
    
        System.out.println("valor de la compra1: ");
        compra3 = sc.nextDouble();
    
        resultado = compra1 + compra2 + compra3;
        System.out.println("el precio de final de la compra sin el descuento es de: " + resultado);
        resultado = resultado * 0.85;

        System.out.println("el precio final de la compra ya aplicado el descuento es: " + resultado);
    
        
        sc.close();
    }
}