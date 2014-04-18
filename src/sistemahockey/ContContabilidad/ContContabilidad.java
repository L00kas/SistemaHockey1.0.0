package sistemahockey.ContContabilidad;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lucas Dei Castelli
 *         Leando Witzke
 *         Mauricio Nudelman
 */
public class ContContabilidad {
    private Set<ConceptoEgreso> conceptosEgresos = new TreeSet();
    private Set<ConceptoIngreso> conceptosIngresos = new TreeSet();
    private Set<IngresoOtro> ingresosOtros = new TreeSet();
    private Set<Egreso> egresos = new TreeSet();
    private Set<ConceptoDeportivo> conceptosDeportivos = new TreeSet();
}
