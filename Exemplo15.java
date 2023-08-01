import javax.swing.JOptionPane;

public class Exemplo15{
   static void soma (int a, int b){
      int s = a + b;
         JOptionPane.showMessageDialog(null, "Soma: "+ s);
      }
   public static void main(String [] args){
      JOptionPane.showMessageDialog(null, "Começo");
      soma(5,2);
   }
}