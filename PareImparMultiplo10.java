import java.util.Scanner;
public class PareImparMultiplo10 {
    public static void main(String[] args) {  
        int var;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la variable que desees: ");
        var = sc.nextInt();
      
        var = var % 2;
        //para comparar dos Strings se necesita el comando ==>    .0equals()
        if (var == 0)  {
            System.out.println("el numero es par");
                if (var < 10){
                    System.out.println("es menor de 10");
                }else if( var % 10 == 0) {
                    System.out.println("nes multiplo de 10");
            }
        }else { 
            System.out.println("el numero es impar y no es multiplo de 10");
        }

        sc.close();
     
    }
}
