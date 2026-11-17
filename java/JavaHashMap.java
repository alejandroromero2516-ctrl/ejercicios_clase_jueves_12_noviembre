import java.util.HashMap;
import java.util.Map;

/**
 * HashMap: operaciones esenciales con claves String.
 */
public class JavaHashMap {

    public static void main(String[] args) {
        Map<String, Integer> puntos = new HashMap<>();

        puntos.put("Aria", 120);
        puntos.put("Borin", 80);
        puntos.put("Aria", 150);                    // reemplaza el valor

        System.out.println(puntos.get("Aria"));             // 150
        System.out.println(puntos.getOrDefault("Zed", 0));  // 0
        System.out.println(puntos.containsKey("Borin"));    // true

        puntos.putIfAbsent("Cael", 10);
        puntos.merge("Cael", 5, Integer::sum);      // 15
        puntos.remove("Borin");

        for (Map.Entry<String, Integer> e : puntos.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
