# Cola-Dinamica-Modular-Estatica
# Práctica: Arquitectura Modular y Estructuras de Datos Lineales (Colas)

**Asignatura:** Estructura de Datos  
**Alumno:** Marco Antonio Pavia Flores  
**Docente:** Víctor Hugo Vásquez Herrera  
**Institución:** Instituto Tecnológico Superior de Xalapa (ITSX)  

---

## 1. Descripción y Estructura Modular del Proyecto
El proyecto está desarrollado en Java respetando una arquitectura modular que separa las estructuras de datos de tipo Cola (FIFO - *First In, First Out*) en sus variantes lineal estática, circular estática y dinámica enlazada, junto con sus respectivas clases de ejecución independientes:

* **`ColaEstatica.java`**: Implementación de una cola estática lineal basada en un arreglo de tamaño fijo con punteros de inicio y fin.
* **`ColaEstaticaCircular.java`**: Implementación de una cola estática circular que optimiza el reuso de espacio mediante la operación de módulo (`%`).
* **`Nodo.java`**: Clase base para representar los nodos enlazados de la cola dinámica.
* **`ColaDinamica.java`**: Implementación de una cola de tamaño dinámico basada en nodos, con métodos extendidos de consulta (`peek`) y conteo (`contarElementos`).
* **`MainColaEstatica.java`**: Clase de ejecución independiente para instanciar y probar la cola estática lineal.
* **`MainColaCir.java`**: Clase de ejecución independiente para instanciar y probar la cola estática circular.
* **`MainColaDinamica.java`**: Clase de ejecución independiente para instanciar y probar la cola dinámica.

---

## 2. Operaciones Implementadas

Cada variante implementa las operaciones fundamentales de las estructuras de datos tipo Cola:

| Operación | Descripción |
| :--- | :--- |
| **Enqueue / Encolar** | Inserción de un nuevo elemento al final de la cola. |
| **Dequeue / Desencolar** | Extracción del elemento ubicado al frente de la cola. |
| **Peek** | Consulta del elemento al frente sin modificar ni extraer la estructura. |
| **ContarElementos / Mostrar** | Recorrido de los elementos activos e impresión del estado en consola. |

---

## 3. Pasos para Compilar y Ejecutar

1. Asegúrate de contar con el **Java Development Kit (JDK)** instalado en tu equipo.
2. Abre tu terminal o consola de comandos y navega hasta la carpeta del proyecto donde residen los archivos `.java`.
3. Compila todas las clases ejecutando el siguiente comando:
   ```bash
   javac *.java
   ```

---

## 4. Ejecución por Módulos

### Opción A: Ejecutar Cola Estática Lineal
```bash
java MainColaEstatica
```

### Opción B: Ejecutar Cola Estática Circular
```bash
java MainColaCir
```

### Opción C: Ejecutar Cola Dinámica
```bash
java MainColaDinamica
```

---

## 5. Salidas Esperadas por Consola

### Salida de `MainColaEstatica.java`:
```text
*** PRUEBA DE COLA ESTÁTICA LINEAL ***
Entró a la fila: 10
Entró a la fila: 20
Entró a la fila: 30

--- Elemento al frente (Peek) ---
Al frente está: 10

--- Fila actual ---
Fila actual: 10 20 30 

--- Atendiendo elementos ---
Atendido y fuera: 10

--- Fila después de atender ---
Fila actual: 20 30 

--- Nuevo Peek ---
Al frente está: 20
```

### Salida de `MainColaCir.java`:
```text
*** PRUEBA DE COLA ESTÁTICA CIRCULAR ***
Entro a la fila: 10
Entro a la fila: 20
Entro a la fila: 30
Entro a la fila: 40
Entro a la fila: 50

--- Elemento al frente (Peek) ---
Al frente está: 10

--- Fila actual ---
Fila actual: 10 20 30 40 50 

--- Atendiendo (Dequeue) ---
Atendido y fuera: 10
Atendido y fuera: 20

--- Fila después de atender ---
Fila actual: 30 40 50 

--- Agregando más (Efecto circular) ---
Entro a la fila: 60
Entro a la fila: 70

--- Estado final ---
Fila actual: 30 40 50 60 70 
```

### Salida de `MainColaDinamica.java`:
```text
*** PRUEBA DE COLA DINÁMICA ***
Entró a la fila: 100
Entró a la fila: 200
Entró a la fila: 300

--- Consultando elementos ---
Elemento al frente (Peek): 100
Total de elementos en la cola: 3

--- Fila actual ---
Frente ->  [100] [200] [300] <- Fin

--- Desencolando ---
Atendido y fuera: 100

--- Estado después de desencolar ---
Frente ->  [200] [300] <- Fin
Nuevo total de elementos: 2
```
