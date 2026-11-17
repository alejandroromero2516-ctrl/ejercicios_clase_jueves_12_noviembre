puntos = {}

puntos["Aria"] = 120
puntos["Borin"] = 80
puntos["Aria"] = 150                            # reemplaza el valor
puntos.get("Aria")                              # 150
puntos.get("Zed", 0)                            # 0
"Borin" in puntos                               # True
puntos.setdefault("Cael", 10)
puntos["Cael"] = puntos.get("Cael", 0) + 5      # 15
puntos.pop("Borin")

for clave, valor in puntos.items():
    print(f"{clave} = {valor}")
