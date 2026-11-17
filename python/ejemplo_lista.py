"""ArrayList: operaciones esenciales (equivalente a JavaArrayList.java)."""
import sys

sys.stdout.reconfigure(encoding="utf-8")

nombres = []

nombres.append("Aria")          # agrega al final
nombres.insert(0, "Borin")      # inserta en posicion 0
print(nombres[1])               # "Aria"

nombres[1] = "Cael"             # reemplaza -> ["Borin", "Cael"]

print(len(nombres))             # 2 (cantidad)
print("Cael" in nombres)        # True
print(nombres.index("Cael"))    # 1 (posicion; lanza ValueError si no existe)
print(not nombres)              # False (el equivalente a isEmpty)

nombres.remove("Borin")         # por valor -> ["Cael"]
nombres.pop(0)                  # por indice -> []
print("Despues de borrar:", nombres)

nombres.clear()                 # vacia
print("Lista vacia:", nombres)
