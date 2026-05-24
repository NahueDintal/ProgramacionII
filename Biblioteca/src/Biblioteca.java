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

  public boolean prestarLibro(String titulo, String idUsuario) {
    Scanner sc = new Scanner(System.in);
    boolean prestadoExitoso = false;

    do {
      Libro libro = buscarLibroTitulo(titulo);
      System.out.println("Se ha prestado el libro: " + titulo);
      libro.prestarLibro();

    } while (!prestadoExitoso);
    return true;
  }

  public boolean devolverLibro(String titulo) {
    Libro libro = buscarLibroTitulo(titulo);
    System.out.println("Se ha devuelto el libro: " + titulo);
    libro.devolverLibro();
    return true;
  }
}
