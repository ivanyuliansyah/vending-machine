/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vm;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class VM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Login().show();
        
        int coin, kertas, eMoney;
        int pill=0;
        int am;
        Minuman arrMinuman[]= new Minuman[12];
        
        
        
        
        
       // System.out.println(arrMinuman[5].getHarga());
        
        Scanner inp=new Scanner(System.in);
        
        while(pill==0){
        System.out.println("======= Apa Bentuk Uang Anda=======");
        System.out.println("1. Kertas");
        System.out.println("2. Coin");
        System.out.println("3. Kartu(eMoney)");
        System.out.println("Masukkan Pilihan Anda");
        
        int pillAnda=inp.nextInt();
        switch(pillAnda){
            
            case 1:
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Masukkan besar uang kertas Anda");
                    Scanner input=new Scanner(System.in);
                    kertas= input.nextInt();
                    System.out.println("Pilih minuman!");
                    System.out.println("1. Air Mineral");
                    System.out.println("2. Coca Cola");
                    System.out.println("3. Sprite");
                    System.out.println("4. Fanta");
                    System.out.println("5. Pepsi");
                    System.out.println("6. Milk");
                    Scanner minuman=new Scanner(System.in);
                    am = minuman.nextInt();
                    
                    if(kertas == arrMinuman[am-1].getHarga() ){
                        System.out.println("Silahkan ambil air minum di ");
                        
                    }else if(kertas > arrMinuman[am-1].getHarga()){
                        System.out.println("Silahkan ambil minuman");
                        int kembalian=0;
                        kembalian=(int) (kertas-arrMinuman[am-1].getHarga());
                        System.out.println("Kembalin: "+kembalian);
                    }else  
                    {
                        System.out.println("Maaf uang tidak mencukupi");
                        System.out.println("l");
                        System.out.println("");
                        System.out.println("-----------------------------------------------------------------------------");
                    }
            break;        
            case 2:
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("Masukkan besar uang coin Anda");
                    Scanner masuk=new Scanner(System.in);
                    coin= masuk.nextInt();
                    System.out.println("Pilih minuman!");
                    System.out.println("1. Air Mineral");
                    System.out.println("2. Coca Cola");
                    System.out.println("3. Sprite");
                    System.out.println("4. Fanta");
                    System.out.println("5. Pepsi");
                    System.out.println("6. Milk");
                    Scanner minum=new Scanner(System.in);
                    am = minum.nextInt();
                    
                    if(coin == arrMinuman[am-1].getHarga() ){
                        System.out.println("Silahkan ambil air minum di ");
                        
                    }else if(coin > arrMinuman[am-1].getHarga()){
                        System.out.println("Silahkan ambil minuman");
                        int kembalian=0;
                        kembalian=(int) (coin-arrMinuman[am-1].getHarga());
                        System.out.println(kembalian);
                    }else  
                    {
                        System.out.println("Maaf uang tidak mencukupi");
                        System.out.println("");
                        System.out.println("");
                        System.out.println("-----------------------------------------------------------------------------");
                    }
            
            break;   
            case 3:
                    /*System.out.println("Masukkan kartu Anda");
                    System.out.println("-----------------------------------------------------------------------------");
                    Scanner input2=new Scanner(System.in);
                    eMoney= input2.nextInt();
                    System.out.println("Pilih minuman!");
                    System.out.println("1. Air Mineral");
                    System.out.println("2. Coca Cola");
                    System.out.println("3. Sprite");
                    System.out.println("4. Fanta");
                    System.out.println("5. Pepsi");
                    System.out.println("6. Milk");
                    Scanner min=new Scanner(System.in);
                    am = min.nextInt();
                    //pengecekan saldo pada pembelian, dan kartu harus sudah terdaftar*/
            break;
          
        }
        
        }
        
    }
}
