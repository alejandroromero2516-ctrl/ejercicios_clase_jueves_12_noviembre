public class Personaje
        implements Comparable<Personaje> {
    // ...
    @Override
    public int compareTo(Personaje o) {
        return Integer.compare(nivel, o.nivel);
    }
}

Collections.sort(lista);   // usa compareTo
