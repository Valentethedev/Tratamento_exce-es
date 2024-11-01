//2 classes
    //Classe abastecimento
        //Parâmetro será quantidade de carros abastecidos no dia
        // Classe sem retorno
        //Objetos
        // Atributos = litros, faturamento, preco_litro_gasolina. Matriz com 2 colunas n linhas
        // Métodos = abastecimento (entrada litros), calculafaturamento (faturamento = litros * preço litro da gasolina)á        
    //Main
        //Chamada método abastecimento
package com.mycompany.tratamento_de_excecao;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Tratamento_de_excecao {
    private int carros_abastecidos;
    public void  entrada_carros_abastecidos(){
        Scanner entrada = new Scanner(System.in);
        //try catch number format exception
        try{
        System.out.println("Digite o numero de carros abastecidos no dia ");
        carros_abastecidos = entrada.nextInt();
        }
        catch(InputMismatchException e){
           System.out.println("Numero invalido, tente novamente");
        }
    }
    
    
    public static void main(String[] args) {
        abastecimento a = new abastecimento();
        Tratamento_de_excecao tratamento = new Tratamento_de_excecao();
        a.entrada_abastecimentos();
    }
    public int getCarrosabastecidos(){
        return carros_abastecidos;
    }
}
