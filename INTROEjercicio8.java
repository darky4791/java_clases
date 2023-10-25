import java.util.Scanner;
public class INTROEjercicio8 {
    public static void main(String[] args) {  
        double valor1, valor2, resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("primer numero: ");
        valor1 = sc.nextDouble();
            
        System.out.println("segundo numero: ");
        valor2 = sc.nextDouble();
    
        //la condicion ?  true : false
        //  ? => entonces                        : => sino 
        resultado = (valor1 > valor2) ? (valor1 - valor2) : (valor2 - valor1);
        System.out.println("la distancia de numeros es de " + resultado);
        
        sc.close();
    }
}