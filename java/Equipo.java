import java.util.ArrayList;
import java.util.List;

/**
 * Un Equipo TIENE muchos Personajes (relacion 1..N).
 *
 * La lista es un detalle interno (composicion): quien use la clase
 * debe agregar o consultar a traves de metodos, no tocar la lista.
 */
public class Equipo {

    private final List<Personaje> miembros = new ArrayList<>();

    public void agregar(Personaje p) {
        miembros.add(p);
    }

    /**
     * Devuelve una copia inmutable para no exponer el estado interno.
     */
    public List<Personaje> getMiembros() {
        return List.copyOf(miembros);
    }
}
