package tabanaritmetiği;
import java.util.Scanner;
public class TabanAritmetiği {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("BU PROGRAMLAK 10LUK SISTEMDEKI SYAILARI 2 ILE 9 ARASINDA SECTIGINIZ SISTEMEM DONUSTURUR.");
        int sayi,taban,kalan;
        String sonuc="";
        System.out.println("Bir sayi giriniz: ");
        sayi=input.nextInt();
        System.out.println("Kaclik tabana donustureceksiniz? ");
        taban=input.nextInt();
        switch(taban){
            case 2:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;
            case 3:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;
            case 4:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;
            case 5:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;
            case 6:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;                
            case 7:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;                
            case 8:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;                
            case 9:
                while(true){
                    kalan=sayi%taban;
                    sonuc=kalan+sonuc;
                    sayi=sayi/taban;
                    if(taban>sayi){
                        sonuc=sayi+sonuc;
                        break;
                    }
                }
                System.out.println("GIRDIGINIZ SAYININ IKILIK SISTEMDEKI KARSILIGI: "+sonuc);
                break;
        }
    }
}
