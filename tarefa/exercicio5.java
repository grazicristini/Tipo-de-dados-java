package tarefa;

import java.util.Scanner;

public class exercicio5 {
        public static void main(String[] args){
    
            Scanner input = new Scanner(System.in);
            int num;

            System.out.println("Dígite um número:");
            num = input.nextInt();

            if (num == 1){
                System.out.println("1 = Segunda-Feira \n" + num + "\n" );
            }else if (num == 2){
                System.out.println("2 = Terça-Feira \n" + num + "\n" );
            }else if (num == 3){
                System.out.println("3 = Quarta-Feira \n" + num + "\n" );
            }else if (num == 4){
                System.out.println("4 = Quinta-Feira \n" + num + "\n" );
            }else if (num == 5){
                System.out.println("5 = Sexta-Feira \n" + num + "\n" );
            }else if (num == 6){
                System.out.println("6 = Sábado \n" + num + "\n" );
            }else if(num == 7){
                System.out.println("7 = Domingo \n" + num + "\n" );
            }else {
                System.out.println("O número nao faz parte \n" );
            }

        }
}
