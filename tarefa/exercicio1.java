
package tarefa;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double salarioAtual, salarioNovo;

        System.out.println("Informe seu Salário Atual: "); 
        salarioAtual = input.nextFloat();

        if (salarioAtual > 1000 && salarioAtual < 2000) {
            System.out.println("Seu novo salário é:  \n");
            salarioNovo = salarioAtual * 1.15 ;

        }else if (salarioAtual > 2000 && salarioAtual < 3000) {
            salarioNovo = salarioAtual * 1.10;

        }else if (salarioAtual > 2000 && salarioAtual < 3000) {
            salarioNovo = salarioAtual * 1.05;
        }
    }
}
