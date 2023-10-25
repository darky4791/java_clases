import java.util.Scanner;
public class ColoresCombinados {
    public static void main(String[] args) {  
        String color1, color2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un color: ");
        color1 = sc.nextLine();
      
        System.out.println("Introduce unn color: ");
        color2 = sc.nextLine();

        
        //para comparar dos Strings se necesita el comando ==>    .0equals()
        if ((color1 .equals("r") && color2 .equals("b") || (color1 .equals('b') && color2 .equals('r'))))  {
            System.out.println("magenta");
        }
        else if ((color1 .equals('r') && color2 .equals('g')) || (color1 .equals('g') && color2 .equals('r'))){ 
            System.out.println("amarillo");
        }
        else if (color1 .equals('r') && color2 .equals('r')){
            System.out.println("rojo");
        }
        else if ((color1 .equals('b') && color2 .equals('r')) || (color1 .equals('r') && color2 .equals('b')))  {
            System.out.println("magenta");
        }
        else if ((color1 .equals('b') && color2 .equals('g')) || (color1 .equals('g') && color2 .equals('b'))){ 
            System.out.println("cyan");
        }
        else if (color1 .equals('b') && color2 .equals('b')){
            System.out.println("azul");
        }
        else if ((color1 .equals('g') && color2 .equals('b')) || (color1 .equals('b') && color2 .equals('g')))  {
            System.out.println("cyan");
        }
        else if ((color1 .equals('r') && color2 .equals('g')) || (color1 .equals('g') && color2 .equals('r'))){ 
            System.out.println("amarillo");
        }
        else if (color1 .equals('g') && color2 .equals('g')){
            System.out.println("verde");
        }
        else{
            System.out.println("combinacion incorrecta");
            
        }
        
        
    }
}