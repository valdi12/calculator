

 /**
 * kalkulator 
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public class kalkulator implements simpanOperasiKalkulator
{
     // op1
    public double op1=0;
    public double op2=0;
    public static final String info = "Kalkulatorku";
    public static int jumlahobject = 0;
    private simpanOperasiKalkulator sok;

    /**
     * Constructor for objects of class kalkulator
     */
    public kalkulator()
    {
        // initialise instance variables
        this.jumlahobject += 1;
    }
      /**
     * Constructor for objects of class kalkulator
     */
    public kalkulator(simpanOperasiKalkulator sok)
    {
        // initialise instance variables
        this.sok = sok;
    }
    /**
     * Constructor for objects of class kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */
    public kalkulator(double op1, double op2)
    {
        this.op1 = op1;
        this.op2 = op2;
        this.jumlahobject += 1;

    }
    /**
     * Constructor for objects of class kalkulator
     * @param  double, double inisialisasi nilai dari op1 dan op2
    */

    public kalkulator(double op2)
    {
        this.op2 = op2;
        this.jumlahobject += 1;

    }
    /**
     * set op1
     *
     * @param  double op1  
     * @return  void
     */
    public void setOp1(double op1)
    {
        this.op1 = op1;
    }
    /**
     * set sok
     *
     * @param  simpanOperasiKalkulator   
     * @return  void
     */
    public void setSimpanOperasi(simpanOperasiKalkulator sok)
    {
        this.sok = sok;
    }

    /**
     * get op1
     *
     * @param  double op1  
     * @return  void
     */
    public double  getOp1()
    {
        return this.op1;
    }
    /**
     * jumlah tanpa parameter
     *
     * @param  
     * @return  double hasil penjumlahan op1 + op2
     */
    public double jumlah() 
    {
        simpanOperasi(String.valueOf(this.op1) +" + "+ String.valueOf(this.op2));
        return this.op1 + this.op2;
    }
     /**
     * jumlah dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil penjumlahan op1 + op2
     */
    public double jumlah(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return jumlah();
    }
    
    public double kurang()
    {
        return this.op1 - this.op2;
    }
     /**
     * kurang dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil pengurangan op1 - op2
     */

     public double kurang(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1- this.op2;
    }
    public double kali()
    {
        return this.op1 * this.op2;
    }
     /**
     * kali dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil perkalian op1 * op2
     */

     public double kali(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1 * this.op2;
    }
    public double bagi()
    {
        return this.op1 / this.op2;
    }
     /**
     * bagi dengan parameter
     *
     * @param  double op1
     *         double op2
     * @return double hasil pembagian op1 \op2
     */  
    
     public double bagi(double op1, double op2) 
    {
        this.op1 = op1;
        this.op2 = op2;
        return this.op1 /this.op2;
    }

     /**
     * simpanOperasi
     *
     * @param  String data
     *      
     * @return void
     */
    public void simpanOperasi(String data) 
    {
        //simpan operasi
        this.sok.simpanOperasi(data);
    }
    /**
     * bacaOperasi
     *
     * @param  void
     *      
     * @return String
     */
    public String bacaOperasi() 
    {
        //baca operasi
        return this.sok.bacaOperasi();
    }
}   
    
    

    
  

