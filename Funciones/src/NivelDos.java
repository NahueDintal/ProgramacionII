public class NivelDos {
  public static boolean numeroPar(double numero) {
    double total = numero % 2;
    if (total != 0 && total >= 0) {
      return false;
    }
    return true;
  }

  public static int cuadrado(int numero) {
    return numero * numero;
  }

  public static long factorial(int numero) {
    long resultado = 1;
    for (int i = 2; i <= numero; i++) {
      resultado *= i;
    }
    return resultado;
  }
}
