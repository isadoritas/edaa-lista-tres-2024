public class QuickSort {
  public static void main(String[] args) {
      String input = "hello";
      char[] letras = input.toCharArray();

      quickSort(letras, 0, letras.length - 1);

      System.out.println("String ordenada: ");
      for (char letra : letras) {
          System.out.print(letra);
      }
  }

  public static void quickSort(char[] array, int inicio, int fim) {
      if (inicio < fim) {
          int pivo = particionar(array, inicio, fim);
          quickSort(array, inicio, pivo - 1);
          quickSort(array, pivo + 1, fim);
      }
  }

  public static int particionar(char[] array, int inicio, int fim) {
      char pivo = array[fim];
      int i = inicio - 1;
      for (int j = inicio; j < fim; j++) {
          if (array[j] <= pivo) {
              i++;
              char temp = array[i];
              array[i] = array[j];
              array[j] = temp;
          }
      }
      char temp = array[i + 1];
      array[i + 1] = array[fim];
      array[fim] = temp;

      return i + 1;
  }
}
