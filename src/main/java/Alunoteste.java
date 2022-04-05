public class Alunoteste {

    public static void main(String[] args) {
        //isso se chama instanciar um objeto , eu estou criando um objeto
        //e foram criados os atributos que são o nome o curso e a idade.

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Pedro";
        aluno1.curso = "Ciência";
        aluno1.idade = 25 ;

        // aqui estão sendo criados os metodos desse objeto , que é assistir aula ,
        //fazer prova e calcular a nota

        aluno1.assistiraula();
        aluno1.fazerprova();
        aluno1.calcularnota();
    }
}
