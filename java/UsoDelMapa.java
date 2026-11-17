Map<Coordenada, Personaje> mapa =
        new HashMap<>();

mapa.put(new Coordenada(2, 3), aria);

// Sin equals/hashCode esto daria null
mapa.get(new Coordenada(2, 3)); // aria

// Agrupar objetos por categoria
Map<String, List<Personaje>> porClase =
        new HashMap<>();
porClase
        .computeIfAbsent("Mago", k -> new ArrayList<>())
        .add(aria);
