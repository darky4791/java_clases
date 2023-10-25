import java.util.Scanner;
public class INTROEjercicio6 {
    public static void main(String[] args) {  
        int valor1 ,horas , minutos;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("cantidad de minutos a convertir : ");
        valor1 = sc.nextInt();
    
        horas = valor1/60;
        minutos = valor1%60;

        System.out.println("son " + horas + " horas y " + minutos + " minutos papi xd");
    
        
        sc.close();
    }
}