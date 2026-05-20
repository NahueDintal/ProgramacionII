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

  public String getIdUsuario() {
    return idUsuario;
  }

  public String getNombre() {
    return nombre;
  }

  public void setIdUsuario(String idUsuario) {
    this.idUsuario = idUsuario;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

}
