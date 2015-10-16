package boletin4b1;



/**
 *
 * @author jpatriciodasilva
 */
public class Claseboletin4b1 {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;

    //contructores
    public Claseboletin4b1() {
       
    }
    
   public Claseboletin4b1(float kmetros,float lit,float vmedia,float pgaso) {
       km=kmetros;
       litros=lit;
       vMed=vmedia;
       pGas=pgaso;
               
             
   }
     //metodos
   public void setkm(float kmetros){
    km=kmetros;
       
   }
   public void  setlitros(float lit){
       litros=lit;
   }
   public void setvMed(float vmedia){
       vMed=vmedia;
      
   }
       
   public void setpGas(float pgaso){
       pGas=pgaso;
   }
    
   public float getTempo(){   
        return km/vMed;
        
    } 
   public float getconsumoMedio(){   
        return (litros*100/km);
        
    } 
   public float getConsumoEuros(){
       return (litros *100/km)*pGas;}
       
    public float getvMed(){
        return (vMed);
        
    
   }
       
   
      
    
}
