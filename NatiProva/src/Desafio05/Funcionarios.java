package Desafio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionarios{
    //variáveis

    private String funcNome;
    private int cod_cargos;
    private int codigo;




    //criando um construtor vazio consigo chamar só os metodos.


    public Funcionarios(String funcNome, int cod_cargos, int codigo) {
        this.funcNome = funcNome;
        this.cod_cargos = cod_cargos;
        this.codigo = codigo;
    }


    public String getFuncNome() {
        return funcNome;
    }

    public void setFuncNome(String funcNome) {
        this.funcNome = funcNome;
    }

    public int getCod_cargos() {
        return cod_cargos;
    }

    public void setCod_cargos(int cod_cargos) {
        this.cod_cargos = cod_cargos;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
