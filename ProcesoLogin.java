import java.util.Scanner;
public class ProcesoLogin {
    public static void main(String[] args) {  
        String Usuario , user;
        String Password, pass;

        Usuario = "darky";
        Password = "abcd";

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el usuario: ");
        user = sc.nextLine();
      
        System.out.println("Introduce la contraseña: ");
        pass = sc.nextLine();
        
       
        //para comparar dos Strings se necesita el comando ==>    .0equals()
        if (Usuario.equals(user))  {
            if (Password.equals(pass))
            System.out.println("ingresaste satisfactoriamente al programa");
            else 
            System.out.println("la contraseña es erronea");
        }
        else {System.out.println("no pudiste ingresar al programa");}

        sc.close();
    }
}