package disciplina;

public class Aluno {

    String nome;
    double notaDaProva1;
    double notaDaProva2;
    double notaDaProva3;
    double notaDaProva4;
    
    double obterMedia() {
        return (notaDaProva1 + notaDaProva2 + notaDaProva3 + notaDaProva4) / 4;
    }
    
    String obterStatus(double mediaDoAluno) {
        if(mediaDoAluno < 4.0) {
            return "Reprovado";
        } else if(mediaDoAluno < 7.0) {
            return "Prestar Exame";
        } else {
            return "Aprovado";
        }
    }
    
}
