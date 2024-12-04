package collatzproblemi;
import java.util.Scanner;
public class Collatzproblemi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("BU PROGRAM GIRDIGINIZ SAYININ KAC ADIMDA COLLATZ PROBLEMINE GORE 1'E ULASACAGINI HESAPLAMAKTADIR");
        int sayi,i=0;
        System.out.println("Bir sayi giriniz: ");
        sayi=input.nextInt();
        while(sayi>1){
            if(sayi%2==0){
                sayi=sayi/2;
            }
            else{
                sayi=3*sayi+1;
            }
            i++;
        }
        System.out.println(sayi+" sayisi collatz problemine gore "+i+" adimda 1'e ulasmistir.");
    }
    
}
