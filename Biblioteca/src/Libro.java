public class Libro {
  private String isbn;
  private String titulo;
  private String autor;
  private int anioPublicacion;
  private boolean disponible = true;

  public Libro(String isbn, String titulo, String autor, int anioPublicacion) {
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.anioPublicacion = anioPublicacion;
  }

  public String getIsbn() {
    return isbn;
  }

  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public int getAnioPublicacion() {
    return anioPublicacion;
  }

  public boolean getDisponible() {
    return disponible;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setDisponible(boolean disponible) {
    this.disponible = disponible;
  }

  public void setAnioPublicacion(int anioPublicacion) {
    this.anioPublicacion = anioPublicacion;
  }


}
