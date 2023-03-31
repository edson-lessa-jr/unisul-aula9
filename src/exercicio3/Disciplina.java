package exercicio3;

public class Disciplina {
    private String nome;
    private String professor;
    private Aluno[] alunos;
    public static Disciplina[] listaDisciplinas = new Disciplina[4];

    public Disciplina(String nome, String professor) {
        this.nome = nome;
        this.professor = professor;
        this.alunos = new Aluno[50];

    }

    private int retornarIndiceVazio() {
        for (int i = 0; i < this.alunos.length; i++) {
            if (this.alunos[i] == null) {
                return i;
            }
        }
        return this.alunos.length-1;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos[retornarIndiceVazio()]=aluno;
    }

    public void removerAluno(Aluno aluno) {
        for (int i = 0; i < this.alunos.length; i++) {
            if (alunos[i]==aluno){
                alunos[i]=null;
            }
        }

    }

    public String getNome() {
        return nome;
    }

    public String getProfessor() {
        return professor;
    }

    public void imprimirDados() {
        System.out.println("Disciplina: " + nome);
        System.out.println("Professor: " + professor);
        System.out.println("Alunos matriculados:");
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome() + " (" + aluno.getMatricula() + ")");
        }
        System.out.println();
    }
}
