public class Personaje implements Comparable<Personaje> {

    private final String nombre;
    private final String clase;
    private int nivel;

    public Personaje(String nombre, String clase, int nivel) {
        this.nombre = nombre;
        this.clase = clase;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClase() {
        return clase;
    }

    public int getNivel() {
        return nivel;
    }

    public void subirNivel(int cantidad) {
        this.nivel += cantidad;
    }

    @Override
    public int compareTo(Personaje o) {
        return Integer.compare(nivel, o.nivel);
    }

    @Override
    public String toString() {
        return nombre + " (" + clase + ", nivel " + nivel + ")";
    }
}
