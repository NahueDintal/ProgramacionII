public class NivelCuatro {
  public static void formateado(int[] enteros) {
    for (int i : enteros) {
      System.out.print("[" + i + "]");
      if (enteros.length > i) {
        System.out.print(", ");
      }
    }
    System.out.print(".");
    System.out.println();
  }

  public static int[] invertirOrden(int[] enteros) {
    int[] invertido = new int[enteros.length];
    int indiceReverso = 0;

    for (int i = enteros.length - 1; i >= 0; i--) {
      invertido[indiceReverso] = enteros[i];
      indiceReverso++;
    }
    return invertido;
  }

  public static void mejorNotaAlumno(String[] alumnos, int[] notas) {
    int mejorNota = notas[0];
    int indiceMejor = 0;
    for (int i = 0; i < notas.length; i++) {
      if (notas[i] > mejorNota) {
        mejorNota = notas[i];
        indiceMejor = i;
      }
    }
    System.out.print("El alumno con la mejor nota es: " + alumnos[indiceMejor]
        + " con " + mejorNota + ".");
  }

}
