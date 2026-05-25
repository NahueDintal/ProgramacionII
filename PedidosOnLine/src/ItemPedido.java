public class ItemPedido {
  private Producto producto;
  private int cantidadSolicitada;

  public ItemPedido(Producto producto, int cantidadSolicitada) {
    this.producto = producto;
    this.cantidadSolicitada = cantidadSolicitada;
  }

  public Producto getProducto() {
    return producto;
  }

  public int getCantidadSolicitada() {
    return cantidadSolicitada;
  }

  public void setCantidadSolicitada(int cantidadSolicitada) {
    this.cantidadSolicitada = cantidadSolicitada;
  }
}
