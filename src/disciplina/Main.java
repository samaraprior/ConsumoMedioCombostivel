package disciplina;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        String numeroDeAlunosInformado = JOptionPane.showInputDialog("Informe o número de alunos na disciplina:");
        int numeroDeAlunos = Integer.parseInt(numeroDeAlunosInformado);
        
        Disciplina disciplina = new Disciplina();
        for (int i = 0; i < numeroDeAlunos; i++) {
            Aluno aluno = new Aluno();
            aluno.nome = JOptionPane.showInputDialog("Informe o nome do Aluno");
            
            String notaProva1Str = JOptionPane.showInputDialog("Informe a nota da prova 1 do aluno " + aluno.nome);
            aluno.notaDaProva1 = Double.parseDouble(notaProva1Str);
            
            String notaProva2Str = JOptionPane.showInputDialog("Informe a nota da prova 2 do aluno " + aluno.nome);
            aluno.notaDaProva2 = Double.parseDouble(notaProva2Str);
            
            String notaProva3Str = JOptionPane.showInputDialog("Informe a nota da prova 3 do aluno " + aluno.nome);
            aluno.notaDaProva3 = Double.parseDouble(notaProva3Str);
            
            String notaProva4Str = JOptionPane.showInputDialog("Informe a nota da prova 4 do aluno " + aluno.nome);
            aluno.notaDaProva4 = Double.parseDouble(notaProva4Str);
            
            double media = aluno.obterMedia();
            System.out.println(aluno.nome + " " + media + " " +aluno.obterStatus(media));
            
            disciplina.adicionarMediaDeAluno(media);
        }
        System.out.println("A média da disciplina é " + disciplina.obterMediaDaDisciplina());
    }

}
