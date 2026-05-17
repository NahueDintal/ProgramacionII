public class Votante {
  private String idVotante;
  private boolean yaVoto = false;

  public Votante(String idVotante, boolean yaVoto) {
    this.idVotante = idVotante;
    this.yaVoto = yaVoto;
  }

  public void setYaVoto(boolean yaVoto) {
    this.yaVoto = yaVoto;
  }

}
