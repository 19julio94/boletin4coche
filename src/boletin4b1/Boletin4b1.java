

package boletin4b1;

import javax.swing.JOptionPane;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin4b1 {
    
   

   
    public static void main(String[] args) {
        
       
       
       Claseboletin4b1 coche=new Claseboletin4b1();
       
       coche.setpGas(1.57f);
       coche.setlitros(50f);
        
       
       float km,litros,vMed,pGas;
       
       String resposta =JOptionPane.showInputDialog("Introduce os km percorridos: ");
       km= Float.parseFloat(resposta);
       litros=Float.parseFloat(JOptionPane.showInputDialog("Introduce os litros: "));
       vMed= Float.parseFloat(JOptionPane.showInputDialog("Introduce a velocidade media: "));
       pGas= Float.parseFloat(JOptionPane.showInputDialog("Introduce o prezo da gasolina: "));
         
       
       
       Claseboletin4b1 coche2 =new Claseboletin4b1(km,litros,vMed,pGas);
      
      JOptionPane.showMessageDialog(null,"O consumo medio e = "+coche2.getconsumoMedio());
      
      JOptionPane.showMessageDialog(null,"A velocidade media e = "+coche2.getvMed());
      
      
       
       
       
       
      
       
 
 
 
    }
    
}
