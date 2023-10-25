public class EjercicioIntroduccion4{
    public static void main(String[] args) {
      
        boolean resultado;
         
        resultado = (3<=7) &&(7<=7);
        System.out.println("la respuesta a.: " + resultado); 

        resultado = !((-8 > 1) && (3<=4));
        System.out.println("la respuesta a.: " + resultado); 

        resultado = "Hola" == "Hola ";
        System.out.println("la respuesta a.: " + resultado); 

        resultado = ((2<=5) && (3>=6)) || (2>-1);
        System.out.println("la respuesta a.: " + resultado); 

        resultado = ((2<=5) || (3 >= 6)) && (2>-1);
        System.out.println("la respuesta a.: " + resultado); 

    }
}
