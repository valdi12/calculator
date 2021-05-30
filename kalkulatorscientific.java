
/**
 * Write a description of class kalkulatorscientific 
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public class kalkulatorscientific extends kalkulator
{
    
public double phi=0;
    
    
    int sisi;
    //public double r=0;
    
     /**
     * Constructor for objects of class Calculator
     */
    public kalkulatorscientific()
    {
        // initialise instance variables luas lingkaran
        
    //    super.jumlahobject += 1;
       
    }
    
    /**
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2 
     * "Super" -> akses subclass(calculatorscientific) pada superclass(kalkulator)
    */
  
    public kalkulatorscientific(double phi, double op1)
    {
        
        this.phi = phi;
        super.op1 = op1;
     //   super.jumlahobject += 1;
    
    }
    
    
    
    /*
     * Constructor for objects of class Kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
     *
     
    public CalculatorScientific(double phi, double r)
    {
        
        this.phi = phi;
      //  super.jumlahobject += 1;
        
    
    }
    */
    
    
      /** 
     * menghitung Faktorial
     *
     * @param  int op1
     *         
     * @return int 7! = 7x6x5x4x3x2x1 
     */
    public int menghitungFaktorial(int op1){
        if (op1 == 1 || op1 == 0)
        return 1;
        else
            return op1 * menghitungFaktorial(op1 - 1);
    }
     public double luas(){
        double luas, phi=3.14;
        double r= 20;
        luas= phi*r*r;
        return luas;
    }
    
     public double bujurSangkar(int sisi){
        double luas;
        luas=sisi*sisi;
        return luas;
        
    }
    
    
    
    
        
    
          
        
      
}
