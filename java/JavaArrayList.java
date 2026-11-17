import java.util.ArrayList;
import java.util.List;

public class JavaArrayList {

    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Aria");
        nombres.add(0, "Borin");
        System.out.println(nombres.get(1));

        nombres.set(1, "Cael");

        System.out.println(nombres.size());
        System.out.println(nombres.contains("Cael"));
        System.out.println(nombres.indexOf("Cael"));
        System.out.println(nombres.isEmpty());

        nombres.remove("Borin");
        nombres.remove(0);
        System.out.println("Despues de borrar: " + nombres);

        nombres.clear();
        System.out.println("Lista vacia: " + nombres);
    }
}
