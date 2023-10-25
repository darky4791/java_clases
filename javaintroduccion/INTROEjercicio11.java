import java.util.Scanner;
public class INTROEjercicio11 {
    public static void main(String[] args) {  
        int unidades, decenas, numero;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa un numero de dos cifras que desea invertir : ");
        numero = sc.nextInt();
      
        decenas= numero / 10;
        unidades = numero % 10;

        System.out.println("numero invertido: " + unidades + decenas);

        sc.close();
    }
}