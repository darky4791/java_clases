public class Ejercicio1Prog {
    public static void main(String[] args) {
        int A = 6 , B = 2 , C = 3, resultado;

        // apartado a.
        resultado = (A * C) % C ;
        System.out.println(resultado);
         
        // apartado b.
        resultado = A * B / C ;
        System.out.println(resultado);
        
        // apartado c. 
        resultado = (C % B) + (C * B);
        System.out.println(resultado);

        // apartado d. 
        resultado = A % (A * B * C / (B + C));
        System.out.println(resultado);

        // apartado e.
        resultado = B * B + C - B * (A % B);
        System.out.println(resultado);

    }

}
