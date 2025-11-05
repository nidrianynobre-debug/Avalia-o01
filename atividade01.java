import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double n1, n2, n3, n4;
        double mediaSem1, mediaSem2, mediaFinal;

        // Pedindo as notas ao aluno
        System.out.print("Digite a nota do 1º bimestre: ");
        n1 = entrada.nextDouble();

        System.out.print("Digite a nota do 2º bimestre: ");
        n2 = entrada.nextDouble();

        System.out.print("Digite a nota do 3º bimestre: ");
        n3 = entrada.nextDouble();

        System.out.print("Digite a nota do 4º bimestre: ");
        n4 = entrada.nextDouble();

        // Calculando as médias
        mediaSem1 = (n1 + n2) / 2; // 1º semestre
        mediaSem2 = (n3 + n4) / 2; // 2º semestre
        mediaFinal = (mediaSem1 + mediaSem2) / 2; // média final

        // Mostrando os resultados
        System.out.println("\n--- Resultados ---");
        System.out.println("1º Bimestre: " + n1);
        System.out.println("2º Bimestre: " + n2);
        System.out.println("1º Semestre: " + mediaSem1);
        System.out.println("-------------------");
        System.out.println("3º Bimestre: " + n3);
        System.out.println("4º Bimestre: " + n4);
        System.out.println("2º Semestre: " + mediaSem2);
        System.out.println("-------------------");
        System.out.println("Média Final: " + mediaFinal);

        entrada.close();
    }
}
