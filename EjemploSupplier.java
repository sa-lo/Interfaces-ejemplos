import java.util.function.Supplier;

public class EjemploSupplier {
    public static void main(String[] args) {
        // Ejemplo 1: No recibe parámetros, provee un String estático
        Supplier<String> saludo = () -> "¡Bienvenido al laboratorio!";
        System.out.println("Saludo: " + saludo.get());

        // Ejemplo 2: No recibe parámetros, provee un texto al ser llamado
        Supplier<String> textoDiferido = () -> "desde Supplier";
        System.out.println("Texto: " + textoDiferido.get());
    }
}
