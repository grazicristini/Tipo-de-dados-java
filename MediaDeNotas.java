import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1, n2, media;

        System.out.println("Informe o valor do primeiro nota: "); 
        n1 = input.nextInt();

        System.out.println("Informe o valor do segundo nota: "); 
        n2 = input.nextInt();

        media = (n1 + n2) / 2;

        System.out.printf("A primeira nota foi = " + n1);
        System.out.printf("\n Segunda nota foi = " + n2);
        System.out.printf("\n Sua média é = " + media + "\n");

        if (media >= 8 && media <= 10)
        {
            System.out.print("Aluno está Aprovado \n");
            
        } else if (media >= 5 && media <= 7){
            System.out.print("Aprovado, mas terá que fazer recuperação \n");
        } else if  (media >= 0 && media <= 4){
            System.out.print("Aluno está Reprovado \n");
        }else{
            System.out.print("Erro na média \n");
        }
    }
}

