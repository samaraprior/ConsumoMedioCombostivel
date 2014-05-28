package disciplina;


public class Disciplina {
    
    private int quantidadeDeAlunos;
    private double somaDasNotas = 0.0;
    
    void adicionarMediaDeAluno(double media){
        somaDasNotas += media;
        quantidadeDeAlunos++;
    }
    
    double obterMediaDaDisciplina(){
        return somaDasNotas / quantidadeDeAlunos;
    }
    
}
