from dataclasses import dataclass


@dataclass
class Personaje:

    nombre: str
    clase: str = "Aventurero"
    nivel: int = 1

    def __lt__(self, otro):
        return self.nivel < otro.nivel

    def __str__(self):
        return f"{self.nombre} ({self.clase}, nivel {self.nivel})"
