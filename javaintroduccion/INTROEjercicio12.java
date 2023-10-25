import java.util.Scanner;
public class INTROEjercicio12 {
    public static void main(String[] args) {  
        double vel1, vel2, distancia, tiempo;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("ingresa la velocidad 1 en Km/h: ");
        vel1 = sc.nextDouble();
      
        System.out.println("ingresa la velocidad 2 en Km/h: ");
        vel2 = sc.nextDouble();
      
        System.out.println("ingresa la distancia en Km: ");
        distancia = sc.nextDouble();
      
        tiempo = (vel2 > vel1) ? (distancia/(vel2 - vel1)) : (distancia/(vel1 - vel2));
        tiempo = tiempo * 60 ;
        System.out.println("tiempo de encuentro es de : " + tiempo + " minutos");
        sc.close();
    }
}