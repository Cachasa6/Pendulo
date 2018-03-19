
package pendulo;

import javax.swing.JOptionPane;


public class prueba {
    public static void main(String[] args) {
        Pendulo ob = new Pendulo(5, 9.8);
        JOptionPane.showMessageDialog(null, "Pendulo\n"+ob.getLongitud()+" "+ob.getAceleraciongravitacional());
        
    }
}
