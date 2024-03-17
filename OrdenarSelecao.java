import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarSelecao{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomes = new ArrayList<>();

        System.out.println("Quantos nomes você deseja inserir?");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira o nome " + (i+1) + ":");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (nomes.get(j).length() < nomes.get(minIndex).length()) {
                    minIndex = j;
                }
            }
            Collections.swap(nomes, i, minIndex);
        }

        System.out.println("Nomes ordenados pelo tamanho:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
