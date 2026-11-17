import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaOrdenamiento {

    public static void main(String[] args) {
        List<Personaje> lista = new ArrayList<>(List.of(
                new Personaje("Zed", "Guerrero", 8),
                new Personaje("Aria", "Mago", 15),
                new Personaje("Borin", "Enano", 3),
                new Personaje("Cael", "Arquero", 8)
        ));

        Collections.sort(lista);
        System.out.println("Orden natural: " + lista);

        lista.sort(Comparator
                .comparing(Personaje::getNombre));
        System.out.println("Por nombre: " + lista);

        lista.sort(Comparator
                .comparingInt(Personaje::getNivel)
                .reversed()
                .thenComparing(Personaje::getNombre));
        System.out.println("Nivel descendente y nombre: " + lista);
    }
}
