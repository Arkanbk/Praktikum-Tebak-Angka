/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkadenganscor;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Sccor {
     int AngkaTebakan;
    int AngkaPasang;
    int score=100;
    int bonus=5;
    void menebak(){
    Random random = new Random();
    this.AngkaPasang = random.nextInt(101);
     System.out.println("Hai... Nama saya Mr. Liem, saya telah memilih bilangan bulat secara acak antara 0 s/d\n" + "100. Silahkan ditebak ya!!!" );
     do{
      Scanner Angka =  new Scanner(System.in);
      System.out.println("Angka Tebakan Anda = ");
      this.AngkaTebakan = Angka.nextInt();
      
      if(score == 0){
      System.out.println("Game Over alias Bubarr");
      break;
      }
      
      if(AngkaTebakan > AngkaPasang){
          System.out.println("HAHAHAHA... angka tebakan anda terlalu besar");
          score -=2;
          bonus -=1;
      }else if(AngkaTebakan < AngkaPasang){
           System.out.println("HAHAHAHA... angka tebakan anda terlalu kecil");
           score -=2;
          bonus -=1;
      }else{
           System.out.println("Horeee.... Angka yang anda tebak benar");
           if(bonus > 0){
               score +=50;
               System.out.println(score);
           }
            System.out.println("Total Nilai = "+score);
           break;
      }
     }while(AngkaTebakan != AngkaPasang);
    }
}
