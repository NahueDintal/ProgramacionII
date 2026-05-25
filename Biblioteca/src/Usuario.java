import java.util.ArrayList;

public class Usuario {
  private String idUsuario;
  private String nombre;
  private ArrayList<Libro> librosPrestados;

  public Usuario(String idUsuario, String nombre) {
    this.idUsuario = idUsuario;
    this.nombre = nombre;
    this.librosPrestados = new ArrayList<>();
  }

  // usar for para listar los libros prestados

  public String getIdUsuario() {
    return idUsuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarLibroPrestado(Libro libro) {
    librosPrestados.add(libro);
  }

  public boolean devolverLibro(Libro libro) {
    return librosPrestados.remove(libro);
  }

  public void mostrarLibrosPrestados() {
    if (librosPrestados.isEmpty()) {
      System.out.println("El Usuario no tiene libros prestados que mostrar");
      return;
    }

    System.out.println("Libros prestado a " + nombre);
    for (int i = 0; i < librosPrestados.size(); i++) {
      Libro libro = librosPrestados.get(i);
      System.out.println((i + 1) + " " + libro.getTitulo() + " " + libro.getAutor());
    }
  }
}
