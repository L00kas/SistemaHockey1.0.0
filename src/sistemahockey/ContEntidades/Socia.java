package sistemahockey.ContEntidades;


import java.util.Set;
import java.util.TreeSet;
import sistemahockey.ContEntidades.Estados.Estado;
import sistemahockey.ContContabilidad.Deuda;
import sistemahockey.ContDeportiva.Gol;
import sistemahockey.ContDeportiva.Tarjeta.Tarjeta;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Socia extends Persona{
    private String fotoCarnet;
    private boolean exJugadora;
    private int numeroCamiseta;
    private Set<Estado> estados = new TreeSet();
    private Set<Gol> goles = new TreeSet();
    private Set<Deuda> deudas = new TreeSet();
    private Set<Pase> pases = new TreeSet();
}
