nombres = []

nombres.append("Aria")                  # agrega al final
nombres.insert(0, "Borin")              # inserta en posicion 0
nombres[1]                              # "Aria"
nombres[1] = "Cael"                     # reemplaza
nombres.remove("Borin")                 # por valor
nombres.pop(0)                          # por indice
len(nombres)                            # cantidad
"Cael" in nombres                       # True
nombres.index("Cael")                   # posicion o ValueError
not nombres                             # False
nombres.clear()                         # vacia
