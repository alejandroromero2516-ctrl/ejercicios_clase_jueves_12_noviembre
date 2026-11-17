import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private final List<Personaje> miembros = new ArrayList<>();

    public void agregar(Personaje p) {
        miembros.add(p);
    }
    public List<Personaje> getMiembros() {
        return List.copyOf(miembros);
    }
}
