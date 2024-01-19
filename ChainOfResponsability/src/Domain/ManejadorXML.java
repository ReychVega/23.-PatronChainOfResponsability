/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author reych
 */
public class ManejadorXML  extends ManejadorConcreto  {
    
@Override
    public void manejarSolicitud(String formato) {
        if (formato.equals("xml")) {
            System.out.println("Leyendo archivo tipo XML.");
        } else {
            super.manejarSolicitud(formato);
        }
    }
 
}
