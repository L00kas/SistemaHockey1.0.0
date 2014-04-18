package sistemahockey.ContContabilidad;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class Deuda {
    private ConceptoDeportivo unConceptoDeportivo;
    private String observacion;
    private double monto;
    private Set<PagoDeuda> pagosDeudas = new TreeSet();
    private boolean cancelo;
}
