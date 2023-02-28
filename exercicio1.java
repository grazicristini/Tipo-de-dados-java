import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int n1;

        System.out.println("Informe o primeiro número: "); 
        n1 = input.nextInt();

        if (n1 > 0)
        {
            System.out.println("Número positivo");
        }else if (n1 < 0){
            System.out.println("Número negativo \n");
        }else {
            System.out.println("Número É 0 \n");
        }
    }
}
