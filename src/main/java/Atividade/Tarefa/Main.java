package Atividade.Tarefa;

public class Main {
    public static void main(String[] args) {
        ICalcMedia calculoAritmetico = new Aritmetica();
        ICalcMedia calculoGeometrico = new Geometrica();

        Disciplina disciplinaAritmetica = new Disciplina(calculoAritmetico);
        disciplinaAritmetica.setNome("Padroes de Desenvolvimento");
        disciplinaAritmetica.setP1(10);
        disciplinaAritmetica.setP2(5);
        disciplinaAritmetica.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
                disciplinaAritmetica.getP1(), disciplinaAritmetica.getP2(), disciplinaAritmetica.getMedia(), disciplinaAritmetica.getSituacao()));

        Disciplina disciplinaGeometrica = new Disciplina(calculoGeometrico);
        disciplinaGeometrica.setNome("Padroes de Desenvolvimento");
        disciplinaGeometrica.setP1(10);
        disciplinaGeometrica.setP2(5);
        disciplinaGeometrica.CalcularMedia();
        System.out.println(String.format("P1:%.2f P2:%.2f Media:%.2f  Situacao: %s",
                disciplinaGeometrica.getP1(), disciplinaGeometrica.getP2(), disciplinaGeometrica.getMedia(), disciplinaGeometrica.getSituacao()));
    }
}
