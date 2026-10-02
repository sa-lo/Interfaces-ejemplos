import java.util.function.BiFunction;

public class EjemploBiFunction {
    public static void main(String[] args) {
        // Ejemplo 1: Recibe dos Integer y devuelve un Integer (el mayor)
        BiFunction<Integer, Integer, Integer> mayor = Math::max;
        System.out.println("Mayor entre 17 y 42: " + mayor.apply(17, 42));

        // Ejemplo 2: Recibe dos String y devuelve un String (concatenado)
        BiFunction<String, String, String> unirPalabras = (a, b) -> a + " " + b;
        System.out.println("Uniendo palabras: " + unirPalabras.apply("Hola", "Mundo"));
    }
}