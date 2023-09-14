import java.util.Scanner;

public class CadastroDeAlunos {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] alunosDoFIC = new String[4][5];
        String[] cadastro = {"Digite o nome do Aluno",
                             "Digite a idade do Aluno",
                             "Digite o Curso do Aluno",
                             "Digite o período do Curso",
                             "Digite a duração do Curso"};

        // Loop para carregar o vetor
        for (int x = 0; x < 4; x++) {
            for (int i = 0; i < 5; i++) {
                System.out.println(cadastro[i]);
                alunosDoFIC[x][i] = ler.nextLine();
            }
        }

        // Loop para imprimir todos os dados dos Alunos
        for (int x = 0; x < 4; x++) {
            System.out.println("\nDados do Aluno " + (x + 1) + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println(cadastro[i] + ": " + alunosDoFIC[x][i]);
            }
        }
    }
}
