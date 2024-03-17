import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    List<Pessoa> listaPessoas = new ArrayList<>();
        String[] nomes = { "Isadora Rodrigues", "Arthur Maestri", "Augusto Fabio",
        "Breno Vinicius", "Vinícius Raphael",
        "César Augusto", "Daniela Teixeira", "Eduardo Jose", "Emerson Vinicios",
        "Felipe dos Santos",
        "Gabriel Felipe", "Pedro Castro", "Pedro Rodrigues", "Gabriel Silva",
        "Henrique Cezar",
        "Isadora Ribeiro", "João Reberth", "Lucas Alves", "Lucas Ferreira",
        "Marcus Paulo",
        "Maria Clara", "André Luiz", "Diogo Freitas", "Matheus Felipe", "Nátali Isaltino",
        "Paulo Vítor", "Rogério Lopes", "Thiago Luis", "Víctor Henrique",
        "Vinicius Garcia",
        "Vinícius Paiva", "Wesley Carvalho", "Weslley Ferreira", "Caio Alves",
        "Lucas Marques",
        "Marcela Maria" };

    Random sortear = new Random();
    for (String nome : nomes) {
      int idade = sortear.nextInt(100);
      listaPessoas.add(new Pessoa(nome, idade));
            Collections.sort(listaPessoas, Comparator.comparing(Pessoa::getNome));
    }
    for (Pessoa pessoa : listaPessoas) {
      System.out.println("Nome: " + pessoa.getNome() + ", " + "Idade: " + pessoa.getIdade());
    }
    
    Scanner scanner = new Scanner(System.in);
    List<String> names = new ArrayList<>();

    System.out.println("Quantos nomes você deseja inserir?");
    int n = scanner.nextInt();
    scanner.nextLine();  // Consume newline left-over

    for (int i = 0; i < n; i++) {
        System.out.println("Insira o nome " + (i+1) + ":");
        String name = scanner.nextLine();
        int j = i - 1;

        while (j >= 0 && names.get(j).compareTo(name) > 0) {
            if (j + 1 == names.size()) {
                names.add(names.get(j));
            } else {
                names.set(j + 1, names.get(j));
            }
            j--;
        }

        if (j + 1 == names.size()) {
            names.add(name);
        } else {
            names.set(j + 1, name);
        }
    }

    System.out.println("Nomes ordenados:");
    for (String name : names) {
        System.out.println(name);
    }

    scanner.close();
  }
}
