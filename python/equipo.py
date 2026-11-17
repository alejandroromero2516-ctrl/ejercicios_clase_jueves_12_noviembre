class Equipo:
    def __init__(self):
        self._miembros = []

    def agregar(self, p):
        self._miembros.append(p)

    def get_miembros(self):
        return tuple(self._miembros)
