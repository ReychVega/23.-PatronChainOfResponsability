package Domain;

/**
 *
 * @author reych
 */
public class ManejadorConcreto implements Manejador{
    //sirve como auxiliar para pasar de objeto
    private Manejador siguiente;

    public void establecerSiguiente(Manejador siguiente) {
        this.siguiente = siguiente;
    }

    
    @Override
    public void manejarSolicitud(String formato) {
        if (siguiente != null) {
            siguiente.manejarSolicitud(formato);
        }
    } 
}
