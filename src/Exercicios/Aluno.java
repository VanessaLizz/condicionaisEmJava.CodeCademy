package Exercicios;

public class Aluno {
    String nome;
    double nota;

    static void main(String[] args) {
        Aluno[] alunos = new Aluno[3];
        alunos[0] = new Aluno();
        alunos[0].nome = "Ana";
        alunos[0].nota = 8.5;
        alunos[1] = new Aluno();
        alunos[1].nome = "Bruno";
        alunos[1].nota = 7.0;
        alunos[2] = new Aluno();
        alunos[2].nome = "Carla";
        alunos[2].nota = 9.2;

        for (int i = 0; i < alunos.length; i++){
            System.out.println("O nome do aluno(a) é: " + alunos[i].nome + ", e sua nota é: " + alunos[i].nota);

            if (alunos[i].nota > 8){
                System.out.println("Parabéns " + alunos[i].nome + ", você foi aprovado(a) com média acima de 8!!");
            }
            else {
                System.out.println(alunos[i].nome + ", sua média ficou abaixo de 8. Você está de recuperação.");
            }
        }
    }
}
