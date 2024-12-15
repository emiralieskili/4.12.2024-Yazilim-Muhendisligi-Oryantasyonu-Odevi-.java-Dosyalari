package tabanalma;
import java.util.Scanner;
public class Tabanalma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,taban,kalan;
        String sonuc="";
        System.out.println("BU PROGRAM ONLUK SISTEMDEKI SAYILARI IKILIK SEKIZLIK VE ON ALTILIK SISTEME DONUSTURUR");
        System.out.println("Onluk sistemdeki sayi: ");
        sayi=input.nextInt();
        System.out.println("Taban degerini giriniz: ");
        taban=input.nextInt();
        switch(taban){
            case 2:
                while(true){
                    kalan=sayi%taban;
                    sayi=sayi/taban;
                    sonuc=kalan+sonuc;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("Sonuc: "+sonuc);
                break;
            case 8:
                while(true){
                    kalan=sayi%taban;
                    sayi=sayi/taban;
                    sonuc=kalan+sonuc;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("Sonuc: "+sonuc);
                break;
            case 16:
                while(sayi>0){
                    kalan=sayi%taban;
                    sayi=sayi/taban;
                    switch(kalan){
                        case 10:
                            sonuc="A"+sonuc;
                            break;
                        case 11:
                            sonuc="B"+sonuc;
                            break;                            
                        case 12:
                            sonuc="C"+sonuc;
                            break;
                        case 13:
                            sonuc="D"+sonuc;
                            break;
                        case 14:
                            sonuc="E"+sonuc;
                            break;
                        case 15:
                            sonuc="F"+sonuc;
                            break;
                        default:
                            sonuc=kalan+sonuc;
                    }
                }
                System.out.println("Sonuc: "+sonuc);
                break;
            default:
                System.out.println("SADECE 2LIK 8LIK VE 16LIK TABAN DONUSUMLERI YAPABILIRSINIZ.");
        }
    }
}
