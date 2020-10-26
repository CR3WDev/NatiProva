package Desafio06;

public class Main {


    public static void main(String[] args){
        int vetor[] = { 0, 1, 1, 1, 1, 0, 1, 1, 1};
        int x = 0;
        int maiorX = 0;
        int pos = 0;
        int ultimaMaiorX = 0;
        int ultimaPos = 0;
        for(int i = 0 ; i < vetor.length ; i++){
            if(vetor[i] == 1){
                if(x == 0) pos = i;
                x++;
                maiorX = Math.max(x , maiorX);
            }
            else x = 0;
            if(maiorX > ultimaMaiorX) {
                ultimaMaiorX = maiorX;
                ultimaPos = pos;
            }
        }
        System.out.println(ultimaPos);
    }
}