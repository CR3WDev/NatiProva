package Desafio03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Contas {
    Scanner prompt = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList();

    public void menu() {
        int cont = 0;
        int mult = 1;
        //while que vai rodar até a pessoa clicar para ver o resultado
        //após ela ver o resultado o while vai se encerrar
        while (true) {
            if (list.size() == 0) {
                System.out.println("[Seu Array De números]");
            } else {
                System.out.println(mult);
            }
            System.out.println("Digite 1 para adicionar um número ao vetor");
            System.out.println("Digite 2 para ver o resultado");
            System.out.println("Digite 3 remover o ultimo termo do array");
            System.out.println("Digite um número:");
            int op = prompt.nextInt();
            //codigo para remover o 0 e maior numero negativo caso o numero de negativos seja impar
            if (op == 1) {
                System.out.println("Digite um número para adicionar no Array ");
                int n = prompt.nextInt();
                list.add(n);
                Collections.sort(list);
                System.out.println(list);
                if (n < 0) {
                    cont++;
                }

            } else if (op == 2) {
                for (int y = 0; y < list.size(); y++) {
                    if (list.get(y) == 0) {
                        list.remove(y);
                    }
                }
                if (cont % 2 != 0) {

                    list.remove(cont-1);
                    cont--;
                }
                for(int i = 0;i<list.size();i++){
                    mult *= list.get(i);
                }
                System.out.println(list);
                    } else if (op == 3) {
                        list.remove(list.size()-1);
                    }

                }

            }
        }