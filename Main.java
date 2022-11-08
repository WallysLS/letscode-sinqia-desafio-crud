import java.util.Scanner;

public class Main {
public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Quantos valores deseja transformar?:");
    int quantidade = scanner.nextInt();
    System.out.println("Digite os valores(em Celsius, Fahrenheit ou Kelvin):");
    double temperatura = scanner.nextDouble();



    
    System.out.println("Digite 1 para converter Celcius em Fahrenheit\nDigite 2 para Celcius em Kelvin\n"+
              "Digite 3 para Fahrenheit em Celcius\nDigite 4 para Fahrenheit em Kelvin\n"+
              "Digite 5 para Kelvin em Celcius\nDigite 6 para Kelvin em Fahrenheit\n7. Sair");
    int escolha = scanner.nextInt();

        for(int x = 0; x < quantidade; x++) {

    switch(escolha){
        case 1: System.out.println(temperatura + " Celsius em Farenheit: " + (temperatura*9.0/5.0+32));
            break;
        case 2: System.out.println(temperatura + " Celsius em Kelvin: " + (temperatura + 273));
            break;
        case 3: System.out.println(temperatura +" Fahrenheit em Celsius: " + (temperatura-32)/1.8);
            break;
        case 4: System.out.println(temperatura + " Fahrenheit em Kelvin: " + ((temperatura-32)/1.8)+273.15);
            break;
        case 5: System.out.println(temperatura + " Kelvin em Celsius: " + (temperatura - 273.15));
            break;
        case 6: System.out.println(temperatura + " Kelvin em Fahrenheit: " + (temperatura-273.15)+32);
            break;
        case 7: System.exit(0);
            break;
    }}
} }
