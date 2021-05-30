
import java.lang.Math;
/**
 * Abstract class CalculatorTrigonometri 
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public abstract class kalkulatorTrigonometri extends kalkulator
{
    protected double sudut;
   public abstract void konversi(double sudut);
   
   public double sin()
   {
       return Math.sin(this.sudut); 
   }
   
   public double cos()
   {
       return Math.cos(this.sudut);
    }
   // tan
   public double tan()
   {
       return Math.tan(this.sudut);
    }
}
