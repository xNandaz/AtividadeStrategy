package Atividade.Tarefa;

public class Aritmetica implements ICalcMedia {
    @Override
    public void CalcularMedia(Disciplina d) {
        double media = (d.getP1() + d.getP2()) / 2.0;
        d.setMedia(media);
    }

    @Override
    public String Situacao(Disciplina d) {
        return "Aprovado" + (d.getMedia() > 5.0 ? "" : " (Recuperação)");
    }
}

