public class ProjetoGraos {

    public static void main(String[] args) {
        // Total de casas no tabuleiro de xadrez
        int casas = 64; 
         // Começa com 1 grão no primeiro quadro
        long totalGrãos = 1;

        for (int i = 2; i <= casas; i++) {
            totalGrãos *= 2; // Dobra a quantidade de grãos em cada quadro
            if (totalGrãos < 0) {
                System.out.println("Overflow usando int na casa " + (i - 1));
                break; // Sai do loop se ocorrer overflow
            }
        }

        System.out.println("Total de grãos esperados: " + totalGrãos);
    }
}
