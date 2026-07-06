# Evaluación Set y Map

## Método A: filtrarYOrdenarTickets

Implementacion utilizada: TreeMap

Explicación: Usé TreeMap por que no permite elementos duplicados y le da un orden a la información ingresada, además de poder usar lambda para dirle "quiero que ordenes de esta manera".
Ordenará tomando como primer criterio la prioridad, va a comparar un ticket con otro, obtendrá la el valor de la prioridad de cada uno, devolverá <0 si es que el primero es menor al segundo, >0 si el primero es mayo al segundo y devolverá 0 si ambos son iguales. Si devuelve cero, pasará al segundo criterio, que es el de los codigos, usando el compareTo, verificará si dos strings son iguales. Después irá añadiendo al Set verificando la prioridad minima.

## Método B: agruparCodigosPorPrioridad

Implementacion utilizada para el map: HashMap
Implementacion utilizada para los sets internos: HashSet

Explicación: Usé HashMap y HashSet en ambos casos ya que no permiten elementos duplicados.