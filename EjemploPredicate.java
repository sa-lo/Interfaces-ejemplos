import java.util.function.Predicate;

public class EjemploPredicate {
    public static void main(String[] args) {
        // Ejemplo 1: Evalúa si un String tiene más de 5 caracteres
        Predicate<String> esLarga = s -> s.length() > 5;
        System.out.println("¿'enum' es larga? " + esLarga.test("enum"));

        // Ejemplo 2: Evalúa si un String empieza con la letra J
        Predicate<String> empiezaConJ = s -> s.startsWith("J");
        System.out.println("¿'Java' empieza con J? " + empiezaConJ.test("Java"));
    }
}
