import java.util.Objects;

/**
 * Coordenada (x, y) usada como clave de un Map.
 *
 * IMPORTANTE: sin equals y hashCode, HashMap no puede encontrar
 * una clave "igual" creada de nuevo, y mapa.get(...) devolveria null.
 */
public class Coordenada {

    private final int x, y;

    public Coordenada(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Coordenada c)) return false;
        return x == c.x && y == c.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
