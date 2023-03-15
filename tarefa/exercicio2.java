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

        if (imc < 18.5)
        {
            System.out.print("Abaixo do Peso \n");
        } else if (imc >= 18.5 && Peso <=24.9){
            System.out.print("Peso Normal \n");
        } else if (imc >= 25.0 && imc <= 29.9){
            System.out.print("Sobrepeso \n");
        } else if (imc >= 30.0 && imc <= 34){
            System.out.print("Obesidade grau 1 \n");
        } else if (imc >= 35.0 && imc <= 39.9){
            System.out.print("Obesidade Grau 2 \n");
        } else if (imc > 40.0){
            System.out.print("Obesidade grau 3 (mórbida) \n");
        }


        System.out.printf("\n Seu peso é: " + Peso + "\n");
        System.out.printf("\n Sua altura é: " + Altura + "\n");
        System.out.printf("\n" + imc + "\n");


    }
}
