import java.util.ArrayList;

public class Biblioteca {
  private ArrayList<Libro> libros;

  public Biblioteca() {
    this.libros = new ArrayList<>();
  }

  public void agregarLibro(Libro l) {
    if (l != null) {
      libros.add(l);
      System.out.println("El libro: " + l.getTitulo() + " fue agregado con éxito.");
      // asignar el libro al usuario
    } else {
      System.out.println("Ingrese un valor. No puede campo no puede estar vacío.");
    }
  }

  public Libro buscarLibroTitulo(String tituloBuscado) {
    int i = 0;
    while (i < libros.size()) {
      Libro actual = libros.get(i);
      if (actual.getTitulo().equalsIgnoreCase(tituloBuscado)) {
        return actual;
      }
      i++;
    }
    return null;
  }

  public Libro buscarLibroAutor(String autorBuscado) {
    int i = 0;
    while (i < libros.size()) {
      Libro actual = libros.get(i);
      if (actual.getTitulo().equalsIgnoreCase(autorBuscado)) {
        return actual;
      }
      i++;
    }
    return null;
  }

  public boolean prestarLibro(String titulo, String idUsuario) {
    Libro libro = buscarLibroTitulo(titulo);
    System.out.println("Se ha prestado el libro: " + titulo);
    libro.prestarLibro();
    return true;
  }

  public boolean devolverLibro(String titulo) {
    Libro libro = buscarLibroTitulo(titulo);
    System.out.println("Se ha devuelto el libro: " + titulo);
    libro.devolverLibro();
    return true;
  }
}
