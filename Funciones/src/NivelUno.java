public class NivelUno {
  public String nombre;

  public static void mostrarSaludo() {
    System.out.println("Hola Mundo!");
  }

  public static void saludar(String nombre) {
    System.out.println("Hola " + nombre + " !!");
  }

  public static void areaRectangulo(double base, double altura) {
    System.out.println("El resultado de area de un rectangulo es: " + base * altura);
  }

  public static void cambiarTextoMayuscula(String texto) {
    String textoMayuscula = texto.toUpperCase();
    System.out.println(textoMayuscula);
  }

  public static void mostrarMenu() {
    System.out.println(":: Menu ::");
    System.out.println("::1. Opcion uno.");
    System.out.println("::2. Opcion dos.");
    System.out.println("::3. Opcion tres.");
    System.out.println("::4. Opcion cuatro.");
    System.out.println("::5. Salir.");
    System.out.println(":: Opcion: ");

  }

}
