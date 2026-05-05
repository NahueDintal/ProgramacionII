public class Producto {
  private String nombre;
  private double precio;
  private int cantidadDisponible;

  // contructor
  public Producto(String nombre, double precio, int cantidadDisponible) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidadDisponible = cantidadDisponible;
  }

  // set and getters
  public String getNombre() {
    return nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public int getCantidadDisponible() {
    return cantidadDisponible;
  }

  public void setCantidadDisponible(int cantidadDisponible) {
    this.cantidadDisponible = cantidadDisponible;
  }
}
