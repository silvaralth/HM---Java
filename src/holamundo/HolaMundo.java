/*
 * Autor     : Sergio Ballen
 * COD       : 1629770 - 2711
 * Created by Cocoa on 25/02/17.
 */
package holamundo;
import java.util.Scanner;

public class HolaMundo {
    
    public static void main(String[] args) {
	System.out.println("Hola hola ;) ");

        Scanner lector;
        lector = new Scanner (System.in);
		
        String valor;
   
        do {
            System.out.println("Dame un numero, que yo soy todo un adivino ... ");
            valor = lector.nextLine();

            if (validacionSigno(valor) == true){
                if (valor.charAt(0) == '+') {
                    String newValor = valor.substring (1);
                    System.out.println("El numero que me diste fue: " + newValor + " :P \nChao chao.\n");
                } else {
                    System.out.println("El numero que me diste fue: " + valor + " :P \nChao chao.\n");
                }
            } else {
                System.out.println("No me diste ningun numero :(");
            }
        } while (validacionSigno(valor) == false);
        
        lector.close();
    }
        
    public static boolean validacionSigno (String var) {
        boolean resultado = false;
        String signo = String.valueOf(var.charAt(0));
        
        if ( "-".equals(signo) || "+".equals(signo)){//?
            resultado = validacionNumerica(var, 1);
        } else {
            resultado = validacionNumerica(var, 0);
        }
        return resultado;       
    }
    
    public static boolean validacionNumerica (String var, int posicion) {
        boolean resultado = false;
        double size = var.length();
    
        for (int i = posicion; i < size ; i++) {
            if ( size >= 1 && Character.isDigit(var.charAt(i)) ){
                resultado = true;
            } else {
                resultado = false;
                break;
            }
        }
        return resultado;
    }
    
}