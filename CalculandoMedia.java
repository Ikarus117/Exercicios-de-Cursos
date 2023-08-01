import javax.swing.JOptionPane;
public class CalculandoMedia{
   public static void main(String[] args){
      double a,b,s,media;
      a = 8.5;
      b = 10.2;
      s = a+b;

      media = ((a*4/2)+b);
      JOptionPane.showMessageDialog(null,media+" "+s );
   }
}

