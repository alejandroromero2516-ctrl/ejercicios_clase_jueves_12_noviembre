import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList: operaciones esenciales.
 * Lista dinamica respaldada por un arreglo redimensionable.
 */
public class JavaArrayList {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Aria");            // agrega al final
        nombres.add(0, "Borin");        // inserta en posicion 0
        System.out.println(nombres.get(1));        // "Aria"

        nombres.set(1, "Cael");         // reemplaza -> [Borin, Cael]

        System.out.println(nombres.size());           // 2 (cantidad)
        System.out.println(nombres.contains("Cael")); // true
        System.out.println(nombres.indexOf("Cael"));  // 1 (posicion o -1)
        System.out.println(nombres.isEmpty());        // false

        nombres.remove("Borin");        // por valor -> [Cael]
        nombres.remove(0);              // por indice -> []
        System.out.println("Despues de borrar: " + nombres);

        nombres.clear();                // vacia
        System.out.println("Lista vacia: " + nombres);
    }
}
