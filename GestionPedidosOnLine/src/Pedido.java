
// Crea una clase Pedido con un ArrayList de ItemPedido, un idPedido (String) y
// un estado (String, ej: "Pendiente", "Completado"). ​
import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
  private String idPedido;
  private String estado;
  private ArrayList<ItemPedido> items;

  public Pedido(String idPedido) {
    this.idPedido = idPedido;
    this.estado = "Pendiente";
    this.items = new ArrayList<>();
  }

  public void agreagarItem(ItemPedido item) {
    items.add(item);
  }

  public double calcularTotal() {
    double total = 0;
    for (int i = 0; i < items.size(); i++) {
      ItemPedido item = items.get(i);
      total += item.getProducto().getPrecio() * item.getCantidadSolicitada();
    }
    return total;
  }

  public void confirmarDisponibilidad() {
    Scanner scanner = new Scanner(System.in);
    for (ItemPedido item : items) {
      Producto producto = item.getProducto();
      int solicitada = item.getCantidadSolicitada();
      while (solicitada > producto.getCantidadDisponible()) {
        System.out.println("Producto" + producto.getNombre() + "- Stock disponible: " + producto.getCantidadDisponible()
            + ", solicitaddo: " + solicitada);
        System.out.print("Ajuste la cantidad (máximo " + producto.getCantidadDisponible() + "): ");
        int nuevaCantidad = scanner.nextInt();

      }
      item.setCantidadSolicitada(solicitada);
    }
    System.out.println("Disponibilidad confirmada para el pedido " + idPedido);
    scanner.close();
  }

  // Bucle DO-WHILE para procesar el pedido (empaquetado iterativo)
  public void procesarPedido() {

  }

}
