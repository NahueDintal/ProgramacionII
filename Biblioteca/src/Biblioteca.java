import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
  private List<Libro> catalogo;

  public Biblioteca() {
    this.catalogo = new ArrayList<>();
  }

  public void agregarLibro(Libro l) {
    if (l != null) {
      catalogo.add(l);
      System.out.println("El libro: " + l.getTitulo() + " fue agregado con éxito.");
    }
  }

  public List<Libro> buscarLibro(String criterio, String valor) {
    List<Libro> resultados = new ArrayList<>();
    int i = 0;
    while (i < catalogo.size()) {
      Libro libro = catalogo.get(i);
      switch (criterio.toLowerCase()) {
        case "titulo":
          if (libro.getTitulo().toLowerCase().contains(valor.toLowerCase())) {
            resultados.add(libro);
          }
          break;
        case "autor":
          if (libro.getAutor().toLowerCase().contains(valor.toLowerCase())) {
            resultados.add(libro);
          }
          break;
        default:
          System.out.println("Criterio inválido. Use 'titulo' o 'autor'.");
          return resultados;
      }
      i++;
    }
    return resultados;
  }

  public Libro buscarLibroTitulo(String tituloBuscado) {
    int i = 0;
    while (i < catalogo.size()) {
      Libro actual = catalogo.get(i);
      if (actual.getTitulo().equalsIgnoreCase(tituloBuscado)) {
        return actual;
      }
      i++;
    }
    return null;
  }

  public Libro buscarLibroAutor(String autorBuscado) {
    int i = 0;
    while (i < catalogo.size()) {
      Libro actual = catalogo.get(i);
      if (actual.getTitulo().equalsIgnoreCase(autorBuscado)) {
        return actual;
      }
      i++;
    }
    return null;
  }

  public boolean prestarLibro(String isbn, Usuario usuario) {
    Scanner sc = new Scanner(System.in);
    boolean prestamoExitoso = false;

    do {
      Libro libro = buscarLibroIsbn(isbn);
      if (libro == null) {
        System.out.println("No se puede encontrar el libro con el ISBN: " + isbn);
      } else if (!libro.getDisponible()) {
        System.out.println("El libro: " + libro.getTitulo() + " no está disponible");
      } else {
        System.out
            .println("Se ha prestado el libro: " + isbn + libro.getTitulo() + " al usuario: " + usuario.getNombre());
        libro.setDisponible(false);
        usuario.agregarLibroPrestado(libro);
        prestamoExitoso = true;
        break;
      }

      if (!prestamoExitoso) {
        System.out.print("¿Desea intentar con otro ISBN? (s/n): ");
        String opcion = sc.nextLine();
        if (opcion.equalsIgnoreCase("s")) {
          System.out.print("Ingrese el nuevo ISBN: ");
          isbn = sc.nextLine();
        } else {
          System.out.println("Préstamo cancelado.");
          break;
        }
      }
    } while (!prestamoExitoso);
    return true;
  }

  private Libro buscarLibroIsbn(String isbn) {
    for (Libro libro : catalogo) {
      if (libro.getIsbn().equals(isbn)) {
        return libro;
      }
    }
    return null;
  }

  public boolean devolverLibro(String isbn, Usuario usuario) {
    Libro libro = buscarLibroIsbn(isbn);
    if (libro == null) {
      System.out.println("El libro con ISBN " + isbn + " no pertenece a la biblioteca.");
      return false;
    }

    if (usuario.devolverLibro(libro)) {
      libro.setDisponible(true);
      System.out.println("Devolución exitosa: " + libro.getTitulo());
      return true;
    } else {
      System.out.println("El usuario no tiene prestado el libro con ISBN " + isbn);
      return false;
    }
  }

  public void mostrarCatalogo() {
    System.out.println("Catálogo de la Biblioteca");
    if (catalogo.isEmpty()) {
      System.out.println("No hay libros en el catálogo.");
      return;
    }
    for (Libro libro : catalogo) {
      System.out.println(libro);
    }
  }

  public void mostrarCatalogo() {
    System.out.println("\n--- Catálogo de la Biblioteca ---");
    if (catalogo.isEmpty()) {
      System.out.println("No hay libros en el catálogo.");
      return;
    }
    for (Libro libro : catalogo) {
      System.out.println(libro);
    }
  }

}
