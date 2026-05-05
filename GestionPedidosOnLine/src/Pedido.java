
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

  public void agreagarItem(itemPedido item) {
    items.add(items);
  }
}
