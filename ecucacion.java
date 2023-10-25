import java.util.Scanner; //Importar la clase para poder usarla

public class ecucacion {
    public static void main(String[] args) {
        double cateto1, cateto2, hipotenusa;

        //Crear el objeto Scanner para leer de teclado
        Scanner sc = new Scanner(System.in);
        cateto1 = sc.nextDouble();
        cateto2 = sc.nextDouble();

        //Math.sqrt te devuelve la raiz cuadrada
        //Math.pow te devuelve la potencia (numero,elevado)
        hipotenusa=Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
       
        System.out.println("La hipotenusa es: " + hipotenusa);

        //cerrar la entrada del teclado
        sc.close();
    }
    
}
