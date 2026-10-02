import java.util.function.Consumer;

public class EjemploConsumer {
    public static void main(String[] args) {
        // Ejemplo 1: Recibe un String y lo imprime, no devuelve nada
        Consumer<String> imprimir = System.out::println;
        imprimir.accept("Esto fue impreso por un Consumer");

        // Ejemplo 2: Recibe un String, lo altera a mayúsculas y lo imprime
        Consumer<String> imprimirGritando = texto -> System.out.println(texto.toUpperCase() + "!!!");
        imprimirGritando.accept("lambdas");
    }
}