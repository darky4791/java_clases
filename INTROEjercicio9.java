import java.util.Scanner;
public class INTROEjercicio9 {
    public static void main(String[] args) {  
        double valorx1, valory1, valorx2, valory2, distancia;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("valor de x1:");
        valorx1 = sc.nextDouble();
        
        System.out.println("valor de y1:");
        valory1 = sc.nextDouble();
         
        System.out.println("valor de x2:");
        valorx2 = sc.nextDouble();
         
        System.out.println("valor de y2:");
        valory2 = sc.nextDouble();
          
        distancia = Math.sqrt(Math.pow(valorx2 - valorx1,2) + Math.pow(valory2 - valory1,2));
        System.out.println("la distancia de las cordenadas en el plano es: " + distancia);

        sc.close();
    }
}