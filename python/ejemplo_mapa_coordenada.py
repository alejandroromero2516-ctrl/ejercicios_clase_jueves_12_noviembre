"""Uso del diccionario con objetos como clave y agrupacion por categoria.

Equivalente a JavaMapaCoordenada.java.
"""
import sys

sys.stdout.reconfigure(encoding="utf-8")

from coordenada import Coordenada
from personaje import Personaje

aria = Personaje("Aria", "Mago", 15)
zed = Personaje("Zed", "Guerrero", 9)

mapa = {}
mapa[Coordenada(2, 3)] = aria

# Sin __eq__ y __hash__ esto daria KeyError (en Java, null)
print(mapa[Coordenada(2, 3)])       # Aria (Mago, nivel 15)

# Agrupar objetos por categoria
por_clase = {}
por_clase.setdefault("Mago", []).append(aria)
por_clase.setdefault("Guerrero", []).append(zed)

print(por_clase)
