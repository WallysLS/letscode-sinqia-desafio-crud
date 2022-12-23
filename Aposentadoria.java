import java.time.Year;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aposentadoria{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("");
        System.out.println("Esse é um sistema de verificação para aposentadoria");
        System.out.println("Digite o seu ano de nascimeto e o ano de entrada na empresa");
        int nascimento = 0;
        int anoEntrada = 0;


        do{
            try{
                 nascimento = input.nextInt();
                 anoEntrada = input.nextInt();
            } catch(InputMismatchException erro){
                System.out.println("A entrada é inválida, digite os dados novamente");
            } input.nextLine();
        } while(nascimento == 0 || anoEntrada == 0);

        requerimento( nascimento, anoEntrada);
    } 

    
    public static void requerimento(int x, int y){
        int idade = Year.now().getValue() - x;
        int anosTrabalhados = Year.now().getValue() - y;

        if(idade >= 65 || anosTrabalhados >= 30 || (idade >= 60 && anosTrabalhados >= 25)){
            System.out.println("Você pode se aposentar");
        } else{
            System.out.println("Você não pode se aposentar");                        
        }
    }

  } 