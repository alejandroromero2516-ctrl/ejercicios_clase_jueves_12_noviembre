"""Recorrer, filtrar y buscar: varias formas de iterar en Python.

Equivalente a JavaRecorridos.java.
"""
import sys

sys.stdout.reconfigure(encoding="utf-8")

from equipo import Equipo
from personaje import Personaje

equipo = Equipo()
equipo.agregar(Personaje("Aria", "Mago", 15))
equipo.agregar(Personaje("Borin", "Enano", 4))
equipo.agregar(Personaje("Cael", "Arquero", 9))

# 1) for-each (lo mas comun)
for p in equipo.miembros:
    print(p.nombre)

# 2) Recorrer y borrar: en Python se filtra creando otra lista
lista = [p for p in equipo.miembros if p.nivel >= 5]
print("Sin debiles (lista nueva):", lista)

# 3) filter (equivalente a removeIf)
copia = list(filter(lambda p: p.nivel >= 5, equipo.miembros))
print("Sin debiles (filter):", copia)

# 4) Comprension de listas: filtrar y transformar
fuertes = [p.nombre for p in equipo.miembros if p.nivel >= 10]
print("Fuertes:", fuertes)

niveles = [p.nivel for p in equipo.miembros]
promedio = sum(niveles) / len(niveles) if niveles else 0
print("Promedio de nivel:", promedio)
