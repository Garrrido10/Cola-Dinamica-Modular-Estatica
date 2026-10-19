public class MainColaDinamica {
    public static void main(String[] args) {
        ColaDinamica cola = new ColaDinamica();

        System.out.println("*** PRUEBA DE COLA DINÁMICA ***");

        cola.encolar(100);
        cola.encolar(200);
        cola.encolar(300);

        System.out.println("\n--- Consultando elementos ---");
        System.out.println("Elemento al frente (Peek): " + cola.peek());
        System.out.println("Total de elementos en la cola: " + cola.contarElementos());

        System.out.println("\n--- Fila actual ---");
        cola.mostrar();

        System.out.println("\n--- Desencolando ---");
        cola.desencolar();

        System.out.println("\n--- Estado después de desencolar ---");
        cola.mostrar();
        System.out.println("Nuevo total de elementos: " + cola.contarElementos());
    }
}
