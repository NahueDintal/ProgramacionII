import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. Crear productos
    Producto p1 = new Producto("Laptop", 450000, 5);
    Producto p2 = new Producto("Cimitarra", 120000, 18);

    // 2. Crear ítems (cantidades iniciales pueden exceder stock)
    ItemPedido i1 = new ItemPedido(p1, 3); // OK, 3 ≤ 5
    ItemPedido i2 = new ItemPedido(p2, 20); // 20 > 18, pedirá ajuste

    // 3. Crear pedido y agregar ítems
    Pedido ped1 = new Pedido("001");
    ped1.agregarItem(i1);
    ped1.agregarItem(i2);

    // 4. Mostrar total antes de ajustar
    System.out.printf("Total inicial del pedido: $%.2f\n", ped1.calcularTotal());

    // 5. Confirmar disponibilidad (ajusta cantidades si es necesario)
    ped1.confirmarDisponibilidad(sc);

    // 6. Mostrar total después de ajustes
    System.out.printf("Total final después de ajustes: $%.2f\n", ped1.calcularTotal());

    // 7. Procesar pedido (descuenta stock y cambia estado)
    ped1.procesarPedido();

    // 8. Mostrar estado final y stocks restantes (opcional)
    // System.out.println("Estado del pedido: " + ped1.getEstado());
    System.out.println("Stock final de Laptop: " + p1.getCantidadDisponible());
    System.out.println("Stock final de Cimitarra: " + p2.getCantidadDisponible());

    sc.close();
  }
}
