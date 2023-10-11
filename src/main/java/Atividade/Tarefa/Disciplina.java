package Atividade.Tarefa;

public class Disciplina {
    private ICalcMedia CalcMedia;
    private double Media;
    private String Nome;
    private double p1;
    private double p2;

    public Disciplina(ICalcMedia CalcMedia) {
        this.CalcMedia = CalcMedia;
    }

    public void CalcularMedia() {
        CalcMedia.CalcularMedia(this);
    }

    public String getSituacao() {
        return CalcMedia.Situacao(this);
    }

    public double getP1() {
        return p1;
    }

    public void setP1(double p1) {
        this.p1 = p1;
    }

    public double getP2() {
        return p2;
    }

    public void setP2(double p2) {
        this.p2 = p2;
    }

    public double getMedia() {
        return Media;
    }

    public void setMedia(double Media) {
        this.Media = Media;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
}
