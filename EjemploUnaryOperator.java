import java.util.function.UnaryOperator;

public class EjemploUnaryOperator {
    public static void main(String[] args) {

        // Ejemplo 1: Recibe un Integer y devuelve un Integer (multiplicado por 2)
        UnaryOperator<Integer> duplicar = n -> n * 2;
        System.out.println("El doble de 5 es: " + duplicar.apply(5));

        // Ejemplo 2: Recibe un String y devuelve un String (convertido a mayúsculas)
        UnaryOperator<String> aMayusculas = String::toUpperCase;
        System.out.println("Texto modificado: " + aMayusculas.apply("java es genial"));
    }
}