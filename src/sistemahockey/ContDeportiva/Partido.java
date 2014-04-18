package sistemahockey.ContDeportiva;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;
import sistemahockey.ContDeportiva.Tarjeta.Tarjeta;
import sistemahockey.ContEntidades.Arbitro;
import sistemahockey.ContEntidades.Cancha;
import sistemahockey.ContEntidades.Equipo;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Partido {
    private Date dia;
    private Equipo unEquipoLocal;
    private Equipo unEquipoVisitante;
    private Cancha unaCancha;
    private Arbitro unArbitro1;
    private Arbitro unArbitro2;
    private String ayudanteDeMesaLocal;
    private String ayudanteDeMesaVisitante;
    private String observaciones;
    private Set<Gol> goles = new TreeSet();
    private Set<Tarjeta> tarjetas = new TreeSet();
}
