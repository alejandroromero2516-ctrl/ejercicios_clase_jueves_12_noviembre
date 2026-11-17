# 1) for-each (lo mas comun)
for p in equipo.get_miembros():
    print(p.get_nombre())

# 2) Borrar al recorrer: en Python se filtra en otra lista
lista = [p for p in lista if p.get_nivel() >= 5]
