public class ColaEstatica {
    private int[] arreglo;
    private int frente;
    private int fin;
    private int capacidad;
    private int tamano;

    public ColaEstatica(int tamano) {
        this.capacidad = tamano;
        this.arreglo = new int[this.capacidad];
        this.frente = 0;
        this.fin = -1;
        this.tamano = 0;
    }

    public void enqueue(int valor) {
        if (tamano == capacidad) {
            System.out.println("Error: La cola está llena.");
            return;
        }
        fin++;
        arreglo[fin] = valor;
        tamano++;
        System.out.println("Entró a la fila: " + valor);
    }

    public int dequeue() {
        if (tamano == 0) {
            System.out.println("Error: La cola está vacía.");
            return -1;
        }
        int atendido = arreglo[frente];
        frente++;
        tamano--;
        System.out.println("Atendido y fuera: " + atendido);
        return atendido;
    }

    public int peek() {
        if (tamano == 0) {
            System.out.println("La cola está vacía.");
            return -1;
        }
        return arreglo[frente];
    }

    public void mostrar() {
        if (tamano == 0) {
            System.out.println("La cola está vacía.");
            return;
        }
        System.out.print("Fila actual: ");
        for (int i = frente; i <= fin; i++) {
            System.out.print(arreglo[i] + " ");
        }
        System.out.println();
    }
}
