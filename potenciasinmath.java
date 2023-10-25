import java.util.Scanner;

public class potenciasinmath {
    public static void main(String[] args) {
        
        double base, exponente;
        double potencia=1;

        Scanner sc = new Scanner(System.in);


        System.out.println("ingrese la base");
        base = sc.nextInt();

        System.out.println("ingrese el exponente");
        exponente = sc.nextInt();

        for (int i=0; i<exponente; i++){
            potencia= potencia * base;
           System.out.println(potencia);  
        }
       
    }
}
