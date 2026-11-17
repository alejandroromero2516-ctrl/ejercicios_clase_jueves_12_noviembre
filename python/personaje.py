from dataclasses import dataclass


@dataclass
class Personaje:
    """Personaje del juego (equivalente a Personaje.java)."""

    nombre: str
    clase: str = "Aventurero"
    nivel: int = 1

    def __lt__(self, otro):
        """Orden natural: por nivel ascendente (equivalente a compareTo)."""
        return self.nivel < otro.nivel

    def __str__(self):
        return f"{self.nombre} ({self.clase}, nivel {self.nivel})"
