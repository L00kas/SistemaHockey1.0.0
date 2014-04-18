package sistemahockey.ContEntidades;

import java.util.Set;
import java.util.TreeSet;
import sistemahockey.ContContabilidad.Deuda;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Equipo {
    private String nombre;
    private Indumentaria principal;
    private Indumentaria alternativa;
    private CuerpoTecnico dt;
    private CuerpoTecnico preparadorFisico;
    private CuerpoTecnico ayudanteCampo;
    private Socia capitana;
    private Socia capitanaSuplente;
    private Socia delegada;
    private Socia delegadaSuplente;
    private Set<Socia> plantel = new TreeSet();
    private Set<Deuda> deudas = new TreeSet();
    private boolean borradoLogico;
}
