import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        String nome;
        int idade;

        System.out.println("Dígite seu nome: "); 
        nome = input.next();

        System.out.println("Dígite sua idade: "); 
        idade = input.nextInt();

        if (idade >= 0 && idade <= 12)
        {
            System.out.print("Criança \n");
        } else if (idade >= 13 && idade <= 17){
            System.out.print("Adolescente \n");
        } else if (idade >= 18 && idade <= 59){
            System.out.print("Adulto \n");
        } else if (idade > 60){
            System.out.print("idoso \n");
        }

    }
}
