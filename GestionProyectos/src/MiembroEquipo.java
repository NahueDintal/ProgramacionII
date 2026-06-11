import java.util.ArrayList;
import java.util.List;

public class MiembroEquipo {
  private String nombre;
  private String rol;
  private List<Tarea> tareasAsignadas;

  public MiembroEquipo(String nombre, String rol) {
    this.nombre = nombre;
    this.rol = rol;
    this.tareasAsignadas = new ArrayList<>();
  }

  public String getNombre() {
    return nombre;
  }

  public String getRol() {
    return rol;
  }

  public List<Tarea> getTareasAsignadas() {
    return tareasAsignadas;
  }

  public void asignarTarea(Tarea tarea) {
    tareasAsignadas.add(tarea);
    System.out.println("Tarea '" + tarea.getNombre() + "' asignada a " + nombre);
  }

  public void mostrarTareas() {
    if (tareasAsignadas.isEmpty()) {
      System.out.println(nombre + " no tiene tareas asignadas.");
      return;
    }
    System.out.println("Tareas de " + nombre + " (" + rol + "):");
    for (int i = 0; i < tareasAsignadas.size(); i++) {
      System.out.println("  " + (i + 1) + ". " + tareasAsignadas.get(i).getNombre());
    }
  }
}
