import javax.swing.JOptionPane;

public class Exemplo15{
   static void soma (int a, int b){
      int s = a + b;
         JOptionPane.showMessageDialog(null, "Soma: "+ s);
      }
   public static void main(String [] args){
      JOptionPane.showMessageDialog(null, "Come�o");
      soma(5,2);
   }
}