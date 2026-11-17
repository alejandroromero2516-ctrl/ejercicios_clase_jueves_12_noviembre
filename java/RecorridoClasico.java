// 1) for-each (lo mas comun)
for (Personaje p : equipo.getMiembros()) {
    System.out.println(p.getNombre());
}

// 2) Iterator: permite borrar al recorrer
Iterator<Personaje> it = lista.iterator();
while (it.hasNext()) {
    if (it.next().getNivel() < 5) it.remove();
}
