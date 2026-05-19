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

  public String getIdVotante() {
    return idVotante;
  }

  public boolean getYaVoto() {
    return yaVoto;
  }

  // este metodo solo cambia a true, para que no se pueda
  // cambiar a false y así manipular la votación.
  public void marcarQueVoto() {
    this.yaVoto = true;
  }
}
