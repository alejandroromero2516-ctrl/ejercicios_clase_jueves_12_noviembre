"""HashMap: operaciones esenciales (equivalente a JavaHashMap.java)."""
import sys

sys.stdout.reconfigure(encoding="utf-8")

puntos = {}

puntos["Aria"] = 120
puntos["Borin"] = 80
puntos["Aria"] = 150                    # reemplaza el valor

print(puntos.get("Aria"))               # 150
print(puntos.get("Zed", 0))             # 0
print("Borin" in puntos)                # True

puntos.setdefault("Cael", 10)
puntos["Cael"] = puntos.get("Cael", 0) + 5   # equivalente a merge
puntos.pop("Borin")                     # elimina

for clave, valor in puntos.items():
    print(f"{clave} = {valor}")
