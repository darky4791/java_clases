import java.util.Scanner;

public class Divsioncero {
    public static void main(String[] args) {  
        float num1, num2, div;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el numero1: ");
        num1 = sc.nextFloat();

        System.out.println("Introduce el numero2: ");
        num2 = sc.nextFloat();
        
        div = num1 / num2;

        if (num2 == 0) {
            System.out.println("el numero 2 es invalido");
        }
        else {
            System.out.println("la division es:" + div);
        }
        

        sc.close();
     
    }
}
