public class Candidato {
  private String nombre;
  private String partido;
  private int votos = 0;

  public Candidato(String nombre, String partido, int votos) {
    this.nombre = nombre;
    this.partido = partido;
    this.votos = votos;
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
}
