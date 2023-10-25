import java.util.Scanner ;
public class promediodenwhile {
    public static void main(String[] args) {  
        double suma = 0; 
        int contador= -1;
        double numero= -1;

        Scanner sc = new Scanner(System.in);

        while(numero != 0){
            
            System.out.println("ingrese el nunmero");
            numero = sc.nextInt();
            suma = suma + numero;
            contador++;
        }

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es:" + (suma/contador));
        sc.close();
    }
}

