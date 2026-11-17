class Equipo:

    def __init__(self):
        self._miembros = []

    def agregar(self, personaje):
        self._miembros.append(personaje)

    @property
    def miembros(self):
        return tuple(self._miembros)
