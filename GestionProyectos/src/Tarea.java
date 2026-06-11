import java.util.Scanner;

public class Tarea {
  private String nombre;
  private String descripcion;
  private String estado;
  private String fechaLimite;

  public Tarea(String nombre, String descripcion, String fechaLimite) {
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.fechaLimite = fechaLimite;
    this.estado = "Pendiente";
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public String getEstado() {
    return estado;
  }

  public String getFechaLimite() {
    return fechaLimite;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void actualizarEstado() {
    Scanner scanner = new Scanner(System.in);
    String nuevoEstado;
    boolean valido;

    do {
      System.out.print("Ingrese el nuevo estado (Pendiente, En Progreso, Completada): ");
      nuevoEstado = scanner.nextLine();
      valido = nuevoEstado.equals("Pendiente") ||
          nuevoEstado.equals("En Progreso") ||
          nuevoEstado.equals("Completada");
      if (!valido) {
        System.out.println("Estado inválido. Intente nuevamente.");
      }
    } while (!valido);

    this.estado = nuevoEstado;
    System.out.println("Estado actualizado a: " + this.estado);
  }

  @Override
  public String toString() {
    return String.format("%s | %s | Límite: %s | Estado: %s",
        nombre, descripcion, fechaLimite, estado);
  }
}
