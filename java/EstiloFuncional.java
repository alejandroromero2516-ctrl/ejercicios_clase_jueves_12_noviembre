// 3) removeIf (mas simple)
lista.removeIf(p -> p.getNivel() < 5);

// 4) Streams: filtrar, transformar, agrupar
List<String> fuertes = lista.stream()
        .filter(p -> p.getNivel() >= 10)
        .map(Personaje::getNombre)
        .toList();

double prom = lista.stream()
        .mapToInt(Personaje::getNivel)
        .average().orElse(0);
