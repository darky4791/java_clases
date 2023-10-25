import java.util.Scanner;
public class Vinicultores {
    public static void main(String[] args) {  
        int A ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la base : ");
        base = sc.nextDouble();

        System.out.println("Introduce el exponente: ");
        expo = sc.nextDouble();
        

        potencianeg = Math.pow(base, 1/expo);
        if (expo > 0) {
            System.out.println("la potencia es:" + potencia);
        }
        else if (expo == 0){
            System.out.println("la potencia es: " + 1);
        }
        else if (expo < 0){
            System.out.println("la potencia con exponente negativo es: " + potencianeg);
        }
    
        sc.close();
     
    }
}
