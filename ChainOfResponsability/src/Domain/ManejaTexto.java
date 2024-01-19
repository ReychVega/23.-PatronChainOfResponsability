/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author reych
 */
public class ManejaTexto  extends ManejadorConcreto {
    @Override
    public void manejarSolicitud(String formato) {
        if (formato.equals("txt")) {
            System.out.println("Leyendo archivo de tipo texto.");
        } else {
            super.manejarSolicitud(formato);
        }
    }

}
