import java.util.Scanner;
public class PareImpar {
    public static void main(String[] args) {  
        int var;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la variable que desees: ");
        var = sc.nextInt();
      
        var = var % 2;
        //para comparar dos Strings se necesita el comando ==>    .0equals()
        if (var == 1)  {
            System.out.println("el numero es impar");
        }else { 
            System.out.println("el numero es par");
        }
        sc.close();
        
    }
}
