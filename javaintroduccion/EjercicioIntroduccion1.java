public class EjercicioIntroduccion1{
    public static void main(String[] args) {
        int A, B, C, resultado;
        
        A = 6;
        B = 2;
        C = 3;

        resultado = (A*C)%C;
        System.out.println("el resultado de a.:" + resultado);
        
        resultado = A*B/C;
        System.out.println("el resultado de b.:" + resultado);
        
        resultado = C % B + C * B;
        System.out.println("el resultado de c.:" + resultado);
        
        resultado = A % (A *B * C/(B + C));
        System.out.println("el resultado de d.:" + resultado);
        
        resultado = (B * B) + C - (B *(A % B));
        System.out.println("el resultado de e.:" + resultado);
        
    }
}
