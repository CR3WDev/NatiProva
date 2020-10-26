package Desafio04;

class Main {

    public static void contarPecas(String[][] tabuleiro) {
        // Matriz contendo as Strings e os valores
        String[][] pecas = {
                {"Vazio", "0"},
                {"Peão", "0"},
                {"Bispo", "0"},
                {"Cavalo", "0"},
                {"Torre", "0"},
                {"Rainha", "0"},
                {"Rei", "0"}
        };
//pecorrer matriz e aumentar o contador com a peça encontrada.
        for(int i = 0; i < tabuleiro.length; i++) {
            for(int j = 0; j < tabuleiro.length; j++) {
                int pos = Integer.parseInt(tabuleiro[i][j]);
                pecas[pos][1] = Integer.toString(Integer.parseInt(pecas[pos][1]) + 1);
            }
        }
        for(int i = 0;i <7;i++){
            System.out.println(pecas[i][0]+": "+pecas[i][1]);
        }
    }

    public static void main(String[] args) {
        //tabuleiro do xadrez
        String[][] tabuleiro = {
                { "4", "3", "2", "5", "6", "2", "3", "4" },
                { "1", "1", "1", "1", "1", "1", "1", "1" },
                { "0", "0", "0", "0", "0", "0", "0", "0" },
                { "0", "0", "0", "0", "0", "0", "0", "0" },
                { "0", "0", "0", "0", "0", "0", "0", "0" },
                { "0", "0", "0", "0", "0", "0", "0", "0" },
                { "1", "1", "1", "1", "1", "1", "1", "1" },
                { "4", "3", "2", "5", "6", "2", "3", "4" },
        };

        contarPecas(tabuleiro);
    }
}