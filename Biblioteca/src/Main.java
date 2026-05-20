public class Main {
  public static void main(String[] args) {

    Biblioteca biblioteca = new Biblioteca();

    Libro l = new Libro("111-1", "El señor de los metodos", "JRR Tolkien", 1965);
    Libro l2 = new Libro("222-2", "Java para todos", "Autor B", 1678);
    Libro l3 = new Libro("333-3", "Hotel tour", "Autor C", 2000);

    biblioteca.agregarLibro(l);
    biblioteca.agregarLibro(l2);
    biblioteca.agregarLibro(l3);

    String tituloBuscar = "Java para todos";
    Libro tituloEncontrado = biblioteca.buscarLibroTitulo(tituloBuscar);
    if (tituloEncontrado == null) {
      System.out.println("No se hay resultado");
    } else {
      System.out.println("Encontrado titulo: " + tituloEncontrado);
    }

    String autorBuscar = "JRR Tolkien";
    Libro autorEncontrado = biblioteca.buscarLibroAutor(autorBuscar);
    if (autorEncontrado == null) {
      System.out.println("No se hay resultado");
    } else {
      System.out.println("Encontrado autor: " + autorEncontrado);
    }

    biblioteca.devolverLibro("Java para todos");
    boolean estado = l2.getDispobible();
    if (estado == true) {
      System.out.println("Disponible");
    } else {
      System.out.println("No está disponible");

    }
  }
}
