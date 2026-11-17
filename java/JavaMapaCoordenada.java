import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Uso del mapa con objetos como clave y agrupacion por categoria.
 */
public class JavaMapaCoordenada {

    public static void main(String[] args) {
        Personaje aria = new Personaje("Aria", "Mago", 15);
        Personaje zed = new Personaje("Zed", "Guerrero", 9);

        Map<Coordenada, Personaje> mapa = new HashMap<>();
        mapa.put(new Coordenada(2, 3), aria);

        // Sin equals/hashCode esto daria null
        System.out.println(mapa.get(new Coordenada(2, 3))); // Aria (Mago, nivel 15)

        // Agrupar objetos por categoria
        Map<String, List<Personaje>> porClase = new HashMap<>();
        porClase
                .computeIfAbsent("Mago", k -> new ArrayList<>())
                .add(aria);
        porClase
                .computeIfAbsent("Guerrero", k -> new ArrayList<>())
                .add(zed);

        System.out.println(porClase);
    }
}
