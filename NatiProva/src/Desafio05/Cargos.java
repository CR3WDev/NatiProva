package Desafio05;

import java.util.ArrayList;
import java.util.Scanner;

public class Cargos {
    // vetores
    ArrayList<Funcionarios> listFunc = new ArrayList();


    ArrayList<Double> salCargos = new ArrayList();



    Scanner in = new Scanner(System.in);


    // getters and setters class cargos

    public void setCargo(double x){
        salCargos.add(x);
    }
    public void delCargo(double y){
        salCargos.remove(y);
    }

    public int getTamanho(){
        return salCargos.size();
    }




    // Vamos verificar se o codigo do funcionario ja esta presente no vetor de funcionarios
    public boolean verifyCodigo(Funcionarios funcionario){
        for(int i = 0 ;i<listFunc.size();++i){
            if(funcionario.getCodigo() == listFunc.get(i).getCodigo()){
                return true;
            }
        }
        return false;
    }


    public void addFunc(Funcionarios funcionario){
        boolean flag = false;
        if(verifyCodigo(funcionario)){
            System.out.println("O codigo de " + funcionario.getFuncNome() + " ja existe");
            flag = true;
        }
        if(!flag) listFunc.add(funcionario);
    }


    public void calcularSalario(int cargo){
        double soma = 0;
        boolean flag = false;
        if(cargo < 0 || cargo > getTamanho() - 1) {
            System.out.println("codigo inexistente");
            flag = true;
        }
        if(!flag){
            for(int i = 0 ; i < listFunc.size() ; i++){
                if(listFunc.get(i).getCod_cargos() == cargo){
                    soma += salCargos.get(cargo);
                }
            }
            System.out.println("A soma dos salarios de " + cargo + ": " + soma );
        }
    }



    public void showFuncionarios(){
        for(int i = 0 ; i < listFunc.size() ; i++){
            System.out.println(
                            "Nome: " + listFunc.get(i).getFuncNome() + ", "+
                            "Cargo: " + listFunc.get(i).getCod_cargos() + ", "+
                            "Codigo funcionario: " + listFunc.get(i).getCodigo());
        }
    }














    public void cadastrarFuncionario(String funcNome, int cod_cargos, int codigo){
        boolean flag = false;
        if(cod_cargos < 0 || cod_cargos > getTamanho() - 1){
            System.out.println("nao existe");
            flag = true;
        }
        else if(!flag){
            Funcionarios f = new Funcionarios(funcNome, cod_cargos, codigo);
            addFunc(f);
        }
    }

}
