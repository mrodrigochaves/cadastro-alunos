import edu.mrodrigochaves.cadastro.Aluno.Aluno;
import edu.mrodrigochaves.cadastro.Avaliacao.Avaliacao;
import edu.mrodrigochaves.cadastro.Curso.Curso;
import edu.mrodrigochaves.cadastro.Turma.Turma;

import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("HTML");
        curso1.setDescricao("Curso de Front-End com HTML");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("CSS");
        curso2.setDescricao("Curso de Front-End com CSS");
        curso2.setCargaHoraria(15);

        Turma turma1 = new Turma();
        turma1.setTitulo("03-2023");
        turma1.setDescricao("Décima turma de programação Front-End");
        turma1.setDataInicio(LocalDate.of(2023, 3, 5));

     
        Avaliacao avaliacao = new Avaliacao();
        avaliacao.setNome("Formação Developer Front-End");
        avaliacao.setDescricao("Curso de Desenvolvimento Web Fron-end!");
        avaliacao.getDisciplinas().add(curso1);
        avaliacao.getDisciplinas().add(curso2);
        avaliacao.getDisciplinas().add(turma1);

        Aluno alunoMarcio = new Aluno();
        alunoMarcio.setNome("Márcio");
        alunoMarcio.inscreverCurso(avaliacao);
        System.out.println("Curso inscrito: " + alunoMarcio.getDisciplinasInscritas());
        alunoMarcio.avancar();
        alunoMarcio.avancar();
        System.out.println("-");
        System.out.println("Inscrição em curso:" + alunoMarcio.getDisciplinasInscritas());
        System.out.println("Inscrição em curso:" + alunoMarcio.getDisciplinasConcluidas());
        System.out.println("Nota: " + alunoMarcio.calcular_Nota());


        System.out.println("-------");

        Aluno alunoBenjamin = new Aluno();
        alunoBenjamin.setNome("Benjamin");
        alunoBenjamin.inscreverCurso(avaliacao);
        System.out.println("Curso inscrito: " + alunoBenjamin.getDisciplinasInscritas());
        alunoBenjamin.avancar();
        alunoBenjamin.avancar();
        System.out.println("-");
        System.out.println("Inscrição em curso:" + alunoBenjamin.getDisciplinasInscritas());
        System.out.println("Inscrição em curso:" + alunoBenjamin.getDisciplinasConcluidas());
        System.out.println("Nota: " + alunoBenjamin.calcular_Nota());

    }
}
