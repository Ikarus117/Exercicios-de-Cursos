

import java.util.Scanner;

public class ProgramaIdade {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        System.out.print("Ano de Nascimento: ");
        int nasc = t.nextInt();
        int idade = 2023 - nasc;
        System.out.println("Idade: " + idade);
        if (idade>=18) {
            System.out.println("Maior");
        } else{
            System.out.println("Menor");
        }
    }
}
