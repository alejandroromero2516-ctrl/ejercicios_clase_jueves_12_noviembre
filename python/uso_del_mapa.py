mapa = {}
mapa[Coordenada(2, 3)] = aria

# Sin __eq__ y __hash__ esto daria KeyError
mapa[Coordenada(2, 3)]  # aria

# Agrupar objetos por categoria
por_clase = {}
por_clase.setdefault("Mago", []).append(aria)
