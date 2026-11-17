"""Ordenar listas de objetos: orden natural vs orden externo.

Equivalente a JavaOrdenamiento.java.
"""
import sys

sys.stdout.reconfigure(encoding="utf-8")

from personaje import Personaje

lista = [
    Personaje("Zed", "Guerrero", 8),
    Personaje("Aria", "Mago", 15),
    Personaje("Borin", "Enano", 3),
    Personaje("Cael", "Arquero", 8),
]

# Orden natural (__lt__): por nivel ascendente
lista_ordenada = sorted(lista)
print("Orden natural:", lista_ordenada)

# Orden alterno sin tocar la clase (equivalente a Comparator.comparing)
lista.sort(key=lambda p: p.nombre)
print("Por nombre:", lista)

# Por nivel descendente, luego nombre
lista.sort(key=lambda p: (-p.nivel, p.nombre))
print("Nivel descendente y nombre:", lista)
