package ejercicio01;

import java.util.Scanner;

/**
 *
 * @author docente
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("Ingresar número: ");
        x = sc.nextInt();
        System.out.println("Raiz cuadrada: "+Math.sqrt(x));
    }
    
}
