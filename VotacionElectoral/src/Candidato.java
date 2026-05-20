public class Candidato {
  private String nombre;
  private String partido;
  private int votos = 0;

  public Candidato(String nombre, String partido) {
    this.nombre = nombre;
    this.partido = partido;
  }

  public String getNombre() {
    return nombre;
  }

  public String getPartido() {
    return partido;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void sumarVoto() {
    this.votos++;
  }
}
