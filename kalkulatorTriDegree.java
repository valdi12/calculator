
import java.lang.Math;
/**
 *class kalkulatorTridegree
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public  class kalkulatorTriDegree extends kalkulatorTrigonometri
{
    /**
     * Constructor for objects of class kalkulatorTriDegree
     */
    public kalkulatorTriDegree()
    {
       
    }
    /**
     * konversi
     *
     * @param  double sudut
     * @return void
     */
    public void konversi(double sudut)
    {
        super.sudut = Math.toRadians(sudut);
    }
}
