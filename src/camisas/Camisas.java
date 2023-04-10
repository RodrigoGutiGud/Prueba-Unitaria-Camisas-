
package camisas;

import javax.swing.JOptionPane;

public class Camisas {

    public static void main(String[] args) {

        double costo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio de la camisa correspondiente: "));
        int x=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de los productos adquiridos: "));
        double cantidad=costo*x;
        
        if (x>=3 && x<=5){ //Descuento entre 3 y 5 artículos
            
            double descuento=cantidad*0.05;
            cantidad=cantidad-descuento;
        } else if(x>5){ //Descuento más de 5 artículos
            
            double descuento=cantidad*0.08;
            cantidad=cantidad-descuento;
        } else{ //Sin Descuento
            double descuento=0;
            cantidad=cantidad-descuento;
        }
        
        JOptionPane.showMessageDialog(null,"El total a pagar sería de: "+cantidad);
        
    }
    
}
