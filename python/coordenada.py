from dataclasses import dataclass


@dataclass(frozen=True)
class Coordenada:
    """Coordenada (x, y) usada como clave de un diccionario.

    frozen=True genera __eq__ y __hash__, el equivalente a implementar
    equals y hashCode en Java. Sin ellos no se podria usar como clave.
    """

    x: int
    y: int
