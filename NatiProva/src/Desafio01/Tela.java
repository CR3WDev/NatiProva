package Desafio01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Tela {
    Cotação func = new Cotação();
    private JPanel panel1;
    private JTextField textBox1;
    private JLabel title;
    private JButton remove;
    private JButton add;
    private JLabel label03;
    private JScrollPane Gerinaldo;
    private JTextArea textArea1;
    int y;

    public Tela() {
        //Codigos usados no botão remover
        textArea1.setText("Suas cotações ficam aki :)");
        remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                func.removeToList();
                String resultado = "";
                for(String c :func.elementos){
                    resultado = resultado.concat("•"+c+"\r\n");
                }
                textArea1.setText(resultado);
                if(func.elementos.size() == 0){
                    textArea1.setText("Suas cotações ficam aki :)");
                }
            }
        });
        //codigos usados no botão adicionar
        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                func.addToList(textBox1.getText());
                String resultado = "";
                for(String c :func.elementos){
                    resultado = resultado.concat("•"+c+"\r\n");
                }
                textArea1.setText(resultado);
            }

        });
    }

    public Container panel1() {
        return panel1;
    }
}
