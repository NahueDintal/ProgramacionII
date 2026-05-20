import java.util.ArrayList;

public class Biblioteca {
  private ArrayList<Libro> libros;

  public Biblioteca() {
    this.libros = new ArrayList<>();
  }

  public void agregarLibro(Libro l) {
    if (l != null) {
      libros.add(l);
      System.out.println("El libro: " + l.getTitulo());
    } else {
      System.out.println("Ingrese un valor. No puede campo no puede estar vacío.");
    }
  }

  public Libro buscarLibro(String tituloBuscado) {
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

  public boolean prestarLibro(String titulo) {
    Libro libro = buscarLibro(titulo);
    System.out.println("Se ha prestado el libro: " + titulo);
    libro.prestarLibro();
    return true;
  }

  public boolean devolverLibro(String titulo) {
    Libro libro = buscarLibro(titulo);
    System.out.println("Se ha devuelto el libro: " + titulo);
    libro.devolverLibro();
    return true;
  }

}
