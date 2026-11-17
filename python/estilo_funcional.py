# 3) removeIf (mas simple)
lista = [p for p in lista if p.get_nivel() >= 5]

# 4) Filtrar, transformar, agrupar
fuertes = [p.get_nombre() for p in lista if p.get_nivel() >= 10]

niveles = [p.get_nivel() for p in lista]
prom = sum(niveles) / len(niveles) if niveles else 0
