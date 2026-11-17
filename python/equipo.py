class Equipo:
    """Un Equipo TIENE muchos Personajes (relacion 1..N).

    La lista es un detalle interno (composicion): se usa a traves de
    metodos, no tocando la lista directamente.
    """

    def __init__(self):
        self._miembros = []

    def agregar(self, personaje):
        self._miembros.append(personaje)

    @property
    def miembros(self):
        """Copia inmutable, equivalente a List.copyOf en Java."""
        return tuple(self._miembros)
