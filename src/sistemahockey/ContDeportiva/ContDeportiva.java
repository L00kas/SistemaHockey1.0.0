package sistemahockey.ContDeportiva;

import sistemahockey.ContDeportiva.Tarjeta.Tarjeta;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class ContDeportiva {
    private Set<Torneo> torneos = new TreeSet();
    private Set<Categoria> categorias = new TreeSet();
    private Set<Sancion> sanciones = new TreeSet();
}
