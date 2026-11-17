List<String> nombres = new ArrayList<>();

nombres.add("Aria");                    // agrega al final
nombres.add(0, "Borin");                // inserta en posicion 0
nombres.get(1);                         // "Aria"
nombres.set(1, "Cael");                 // reemplaza
nombres.remove("Borin");                // por valor
nombres.remove(0);                      // por indice
nombres.size();                         // cantidad
nombres.contains("Cael");               // true
nombres.indexOf("Cael");                // posicion o -1
nombres.isEmpty();                      // false
nombres.clear();                        // vacia
