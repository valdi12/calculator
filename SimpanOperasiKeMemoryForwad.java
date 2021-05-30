/**
 *  SimpanOperasiKeMemoryForwad
 *
 * @author  Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public class SimpanOperasiKeMemoryForwad implements simpanOperasiKalkulator
{
    private String[] dataMemori = new String[20];
    private int pointer = 0;
    private String tampilMemori;
    public SimpanOperasiKeMemoryForwad()
    {
        
    }

    /**
     * simpanOperasi
     *
     * @param  String data
     * @return void
     */
    public void simpanOperasi(String data)
    {
        this.dataMemori[pointer] = data;
        this.pointer = this.pointer + 1;
        if (this.pointer > 19) this.pointer = 0;
        //this.pointer = this.pointer > 19 ? 0 : this.pointer; 
       
    }
    
    /**
     * bacaOperasi
     *
     * @param  void
     * @return StringArray
     */
    public String bacaOperasi()
    {
        dataMemoriKeTampil();
        return this.tampilMemori;
       
    }
    
     /**
     * dataMemoriKeTampil
     *
     * @param  void
     * @return void
     */
      public void dataMemoriKeTampil(){
        this.tampilMemori = "";
        for(int i = this.pointer - 1; i >=0; i--){
            this.tampilMemori = this.tampilMemori + " " + this.dataMemori[i] + "\n" ;
        }
    }
}
