package application;

import exceptions.BusinessException;
import java.util.Scanner;

/**
 * Controle de Fluxo - Desafio
 * Vamos exercitar
 * todo o conteúdo apresentado no módulo de Controle de Fluxo codificando o seguinte cenário.
 *
 * O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros,
 * com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão
 * no console (System.out.print) dos números incrementados
 *
 * @author João
 */
public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numberOne = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int numberTwo = sc.nextInt();

        try {
            contar(numberOne, numberTwo);
        }catch (BusinessException e){
            System.out.println(e.getMessage());
        }

    }

    static void contar(int numOne, int numTwo){

        if(numOne > numTwo){
            throw new BusinessException("O segundo parâmetro deve ser maior que o primeiro");
        }

        for(int i = numOne; i <= numTwo; i++){
            System.out.print(i + " ");
        }

    }
}
