import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

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
  }
}