public class Main {
  public static void main(String[] args) {
    Eleccion eleccion = new Eleccion();

    eleccion.registrarCandidato(new Candidato("Ana", "Partido Azul"));
    eleccion.registrarCandidato(new Candidato("Luis", "Partido Rojo"));
    eleccion.registrarCandidato(new Candidato("Marta", "Partido Verde"));

    Votante v1 = new Votante("V1");
    eleccion.registrarVotante(v1);

    eleccion.emitirVoto(v1);

    eleccion.emitirVoto(v1);

    eleccion.mostrarResultados();
  }
}
