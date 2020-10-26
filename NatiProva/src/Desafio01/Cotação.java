package Desafio01;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Cotação {
    public ArrayList<String> elementos = new ArrayList();
    public void addToList(String x){
        elementos.add(x);
    }
    public void showList(){
        System.out.println(elementos);
    }
    public void removeToList(){
        if(elementos.size() > 0) {
            elementos.remove(elementos.size() - 1);
        }
    }
    //Codigo para instanciar a tela de interface
    public void instTela() {
        Tela painel = new Tela();
        JFrame frame = new JFrame("Cotação");
        frame.setContentPane(painel.panel1());
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}
