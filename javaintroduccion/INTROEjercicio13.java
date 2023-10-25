import java.util.Scanner;
public class INTROEjercicio13 {
    public static void main(String[] args) {  
        int NotaFinal, Correcta, Incorrecta, Blanco;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("la cantidad de respuestas corrrectas: ");
        Correcta = sc.nextInt();
      
        System.out.println("la cantidad de respuestas incorrectas: ");
        Incorrecta = sc.nextInt();
      
        System.out.println("las respuestas en blanco: ");
        Blanco = sc.nextInt();
      
        NotaFinal = (Correcta * 5) - (Incorrecta * 1); 
        System.out.println("la nota Final del alumno sera: " + NotaFinal);
        sc.close();
    }
}