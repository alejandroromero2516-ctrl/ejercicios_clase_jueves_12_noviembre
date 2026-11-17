import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class JavaStreams {

    public static void main(String[] args) {
        List<Personaje> lista = new ArrayList<>(List.of(
                new Personaje("Aria", "Mago", 15),
                new Personaje("Borin", "Enano", 3),
                new Personaje("Cael", "Arquero", 9),
                new Personaje("Dara", "Mago", 12)
        ));

        List<Personaje> sinDebiles = new ArrayList<>(lista);
        sinDebiles.removeIf(p -> p.getNivel() < 5);
        System.out.println("Sin nivel < 5: " + sinDebiles);

        List<String> fuertes = lista.stream()
                .filter(p -> p.getNivel() >= 10)
                .map(Personaje::getNombre)
                .toList();
        System.out.println("Fuertes: " + fuertes);

        double prom = lista.stream()
                .mapToInt(Personaje::getNivel)
                .average().orElse(0);
        System.out.println("Promedio de nivel: " + prom);

        Map<String, List<String>> porClase = lista.stream()
                .collect(Collectors.groupingBy(
                        Personaje::getClase,
                        Collectors.mapping(Personaje::getNombre, Collectors.toList())));
        System.out.println("Por clase: " + porClase);
    }
}
