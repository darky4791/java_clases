import java.util.Scanner;

public class potencia2 {

    public static double potencia(double base, int exponente){
        double resultado=1;
        for(int i=0; i < exponente; i++){
            resultado =resultado * base;
        }
        return resultado;
    }
    public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);

        double base;
        int exponente;
        double resultado;

        try{
            System.out.println("Dime la base: ");
            base = Double.parseDouble(sc.nextLine());

            System.out.println("Dime la base: ");
            base = Integer.parseInt(sc.nextLine());
        } catch (Exception e){
            System.out.println("la base debe de ser un double y el exponente un entero");
        }

    }    
}
