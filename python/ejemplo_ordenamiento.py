import sys

sys.stdout.reconfigure(encoding="utf-8")

from personaje import Personaje

lista = [
    Personaje("Zed", "Guerrero", 8),
    Personaje("Aria", "Mago", 15),
    Personaje("Borin", "Enano", 3),
    Personaje("Cael", "Arquero", 8),
]

lista_ordenada = sorted(lista)
print("Orden natural:", lista_ordenada)

lista.sort(key=lambda p: p.nombre)
print("Por nombre:", lista)

lista.sort(key=lambda p: (-p.nivel, p.nombre))
print("Nivel descendente y nombre:", lista)
