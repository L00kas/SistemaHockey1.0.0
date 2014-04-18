
package sistemahockey.ContEntidades;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import sistemahockey.ContDeportiva.Sancion;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Localidad unaLocalidad;
    private String domicilio;
    private String email;
    private String celular;
    private String telFijo;
    private Date anoIngreso;
    private Set<Sancion> sanciones = new TreeSet();
    private boolean borradoLogico;
}
