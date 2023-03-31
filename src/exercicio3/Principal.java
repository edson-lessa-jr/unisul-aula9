package exercicio3;

public class Principal {
    public static void main(String[] args) {
        // Criando um aluno
        Aluno aluno1 = new Aluno("João", 20, "12345");

        // Criando duas disciplinas
        Disciplina disciplina1 = new Disciplina("Programação I", "Prof. Carlos");
        Disciplina disciplina2 = new Disciplina("Banco de Dados", "Prof. Ana");

        // Matriculando o aluno nas disciplinas
        aluno1.matricular(disciplina1);
        aluno1.matricular(disciplina2);

        // Imprimindo os dados do aluno e das disciplinas
        aluno1.imprimirDados();
        disciplina1.imprimirDados();
        disciplina2.imprimirDados();

        // Cancelando a matrícula do aluno em uma disciplina
        aluno1.cancelarMatricula(disciplina1);

        // Imprimindo os dados atualizados do aluno e da disciplina
        aluno1.imprimirDados();
        disciplina1.imprimirDados();
    }
}
