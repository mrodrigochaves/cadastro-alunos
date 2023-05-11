# Sistema de Cadastro de Cursos, Turmas, Avaliações e Alunos
Este é um exemplo de um sistema de cadastro de cursos, turmas, avaliações e alunos em Java.

## O programa utiliza as seguintes classes:

    Aluno: representa um aluno que se inscreve em uma avaliação.
    Avaliacao: representa uma avaliação que consiste em uma lista de disciplinas, como cursos e turmas.
    Curso: representa um curso que faz parte de uma avaliação.
    Turma: representa uma turma que faz parte de uma avaliação.
    O programa começa criando dois objetos da classe Curso com diferentes títulos, descrições e cargas horárias. Em seguida, um objeto da classe Turma é criado com um título, descrição e data de início.

Um objeto da classe Avaliacao é criado com um nome, uma descrição e adicionando os cursos e turmas criados anteriormente à lista de disciplinas da avaliação.

Dois objetos da classe Aluno são criados, com diferentes nomes. Cada aluno é inscrito na avaliação usando o método inscreverCurso() e a lista de disciplinas inscritas é exibida usando o método getDisciplinasInscritas().

Os alunos avançam para o próximo módulo usando o método avancar(). Após cada avanço, é exibido o status de inscrição do aluno e sua nota atual usando os métodos getDisciplinasInscritas(), getDisciplinasConcluidas() e calcular_Nota().

## Como executar o programa
Para executar o programa, é necessário ter o ambiente de desenvolvimento Java instalado na máquina.

Em seguida, abra o arquivo Main.java em um editor de código e execute o programa clicando em "Run" ou digitando o comando java Main no terminal.

As informações dos alunos serão exibidas no console após a execução do programa.

