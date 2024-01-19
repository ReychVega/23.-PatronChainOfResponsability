
package chainofresponsability;

import Domain.ManejaTexto;
import Domain.ManejadorConcreto;
import Domain.ManejadorXML;
import java.util.Scanner;

/**
 *
 * @author reych
 */
public class ChainOfResponsability {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {

       ManejadorConcreto manejadorTexto = new ManejaTexto();
        ManejadorConcreto manejadorXML = new ManejadorXML();

        manejadorTexto.establecerSiguiente(manejadorXML);

        // Simulaciones
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el formato del archivo (txt, csv, xml): ");
        String formatoArchivo = scanner.nextLine();

        manejadorTexto.manejarSolicitud(formatoArchivo);

        scanner.close();
    }
    
}
