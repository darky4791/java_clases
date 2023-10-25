    import java.util.Scanner; //Importar la clase para poder usarla

public class PromedioFinal {

    public static void main(String[] args) {
        double CalParcial1EV, CalParcial2EV, CalParcial3EV, CalExFinal,CalTrabFinal, NotaFinal;
        
        Scanner sc = new Scanner(System.in);

        CalParcial1EV = sc.nextDouble();
        CalParcial2EV = sc.nextDouble();
        CalParcial3EV = sc.nextDouble();
        CalExFinal = sc.nextDouble();
        CalTrabFinal = sc.nextDouble();

        
        CalParcial1EV *= 0.55;
        CalParcial2EV *= 0.55;
        CalParcial3EV *= 0.55;
        CalExFinal *= 0.30;
        CalParcial1EV *= 0.15;

        NotaFinal = CalParcial1EV + 

       
        System.out.println("La nota final es : " + NotaFinal);

        //cerrar la entrada del teclado
        sc.close();
    }
    
}
    
}
