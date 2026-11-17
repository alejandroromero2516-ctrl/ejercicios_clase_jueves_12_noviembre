# Orden alterno sin tocar la clase
lista.sort(key=lambda p: p.get_nombre())

# Por nivel descendente, luego nombre
lista.sort(key=lambda p: (-p.get_nivel(), p.get_nombre()))
