from dataclasses import dataclass


@dataclass(frozen=True)
class Coordenada:
    x: int
    y: int
