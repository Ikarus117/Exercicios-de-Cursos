import javax.swing.JOptionPane;
public class Soletrando{
   public static void main(String [] args){
      /*int v[] = {2,0,3,9};
      v[v[2]] = v[v[1]];
      for( int i:v){
      JOptionPane.showMessageDialog(null, i);
      }*/
      String s = "CURSOEMVIDEO";
      char[] r = new char[12];
      for (int c=s.length()-1; c>=0; c--){
        r[c] = s.charAt(c); 
      }
      for (char l: r){
         JOptionPane.showMessageDialog(null, l);
      }
   }
}