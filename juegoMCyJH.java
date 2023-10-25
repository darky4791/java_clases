import java.util.Scanner;

public class juegoMCyJH {
    public static void main(String[] args) {
        int cantidad, tiradaCubitus, tiradaHomerus,puntosCubitus,puntosHomerus;
        Scanner sc = new Scanner(System.in);

        System.out.println("Número de turnos que desea jugar");
        cantidad = sc.nextInt();

        int victoriasCubitus = 0;
        int victoriasHomerus = 0;
        puntosCubitus= 0;
        puntosHomerus=0;
        int empate=0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Turno de Cubitus");
            tiradaCubitus = generartirada();
            System.out.println("Cubitus tiró: " + tiradaCubitus);

            System.out.println("Turno de Homerus");
            tiradaHomerus = generartirada();
            System.out.println("Homerus tiró: " + tiradaHomerus);

            if (tiradaCubitus > tiradaHomerus) {
                victoriasCubitus++;
                puntosCubitus+=tiradaCubitus+empate;
                
                puntosHomerus+=tiradaHomerus;
                empate=0;
                System.out.println("Cubitus gana este turno!");
                
            } else if (tiradaHomerus > tiradaCubitus) {
                victoriasHomerus++;
                puntosHomerus+=tiradaHomerus+empate;

                puntosCubitus+=tiradaCubitus;
                empate=0;
                System.out.println("Homerus gana este turno!");

            } else if (tiradaCubitus == tiradaHomerus){
                System.out.println("Empate en este turno!");
                empate= tiradaCubitus+tiradaHomerus;


            }
        }

            System.out.println("Resultados:");
            System.out.println("Cubitus gano " + victoriasCubitus + " veces.");
            System.out.println("Homerus gano " + victoriasHomerus + " veces.");
            System.out.println("Homerus tuvo un puntaje de: " + puntosHomerus);
            System.out.println("Cubitus tuvo un puntaje de: " + puntosCubitus);
        if (victoriasCubitus > victoriasHomerus) {
            System.out.println("Cubitus es el ganador!");
        } else if (victoriasHomerus > victoriasCubitus) {
            System.out.println("Homerus es el ganador!");
        } else {
            System.out.println("Empate en el juego!");
        }
    }

    public static int generartirada() {
        int generartirada = (int)(Math.random() * 10 + 1);
        return generartirada;
    }
}