package tarefa;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        double Peso, Altura, imc;

         
        System.out.println("Dígite sua altura:");
        Altura = input.nextDouble();
        System.out.println("Dígite seu peso:");
        Peso = input.nextDouble();

        imc = Peso / (Altura * Altura);

        if (Peso < 18,5)
        {
            System.out.print("Abaixo do Peso \n");
        } else if (idade >= 13 && idade <= 17){
            System.out.print("Adolescente \n");
        } else if (idade >= 18 && idade <= 59){
            System.out.print("Adulto \n");
        } else if (idade > 60){
            System.out.print("idoso \n");
        }


        System.out.printf("Seu peso é: " + Peso + "\n");
        System.out.printf("\n Sua altura é: " + Altura + "\n");

        
    }
}
