public class Main {
  public static void main(String[] args) {
    NivelUno.mostrarSaludo();

    NivelUno.saludar("Panchio");

    NivelUno.areaRectangulo(10, 15);

    NivelUno.cambiarTextoMayuscula("Hola wachin!");

    NivelUno.mostrarMenu();

    System.out.println(NivelDos.numeroPar(10));

    System.out.println(NivelDos.cuadrado(10));

    System.out.println(NivelDos.factorial(10));

    System.out.println(NivelTres.sumar(1, 2, 3, 4, 5));

    System.out.println(NivelTres.promedio(new double[] { 1, 2, 3, 4, 5 }));

    System.out.println(NivelTres.buscarNumero(new int[] { 1, 2, 3, 4, 5 }));

    String[] palabras = { "hola", "HOLA", "mundo", "Hola" };
    System.out.println(NivelTres.contadorOcurrencia(palabras, "hola")); // 3
  }
}
