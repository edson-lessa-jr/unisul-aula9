package exercicio3;

public class Aluno {
    private String nome;
    private int idade;
    private String matricula;
    private Disciplina[] disciplinas;

    public Aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.disciplinas = new Disciplina[5];
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void matricular(Disciplina disciplina) {
        disciplina.adicionarAluno(this);
        disciplinas[retornaIndiceFinal()] = disciplina;
    }
    private int retornaIndiceFinal(){
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (this.disciplinas[i]==null){
                return i;
            }
        }
        return this.disciplinas.length;
    }

    public void matricular(String nomeDisciplina) {
        for (Disciplina disciplina : Disciplina.listaDisciplinas) {
            if (disciplina.getNome().equals(nomeDisciplina)) {
                matricular(disciplina);
                return;
            }
        }
        System.out.println("Disciplina não encontrada!");
    }

    public void cancelarMatricula(Disciplina disciplina) {
        disciplina.removerAluno(this);
        for (int i = 0; i < this.disciplinas.length; i++) {
            if (disciplinas[i]==disciplina){
                disciplinas[i]=null;
            }

        }
    }

    public void cancelarMatricula(String nomeDisciplina) {
        for (Disciplina disciplina : Disciplina.listaDisciplinas) {
            if (disciplina.getNome().equals(nomeDisciplina)) {
                cancelarMatricula(disciplina);
                return;
            }
        }
        System.out.println("Disciplina não encontrada!");
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Disciplinas matriculadas:");
        for (Disciplina disciplina : disciplinas) {
            System.out.println("- " + disciplina.getNome());
        }
        System.out.println();
    }
}
