import java.util.ArrayList;
import java.util.List;

public class Proyecto {
  private String nombre;
  private String fechaInicio;
  private String fechaFinEstimada;
  private List<Tarea> tareas;
  private List<MiembroEquipo> miembros;

  public Proyecto(String nombre, String fechaInicio, String fechaFinEstimada) {
    this.nombre = nombre;
    this.fechaInicio = fechaInicio;
    this.fechaFinEstimada = fechaFinEstimada;
    this.tareas = new ArrayList<>();
    this.miembros = new ArrayList<>();
  }

  public void agregarTarea(Tarea tarea) {
    tareas.add(tarea);
    System.out.println("Tarea '" + tarea.getNombre() + "' agregada al proyecto.");
  }

  public void asignarTarea(Tarea tarea, MiembroEquipo miembro) {
    MiembroEquipo asignado = null;
    int i = 0;
    while (i < miembros.size() && asignado == null) {
      MiembroEquipo m = miembros.get(i);
      if (m.getRol().equalsIgnoreCase("Desarrollador")) {
        asignado = m;
      }
      i++;
    }
    if (asignado == null) {
      asignado = miembro;
    }
    asignado.asignarTarea(tarea);
  }

  public void asignarTarea(Tarea tarea) {
    MiembroEquipo asignado = null;
    int idMiembro = 0;
    while (idMiembro < miembros.size() && asignado == null) {
      asignado = miembros.get(idMiembro);
      idMiembro++;
    }
    if (asignado != null) {
      asignado.asignarTarea(tarea);
    } else {
      System.out.println("No hay miembros del equipo para asignar la tarea.");
    }
  }

  public void mostrarProgreso() {
    System.out.println("Progreso del Proyecto: " + nombre);
    System.out.println("Inicio: " + fechaInicio + " | Fin estimado: " + fechaFinEstimada);
    if (tareas.isEmpty()) {
      System.out.println("No hay tareas definidas.");
      return;
    }
    int completadas = 0;
    for (int i = 0; i < tareas.size(); i++) {
      Tarea t = tareas.get(i);
      System.out.println("- " + t);
      if (t.getEstado().equals("Completada")) {
        completadas++;
      }
    }
    System.out.println("Progreso: " + completadas + "/" + tareas.size() + " tareas completadas.");
  }

  public void agregarMiembro(MiembroEquipo miembro) {
    miembros.add(miembro);
    System.out.println("Miembro '" + miembro.getNombre() + "' agregado al equipo.");
  }

  public List<Tarea> getTareas() {
    return tareas;
  }

  public List<MiembroEquipo> getMiembros() {
    return miembros;
  }
}
