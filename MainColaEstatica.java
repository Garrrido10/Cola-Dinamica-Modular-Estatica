public class MainColaEstatica {
    public static void main(String[] args) {
        ColaEstatica cola = new ColaEstatica(3);

        System.out.println("*** PRUEBA DE COLA ESTÁTICA LINEAL ***");
        cola.enqueue(10);
        cola.enqueue(20);
        cola.enqueue(30);

        System.out.println("\n--- Elemento al frente (Peek) ---");
        System.out.println("Al frente está: " + cola.peek());

        System.out.println("\n--- Fila actual ---");
        cola.mostrar();

        System.out.println("\n--- Atendiendo elementos ---");
        cola.dequeue();

        System.out.println("\n--- Fila después de atender ---");
        cola.mostrar();

        System.out.println("\n--- Nuevo Peek ---");
        System.out.println("Al frente está: " + cola.peek());
    }
}
