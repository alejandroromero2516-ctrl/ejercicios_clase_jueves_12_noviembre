import sys

sys.stdout.reconfigure(encoding="utf-8")

from collections import defaultdict

from personaje import Personaje

lista = [
    Personaje("Aria", "Mago", 15),
    Personaje("Borin", "Enano", 3),
    Personaje("Cael", "Arquero", 9),
    Personaje("Dara", "Mago", 12),
]

sin_debiles = [p for p in lista if p.nivel >= 5]
print("Sin nivel < 5:", sin_debiles)

fuertes = [p.nombre for p in lista if p.nivel >= 10]
print("Fuertes:", fuertes)

niveles = [p.nivel for p in lista]
promedio = sum(niveles) / len(niveles) if niveles else 0
print("Promedio de nivel:", promedio)

por_clase = defaultdict(list)
for p in lista:
    por_clase[p.clase].append(p.nombre)
print("Por clase:", dict(por_clase))
