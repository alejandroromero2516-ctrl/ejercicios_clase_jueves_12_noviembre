import sys

sys.stdout.reconfigure(encoding="utf-8")

puntos = {}

puntos["Aria"] = 120
puntos["Borin"] = 80
puntos["Aria"] = 150

print(puntos.get("Aria"))
print(puntos.get("Zed", 0))
print("Borin" in puntos)

puntos.setdefault("Cael", 10)
puntos["Cael"] = puntos.get("Cael", 0) + 5
puntos.pop("Borin")

for clave, valor in puntos.items():
    print(f"{clave} = {valor}")
