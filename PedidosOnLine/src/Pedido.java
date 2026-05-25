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

  public void agregarItem(ItemPedido item) {
    items.add(item);
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public double calcularTotal() {
    double total = 0;
    for (ItemPedido item : items) {
      total += item.getProducto().getPrecio() * item.getCantidadSolicitada();
    }
    return total;
  }

  public void confirmarDisponibilidad(Scanner sc) {
    for (ItemPedido item : items) {
      Producto p = item.getProducto();
      int solicitada = item.getCantidadSolicitada();
      int disponible = item.getProducto().getCantidadDisponible();

      while (solicitada > disponible) {
        System.out.println("Stock insuficiente, disponible: " + disponible);
        System.out.print("Ingrese nueva cantidad: ");
        int nuevaCantidad = sc.nextInt();
        if (nuevaCantidad >= 0 && nuevaCantidad <= disponible) {
          item.setCantidadSolicitada(nuevaCantidad);
          solicitada = nuevaCantidad;
        } else {
          System.out.println("Cantidad Inválida.");
        }
      }
    }
    System.out.println("Disponibilidad de todos los items");
  }

  public void procesarPedido() {
    for (ItemPedido item : items) {
      Producto p = item.getProducto();
      int nuevaDisponible = p.getCantidadDisponible() - item.getCantidadSolicitada();
      p.setCantidadDisponible(nuevaDisponible);
      System.out.println("Stock restante: " + nuevaDisponible);

      int procesado = 0;
      do {
        System.out.println("Empaquetando ítem " + (procesado + 1) + "...");
        procesado++;
      } while (procesado < items.size());
      setEstado("Completado");
      System.out.println("Pedido " + idPedido + " completado.");
    }
  }
}
