import java.util.ArrayList;
import java.util.Scanner;

public class OrdenarInsercao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        System.out.println("Digite os nomes (digite 'fim' para parar):");
        String nome = scanner.nextLine();
        while (!nome.equalsIgnoreCase("fim")) {
            inserirOrdenado(nomes, nome);
            nome = scanner.nextLine();
        }

        System.out.println("Nomes ordenados:");
        for (String n : nomes) {
            System.out.println(n);
        }
    }

    public static void inserirOrdenado(ArrayList<String> lista, String nome) {
        int posicao = 0;
        while (posicao < lista.size() && nome.compareToIgnoreCase(lista.get(posicao)) > 0) {
            posicao++;
        }
        lista.add(posicao, nome);
    }
    
}
