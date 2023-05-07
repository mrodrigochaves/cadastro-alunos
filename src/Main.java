import edu.mrodrigochaves.cadastro.Aluno.Aluno;
import edu.mrodrigochaves.cadastro.Avaliacao.Avaliacao;
import edu.mrodrigochaves.cadastro.Curso.Curso;
import edu.mrodrigochaves.cadastro.Turma.Turma;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Criando dois objetos da classe Curso com diferentes atributos
        Curso curso1 = new Curso();
        curso1.setTitulo("HTML");
        curso1.setDescricao("Curso de Front-End com HTML");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS");
        curso2.setDescricao("Curso de Front-End com CSS");
        curso2.setCargaHoraria(15);

        // Criando um objeto da classe Turma com atributos
        Turma turma1 = new Turma();
        turma1.setTitulo("03-2023");
        turma1.setDescricao("Décima turma de programação Front-End");
        turma1.setDataInicio(LocalDate.of(2023, 3, 5));

        // Criando um objeto da classe Avaliacao, adicionando os cursos
        // e turmas criados anteriormente à lista de disciplinas da avaliação
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNome("Formação Developer Front-End");
        avaliacao.setDescricao("Curso de Desenvolvimento Web Fron-end!");
        avaliacao.getDisciplinas().add(curso1);
        avaliacao.getDisciplinas().add(curso2);
        avaliacao.getDisciplinas().add(turma1);

        // Criando um objeto da classe Aluno com um nome e inscrevendo o aluno na
        // avaliação
        Aluno alunoMarcio = new Aluno();
        alunoMarcio.setNome("Márcio");
        alunoMarcio.inscreverCurso(avaliacao);

        // Exibindo a lista de disciplinas inscritas pelo aluno
        System.out.println("Curso inscrito: " + alunoMarcio.getDisciplinasInscritas());

        // Avançando o aluno para o próximo módulo, exibindo o status de inscrição e a
        // nota atual do aluno após cada avanço
        alunoMarcio.avancar();
        alunoMarcio.avancar();
        System.out.println("-");
        System.out.println("Inscrição em curso:" + alunoMarcio.getDisciplinasInscritas());
        System.out.println("Inscrição em curso:" + alunoMarcio.getDisciplinasConcluidas());
        System.out.println("Nota: " + alunoMarcio.calcular_Nota());

        // Criando outro objeto da classe Aluno com um nome e inscrevendo o aluno na
        // avaliação
        Aluno alunoBenjamin = new Aluno();
        alunoBenjamin.setNome("Benjamin");
        alunoBenjamin.inscreverCurso(avaliacao);

        // Exibindo a lista de disciplinas inscritas pelo aluno
        System.out.println("Curso inscrito: " + alunoBenjamin.getDisciplinasInscritas());

        // Avançando o aluno para o próximo módulo, exibindo o status de inscrição e a
        // nota atual do aluno após cada avanço
        alunoBenjamin.avancar();
        alunoBenjamin.avancar();

        // Imprime a mensagem "Inscrição em curso:" seguida do número de disciplinas em
        // que o aluno Benjamin está atualmente inscrito
        System.out.println("Inscrição em curso:" + alunoBenjamin.getDisciplinasInscritas());

        // Imprime a mensagem "Inscrição em curso:" seguida do número de disciplinas em
        // que o aluno Benjamin já concluiu
        System.out.println("Inscrição em curso:" + alunoBenjamin.getDisciplinasConcluidas());

        // Imprime a mensagem "Nota:" seguida da nota final do aluno Benjamin na
        // avaliação
        System.out.println("Nota: " + alunoBenjamin.calcular_Nota());

    }
}
