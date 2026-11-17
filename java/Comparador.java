// Orden alterno sin tocar la clase
lista.sort(Comparator
        .comparing(Personaje::getNombre));

// Por nivel descendente, luego nombre
lista.sort(Comparator
        .comparingInt(Personaje::getNivel)
        .reversed()
        .thenComparing(Personaje::getNombre));
