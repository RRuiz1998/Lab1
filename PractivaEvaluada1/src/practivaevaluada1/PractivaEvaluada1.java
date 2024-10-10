
package practivaevaluada1;

import javax.swing.JOptionPane;


public class PractivaEvaluada1 {
    
    public static void main(String[] args) {
        
        int i = 0;
        double acomulador = 0;
        
        while (i==0){
            
        
        
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el sueldo del empleado: "));

            double sem = ((salario/100)*9.25);
            double ivm = ((salario/100)*5.08);

            double ccss = sem+ivm;
            
            acomulador = acomulador + ccss;
            


            int option = Integer.parseInt(JOptionPane.showInputDialog("Deseas agregar otro empleado? 1. Si 2. No"));
            
            

            if (option==2){
                    i++;

            }

        }
        
        System.out.println("La empresa debera abonar a la CCSS el monto de "+acomulador+" por concepto de SEM y IVM");

      
    }
        
}
        
        
           
       



    
    

