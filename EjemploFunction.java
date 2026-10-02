import java.util.function.Function;

public class EjemploFunction {
    public static void main(String[] args) {
        // Ejemplo 1: Transforma un String en un Integer (su longitud)
        Function<String, Integer> longitud = String::length;
        System.out.println("Longitud de 'java': " + longitud.apply("java"));

        // Ejemplo 2: Transforma un String devolviendo otro String (en mayúsculas)
        Function<String, String> aMayusculas = String::toUpperCase;
        System.out.println("Mayúsculas: " + aMayusculas.apply("interfaz"));
    }
}