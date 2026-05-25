import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Proyecto proyecto = new Proyecto("Sistema de Biblioteca Digital", "2026-06-01", "2026-08-30");

    MiembroEquipo ana = new MiembroEquipo("Ana", "Desarrolladora");
    MiembroEquipo carlos = new MiembroEquipo("Carlos", "Tester");

    proyecto.agregarMiembro(ana);
    proyecto.agregarMiembro(carlos);

    Tarea t1 = new Tarea("Diseñar base de datos", "Modelar entidades y relaciones", "2026-06-15");
    Tarea t2 = new Tarea("Implementar backend", "Desarrollar API REST", "2026-07-20");

    proyecto.agregarTarea(t1);
    proyecto.agregarTarea(t2);

    System.out.println("Asignación de tareas");
    proyecto.asignarTarea(t1, ana);
    proyecto.asignarTarea(t2);

    proyecto.mostrarProgreso();

    System.out.println("Actualización de estado tarea");
    Scanner scanner = new Scanner(System.in);
    System.out.print("¿Desea actualizar el estado de alguna tarea? (s/n): ");
    String resp = scanner.nextLine();
    if (resp.equalsIgnoreCase("s")) {
      System.out.println("Tareas disponibles:");
      for (int i = 0; i < proyecto.getTareas().size(); i++) {
        System.out.println((i + 1) + ". " + proyecto.getTareas().get(i).getNombre());
      }
      System.out.print("Seleccione número de tarea: ");
      int idx = scanner.nextInt() - 1;
      scanner.nextLine();
      if (idx >= 0 && idx < proyecto.getTareas().size()) {
        Tarea tareaActualizar = proyecto.getTareas().get(idx);
        tareaActualizar.actualizarEstado();
      } else {
        System.out.println("Número inválido.");
      }
    }

    proyecto.mostrarProgreso();

    scanner.close();
  }
}
