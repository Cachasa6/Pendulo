
package pendulo;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Pendulo {
    private double longitud;
    private double aceleraciongravitacional;

    public Pendulo(double longitud, double aceleraciongravitacional) {
        this.longitud = longitud;
        this.aceleraciongravitacional = aceleraciongravitacional;
    }
    
    

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAceleraciongravitacional() {
        return aceleraciongravitacional;
    }

    public void setAceleraciongravitacional(double aceleraciongravitacional) {
        this.aceleraciongravitacional = aceleraciongravitacional;
    }
    
    

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        
            System.out.print("1. Pendulo\n");
            
            System.out.print("Ingrese el valor de la longitud (L): ");
            double L = 0;
            L = leer.nextFloat();
            double g = 9.8;
            double T;
            T = (2*Math.PI)*Math.sqrt(9.8/L); //Volumen del cono mayor
            System.out.print("El periodo de oscilacion es (T): "+T+"\n");
            
       Pendulo ob = new Pendulo(5, 9.8);
        JOptionPane.showMessageDialog(null, "Pendulo\n"+"Longitud: "+ob.getLongitud()+" m\nAceleracion gravitacional: "+ob.getAceleraciongravitacional()+" m/s2");
    }
    
}
