package com.mycompany.tratamento_de_excecao;
import java.util.Scanner;
import java.util.InputMismatchException;
public class abastecimento {
    
    
    
    public void entrada_abastecimentos(){
        Scanner entrada = new Scanner(System.in);
        Tratamento_de_excecao tratamento = new Tratamento_de_excecao();
        double preco_litro = 6.07; 
        int indice_carro = 0;
        tratamento.entrada_carros_abastecidos();
        int quantidade_de_carros = tratamento.getCarrosabastecidos();
        double abastecimentos[][] = new double [quantidade_de_carros][2];
        for(int i = 0; i < quantidade_de_carros; i++){
            try{
            System.out.println("Digite a quantidade de litros abastecida pelo carro "+ (i + 1));
            abastecimentos[i][0] = entrada.nextDouble();
             abastecimentos[i][1] = abastecimentos[i][0] * preco_litro;
            }
            catch(InputMismatchException e){
                System.out.println("Numero invalido");
            }
        } 
        try{
        System.out.println("Digite o numero do carro que quer obter o faturamento");
        indice_carro = entrada.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Numero invalido");
        }
        try{
        System.out.printf("\n O carro %d abasteceu %.2f e pagou %.2f", indice_carro, abastecimentos[indice_carro - 1][0], abastecimentos[indice_carro - 1][1]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Esse id de carro nao existe, tente novamente");
        }
        }
    
}
