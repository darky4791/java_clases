public class CambioValor {
    public static void main(String[] args) {  
        int a, b;
        int temp;
        
        a = 5 ;
        b = 7 ;
    

        temp = b;
        b = a;
        a = temp ;

        System.out.println("valor de b: " + b);
        System.out.println("valor de a: " + a);
      
    }
} 
