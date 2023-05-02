import java.time.LocalDate;

import edu.mrodrigochaves.cadastro.Aluno.Aluno;
import edu.mrodrigochaves.cadastro.Curso.Curso;
import edu.mrodrigochaves.cadastro.Turma.Turma;

public class Main {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno();
        aluno1.setNome("João");
        aluno1.setIdade(8);
        aluno1.setMatricula("001");
        aluno1.setEndereco("Rua Um");

       

        Aluno aluno2 = new Aluno();
        aluno2.setNome("Maria");
        aluno2.setIdade(9);
        aluno2.setMatricula("002");
        aluno2.setEndereco("Rua Dois");

        Curso curso1 = new Curso();
        curso1.setTitulo("HTML");
        curso1.setDescricao("Curso de programação Web");
        curso1.setCargaHoraria(10);

        Turma turma1 = new Turma();
        turma1.setTitulo("03-2023");
        turma1.setDescricao("Décima turma de programação com HTML");
        turma1.setDataInicio(LocalDate.of(2023, 3, 5));
        
        System.out.println(aluno1);
        System.out.println(aluno2);

        System.out.println(curso1);

        System.out.println(turma1);

    }
}
