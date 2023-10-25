import java.util.Scanner;
public class INTROEjercicio5 {
    public static void main(String[] args) {
        double valor1, valor2, valor3;
        double resultado;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("primer numero: ");
        valor1 = sc.nextDouble();
    
        System.out.println("segundo numero: ");
        valor2 = sc.nextDouble();

        System.out.println("tercero numero: ");
        valor3 = sc.nextDouble();

        resultado = (valor1 + valor2 + valor3)/3;
        System.out.println("el promedio de los tres numeros anteriormente ingresados es: " + resultado);
    
        
        sc.close();
    }
}

