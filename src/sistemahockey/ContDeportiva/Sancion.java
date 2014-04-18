package sistemahockey.ContDeportiva;

import java.util.Date;
import sistemahockey.ContDeportiva.Tarjeta.Tarjeta;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Sancion {
    private SancionTribunal unaSancionTribunal;
    private Tarjeta unaTarjeta;
    private Partido unPartido;
    private Date Fecha;
    private boolean esperandoResolucion;
}
