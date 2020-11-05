/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangka;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Angka {
    int AngkaTebakan;
    int AngkaPasang;
    
    void menebak(){
    Random random = new Random();
    this.AngkaPasang = random.nextInt(101);
     System.out.println("Hai... Nama saya Mr. Liem, saya telah memilih bilangan bulat secara acak antara 0 s/d\n" + "100. Silahkan ditebak ya!!!" );
     
     do{
      Scanner Angka =  new Scanner(System.in);
      System.out.println("Angka Tebakan Anda = ");
      this.AngkaTebakan = Angka.nextInt();
      
      if(AngkaTebakan > AngkaPasang){
          System.out.println("HAHAHAHA... angka tebakan anda terlalu besar");
      }else if(AngkaTebakan < AngkaPasang){
           System.out.println("HAHAHAHA... angka tebakan anda terlalu kecil");
      }else{
           System.out.println("Horeee.... Angka yang anda tebak benar");
           break;
      }
     }while(AngkaTebakan != AngkaPasang);
    }
}
