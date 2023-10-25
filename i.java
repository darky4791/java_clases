import java.util.Scanner;

public class i{
    public static void main(String[] args) {  
        int a , b , c ;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el valor de a: ");
        a = sc.nextInt();

        System.out.println("Introduce el valor de b: ");
        b = sc.nextInt();

        System.out.println("Introduce el valor de c: ");
        c = sc.nextInt();

        
        if ((a > b) && (a > c)) {
            System.out.println("el primer numero ingresado es el mayor");
        }

        else if ((b > a) && (b > c)) {
            System.out.println("el segundo numero ingresado es el mayor");
        }

        else if ((c > b) && (c > a)) {
            System.out.println("el tercero numero ingresado es el mayor");
        }
    
        sc.close();
     
    }
}
