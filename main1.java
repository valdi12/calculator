
/**
 * Write a description of class main1 here.
 *
 * @author Muhammad RivaldiAl Hajad
 * @version 0.01
 */
public class main1
{
    public static void main(String args[]){
        // menciptakan objek baru dari class Calculator
        kalkulator kalkul = new kalkulator();
        
       
       /*
       System.out.println("");
       double hasil1 = kalkul.jumlah();
       double hasil2 = kalkul.jumlah(3.4, 5.4);
       System.out.println("Hasil penjumlahan method jumlah tanpa parameter: "+ hasil1);
       System.out.println("Hasil penjumlahan method jumlah dengan parameter: "+ hasil2);

       System.out.println("");
       double hasil3 = kalkul.kurang();
       double hasil4 = kalkul.kurang(10, 5);
       System.out.println("Hasil perkurangan method kurang tanpa parameter: "+ hasil3);
       System.out.println("Hasil perkurangan method kurang dengan parameter: "+ hasil4);
    
       System.out.println("");
       double hasil5 = kalkul.kali();
       double hasil6 = kalkul.kali(3, 5);
       System.out.println("Hasil perkalian method kali tanpa parameter: "+ hasil5);
       System.out.println("Hasil perkalian method kali dengan parameter: "+ hasil6);

       System.out.println("");
       double hasil7 = kalkul.bagi();
       double hasil8 = kalkul.bagi(10, 2);
       System.out.println("Hasil Pembagian method bagi tanpa parameter: "+ hasil7);
       System.out.println("Hasil Pembagian method bagi dengan parameter: "+ hasil8);
       */
       
       /*
       kalkulatorprogrammer clp = new kalkulatorprogrammer();
       System.out.println(" \n kalkulatorprogrammer");
       System.out.println("Bentuk Biner dari Desimal " + " :"+ Integer.toBinaryString(500));
       System.out.println("Bentuk Hex dari Desimal " + " :"+ Integer.toHexString(500));

    
      kalkulatorscientific cs = new kalkulatorscientific();
      System.out.println(" \n kalkulatorscientific");
      System.out.println("Faktorial dari 7! adalah" + cs. menghitungFaktorial(7));
      System.out.println("luas lingkarannya adalah" + cs.luas());
      System.out.println("luas Bujur sangkar adalah" + cs.bujurSangkar(12));
      */
    
      /*
      kalkulatorTrigonometri  cls = new kalkulatorTriRadian();
      kalkulatorTrigonometri  clv = new kalkulatorTriDegree();
      System.out.println(" \n CalculatorTrigonometri ");
      System.out.println("Nilai dari sin 60 adalah"+ Math.sin(60));
      System.out.println("Nilai dari Cos 45 adalah"+ Math.cos(45));
      System.out.println("Nilai dari tan 70 adalah"+ Math.tan(70));
      System.out.println("Nilai dari derajat sudut untuk PI/4 adalah " + Math.toDegrees(Math.PI/4) + " derajat");  
      System.out.println("Nilai dari sudut radian untuk sudut 180 derajat adalah " + Math.toRadians(180));
      */
       
       kalkulator kl = new kalkulator();
      simpanOperasiKalkulator  spr = new SimpanOperasiKeMemoryReverse();
      
      
      kl.setSimpanOperasi(spr);
      kl.op1 = 1;
      kl.op2 = 1;
      System.out.println(kl.jumlah());
      
      kl.op1 = 2;
      kl.op2 = 2;
      System.out.println(kl.jumlah());
      
      kl.op1 = 3;
      kl.op2 = 3;
      System.out.println(kl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(kl.bacaOperasi());
      
      
      simpanOperasiKalkulator spf = new SimpanOperasiKeMemoryForwad();
      kl.setSimpanOperasi(spf);
      kl.op1 = 1;
      kl.op2 = 1;
      System.out.println(kl.jumlah());
      
      kl.op1 = 2;
      kl.op2 = 2;
      System.out.println(kl.jumlah());
      
      kl.op1 = 3;
      kl.op2 = 3;
      System.out.println(kl.jumlah());
      System.out.println("Data dari memori: ");
      System.out.println(kl.bacaOperasi());
      
    }
}
       
          
    



