
package tarefa;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double SalarioAtual, SalarioNovo;

        System.out.println("Informe seu Salário Atual: "); 
        SalarioAtual = input.nextDouble();

        if (SalarioAtual > 1000 && SalarioAtual < 2000) {
            SalarioNovo = SalarioAtual * 1.15 ;
            System.out.println("Seu novo salário é:  \n" + SalarioNovo);
            
        }else if (SalarioAtual > 2000 && SalarioAtual < 3000) {
            SalarioNovo = SalarioAtual * 1.10;
            System.out.println("Seu novo salário é:  \n" + SalarioNovo);

        }else if (SalarioAtual > 2000 && SalarioAtual < 3000) {
            SalarioNovo = SalarioAtual * 1.05;
            System.out.println("Seu novo salário é:  \n" + SalarioNovo);
        }
    }
}
