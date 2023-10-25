import java.util.Scanner;

public class Añobisiesto {
    public static void main(String[] args) {  
        double año;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el año: ");
        año = sc.nextDouble();


        
        if ((año % 4 == 0) && (año % 100 != 0)) {
            System.out.println("el año es bisiesto");
        }
        else if ((año % 400 == 0) && (año % 100 == 0)){
            System.out.println("el año es bisiesto");
        }
        else {
            System.out.println("el año no es bisiesto");
        }
    
        sc.close();
     
    }
}
