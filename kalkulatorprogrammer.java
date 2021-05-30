
/**
 * Write a description of class kalkulatorprogrammer
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public class kalkulatorprogrammer extends kalkulator
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class kalkulatorprogrammer
     */
    public kalkulatorprogrammer()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    /**
     * konversiBilanganDesimaltoHex
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public String konversiBilanganDesimaltoHex(int op1) 
    {
        // DesimaltoHEX
        String hasilKonversi = Integer.toHexString(op1) ;
        return hasilKonversi;
    }
    
    // method konversiBilanganDesimaltoBiner
    public String konversiBilanganDesimaltoBinner(int op1) 
    {
        String hasilKonversi = Integer.toBinaryString(op1) ;
        return hasilKonversi;
    }
}
