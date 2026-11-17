# Ejercicios de clase - Jueves 12 de noviembre

Ejemplos de **colecciones en POO** vistos en clase (*Listas y mapas en Java y Python*), organizados por lenguaje.

## Estructura

```
.
├── java/      Ejemplos en Java 17
└── python/    Ejemplos equivalentes en Python 3
```

## Contenido

| Tema | Java | Python |
|------|------|--------|
| ArrayList: operaciones esenciales | `JavaArrayList.java` | `ejemplo_lista.py` |
| HashMap: operaciones esenciales | `JavaHashMap.java` | `ejemplo_diccionario.py` |
| Map con objeto como clave y agrupación | `JavaMapaCoordenada.java` | `ejemplo_mapa_coordenada.py` |
| Recorrer, filtrar y buscar | `JavaRecorridos.java` | `ejemplo_recorridos.py` |
| Ordenar: `Comparable` vs `Comparator` | `JavaOrdenamiento.java` | `ejemplo_ordenamiento.py` |
| Estilo funcional: streams / comprensiones | `JavaStreams.java` | `ejemplo_funcional.py` |

Clases de apoyo:

- `java/Personaje.java`, `java/Equipo.java`, `java/Coordenada.java`
- `python/personaje.py`, `python/equipo.py`, `python/coordenada.py`

## Cómo ejecutar

### Java

Requiere JDK 17 o superior. Desde la carpeta `java`:

```bash
javac *.java
java JavaArrayList
java JavaHashMap
java JavaMapaCoordenada
java JavaRecorridos
java JavaOrdenamiento
java JavaStreams
```

### Python

Requiere Python 3.10 o superior. Desde la carpeta `python`:

```bash
python ejemplo_lista.py
python ejemplo_diccionario.py
python ejemplo_mapa_coordenada.py
python ejemplo_recorridos.py
python ejemplo_ordenamiento.py
python ejemplo_funcional.py
```

## Ideas clave de la clase

1. **Relación "tiene muchos"**: un `Equipo` tiene muchos `Personaje`.
2. **Composición**: la colección es un detalle interno (atributo privado); se usa mediante métodos (`agregar`, `quitar`, `buscar`).
3. **Abstracción**: se programa contra la interfaz (`List`, `Map`) y no contra la implementación (`ArrayList`, `HashMap`).
4. **`equals` y `hashCode`**: una clase usada como clave de un `Map` debe implementarlos; en Python, `__eq__` y `__hash__`.
5. **Orden natural vs orden externo**: `Comparable`/`__lt__` frente a `Comparator`/`key=lambda`.
