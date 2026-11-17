import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Recorrer, filtrar y buscar: cuatro formas de iterar en Java.
 */
public class JavaRecorridos {

    public static void main(String[] args) {
        Equipo equipo = new Equipo();
        equipo.agregar(new Personaje("Aria", "Mago", 15));
        equipo.agregar(new Personaje("Borin", "Enano", 4));
        equipo.agregar(new Personaje("Cael", "Arquero", 9));

        // 1) for-each (lo mas comun)
        for (Personaje p : equipo.getMiembros()) {
            System.out.println(p.getNombre());
        }

        // 2) Iterator: permite borrar al recorrer
        List<Personaje> lista = new ArrayList<>(equipo.getMiembros());
        Iterator<Personaje> it = lista.iterator();
        while (it.hasNext()) {
            if (it.next().getNivel() < 5) it.remove();
        }
        System.out.println("Sin debiles (Iterator): " + lista);

        // 3) removeIf (mas simple)
        List<Personaje> copia = new ArrayList<>(equipo.getMiembros());
        copia.removeIf(p -> p.getNivel() < 5);
        System.out.println("Sin debiles (removeIf): " + copia);

        // 4) Streams: filtrar, transformar, agrupar
        List<String> fuertes = equipo.getMiembros().stream()
                .filter(p -> p.getNivel() >= 10)
                .map(Personaje::getNombre)
                .toList();
        System.out.println("Fuertes: " + fuertes);

        double prom = equipo.getMiembros().stream()
                .mapToInt(Personaje::getNivel)
                .average().orElse(0);
        System.out.println("Promedio de nivel: " + prom);
    }
}
