import sys

sys.stdout.reconfigure(encoding="utf-8")

nombres = []

nombres.append("Aria")
nombres.insert(0, "Borin")
print(nombres[1])

nombres[1] = "Cael"

print(len(nombres))
print("Cael" in nombres)
print(nombres.index("Cael"))
print(not nombres)

nombres.remove("Borin")
nombres.pop(0)
print("Despues de borrar:", nombres)

nombres.clear()
print("Lista vacia:", nombres)
