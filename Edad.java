import java.util.Scanner;
public class Edad {
    public static void main(String[] args) {  
        int var;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la edad");
        var = sc.nextInt();
      
        
        //para comparar dos Strings se necesita el comando ==>    .0equals()
        if ((var > 1 ) && (var <= 5))  {
            System.out.println("niño");
        }else if  ((var >= 6 ) && (var <= 12))  {
            System.out.println("chaval");
        }else if  ((var >= 13 ) && (var <= 18))  {
            System.out.println("Adolescente");
        }else if  ((var >= 19 ) && (var <= 25))  {
            System.out.println("lo mejor");
        }else if  ((var >= 26 ) && (var <= 45))  {
            System.out.println("Hombre");
        }else if  ((var >= 46 ) && (var <= 65))  {
            System.out.println("Carroza");
        }else if  (var > 65 )   {
            System.out.println("Viejo");
        }

        sc.close();
        
    }
}
