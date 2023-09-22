public class ProjetoGraos {

    public static void main(String[] args) {
        int casas = 64; // Total de casas no tabuleiro de xadrez
        long totalGrãos = 1; // Começa com 1 grão no primeiro quadro

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
