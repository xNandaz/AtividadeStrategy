package Atividade.Tarefa;

public class Geometrica implements ICalcMedia {
    @Override
    public void CalcularMedia(Disciplina d) {
        double media = Math.sqrt(d.getP1() * d.getP2());
        d.setMedia(media);
    }

    @Override
    public String Situacao(Disciplina d) {
        return "Aprovado" + (d.getMedia() > 7.0 ? "" : " (Recuperação)");
    }
}


