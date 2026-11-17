import sys

sys.stdout.reconfigure(encoding="utf-8")

from coordenada import Coordenada
from personaje import Personaje

aria = Personaje("Aria", "Mago", 15)
zed = Personaje("Zed", "Guerrero", 9)

mapa = {}
mapa[Coordenada(2, 3)] = aria

print(mapa[Coordenada(2, 3)])

por_clase = {}
por_clase.setdefault("Mago", []).append(aria)
por_clase.setdefault("Guerrero", []).append(zed)

print(por_clase)
