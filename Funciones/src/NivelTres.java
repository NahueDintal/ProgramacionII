public class NivelTres {
  public static double sumar(double... numeros) {
    double total = 0;
    for (double num : numeros) {
      total += num;
    }
    return total;
  }

  public static double promedio(double[] numeros) {
    double total = sumar(numeros);
    return total / numeros.length;
  }

  public static boolean buscarNumero(int[] numeros, int numero) {
    for (int num : numeros) {
      if (num == numero) {
        return true;
      }
    }
    return false;
  }

  public static int contadorOcurrencia(String[] textos, String buscado) {
    int contador = 0;
    for (String t : textos) {
      if (t.equalsIgnoreCase(buscado)) {
        contador++;
      }
    }
    return contador;
  }
}
