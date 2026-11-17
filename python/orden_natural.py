class Personaje:
    # ...
    def __lt__(self, o):
        return self.nivel < o.nivel

lista.sort()   # usa __lt__
