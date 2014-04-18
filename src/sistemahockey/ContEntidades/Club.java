package sistemahockey.ContEntidades;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Club {
    private String nombre;
    private String nombrePrecidente;
    private String logo;
    private Localidad unaLocalidad;
    private Set<Equipo> equipos = new TreeSet();
    private Set<Cancha> canchas = new TreeSet(); 
    private boolean borradoLogico;
}
