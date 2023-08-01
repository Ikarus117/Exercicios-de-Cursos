import java.util.Scanner;

public class TiposPrimitivos{
   public static void main(String[]args){
   
      Scanner teclado = new Scanner(System.in);
      System.out.println("Digite o nome");
      String nome = teclado.nextLine();
      System.out.println("Digite a nota");
      float nota = teclado.nextFloat();
      System.out.println("Sua nota: "+nota);
      System.out.printf("Nota de %s: %.1f", nome, nota);
      System.out.format("Nota de %s: %.1f", nome,nota);/*igual ao printf*/
   }
}