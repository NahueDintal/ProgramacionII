import java.util.ArrayList;
import java.util.Scanner;

public class Eleccion {
  private ArrayList<Candidato> candidatos;
  private ArrayList<Votante> votantes;

  public Eleccion() {
    candidatos = new ArrayList<>();
    votantes = new ArrayList<>();
  }

  public void registrarCandidato(Candidato c) {
    candidatos.add(c);
    System.out.println("Candidato aderido: " + c.getNombre());
  }

  public void registrarVotante(Votante v) {
    votantes.add(v);
    System.out.println("Candidato aderido: " + v.getIdVotante());
  }

  public void emitirVoto(Votante v) {
    // verificar
    if (v.getYaVoto()) {
      System.out.println("Ese votante ya voto");
      return;
    }

    Scanner sc = new Scanner(System.in);
    int opcion = 0;

    System.out.println("Candidatos Dispobibles");
    for (int i = 0; i < candidatos.size(); i++) {
      Candidato c = candidatos.get(i);
      System.out.println((i + 1) + ". " + c.getNombre() + " (" + c.getPartido() + ")");
    }

    do {
      System.out.println("Seleccione un candidato");
      System.out.print("Opcion: ");
      opcion = sc.nextInt();

      if (opcion < 1 || opcion > candidatos.size()) {
        System.out.println("Opción inválida!");
      }

    } while (opcion < 1 || opcion > candidatos.size());

    Candidato elegido = candidatos.get(opcion - 1);
    elegido.sumarVoto();
    v.marcarQueVoto();
    System.out.println("Voto registrado para " + elegido.getNombre());
  }

  public void mostrarResultados() {
    System.out.println("::Resultados::");
    for (Candidato c : candidatos) {
      System.out.println(c.getNombre() + "| " + c.getPartido() + "| " + c.getVotos());
    }

    int i = 0;
    Candidato ganador = candidatos.get(0);
    while (i < candidatos.size()) {
      Candidato actual = candidatos.get(i);
      if (actual.getVotos() > ganador.getVotos()) {
        ganador = actual;
      }
      i++;
    }
    System.out.println("Ganador: " + ganador.getNombre() + " del partido " + ganador.getPartido());
  }
}
