import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();
    Scanner scanner = new Scanner(System.in);

    // Agregar libros
    Libro l1 = new Libro("111-1", "El señor de los métodos", "JRR Tolkien", 1965);
    Libro l2 = new Libro("222-2", "Java para todos", "Autor B", 1678);
    Libro l3 = new Libro("333-3", "Hotel tour", "Autor C", 2000);

    biblioteca.agregarLibro(l1);
    biblioteca.agregarLibro(l2);
    biblioteca.agregarLibro(l3);

    // Mostrar catálogo inicial
    biblioteca.mostrarCatalogo();

    // Buscar libros por título (usando el método unificado con while)
    System.out.println("\n--- Búsqueda por título 'Java' ---");
    List<Libro> encontrados = biblioteca.buscarLibro("titulo", "Java");
    for (Libro l : encontrados) {
      System.out.println(l);
    }

    // Buscar por autor
    System.out.println("\n--- Búsqueda por autor 'Tolkien' ---");
    encontrados = biblioteca.buscarLibro("autor", "Tolkien");
    for (Libro l : encontrados) {
      System.out.println(l);
    }

    // Crear usuario
    Usuario usuario = new Usuario("U001", "Juan Pérez");

    // Préstamo de un libro (con reintentos do-while)
    System.out.println("\n--- Préstamo de libro ---");
    System.out.print("Ingrese el ISBN del libro a prestar: ");
    String isbnPrestamo = scanner.nextLine();
    boolean prestamoOk = biblioteca.prestarLibro(isbnPrestamo, usuario);
    if (prestamoOk) {
      usuario.mostrarLibrosPrestados();
    }

    // Mostrar catálogo después del préstamo
    biblioteca.mostrarCatalogo();

    // Devolver el libro
    System.out.println("\n--- Devolución de libro ---");
    System.out.print("Ingrese el ISBN del libro a devolver: ");
    String isbnDevolucion = scanner.nextLine();
    biblioteca.devolverLibro(isbnDevolucion, usuario);

    // Estado final
    usuario.mostrarLibrosPrestados();
    biblioteca.mostrarCatalogo();

    scanner.close();
  }
}
