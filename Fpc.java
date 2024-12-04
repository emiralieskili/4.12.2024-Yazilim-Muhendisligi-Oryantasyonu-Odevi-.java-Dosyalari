package fpc;
import java.util.Scanner;
public class Fpc {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String islem;
        System.out.println("Bu program sectiginiz islemele gore faktoryel, permutasyon ya da kombinasyon almaktadır.(f/p/c)");
        System.out.println("Bir islem cesidi seciniz: ");
        islem=input.nextLine();
        switch (islem){
            case "f":
                int sayi, faktoryel=1;
                System.out.println("Faktoryelini almak istediginiz sayiyi giriniz: ");
                sayi=input.nextInt();
                for(int i=1;i<=sayi;i++){
                    faktoryel=faktoryel*i;
                }
                System.out.println(sayi+" sayisinin faktoryeli: "+ faktoryel);
                break;
            case "p":
                int sayi1,sayi2,permutasyon=1;
                System.out.println("Permutasyonunu almak istediginiz sayiyi giriniz: ");
                sayi1=input.nextInt();
                System.out.println("Sayinin kacli permutasyonunu almak istiyorsunuz? ");
                sayi2=input.nextInt();
                int k=sayi1;
                for(int i=1;i<=sayi2;i++){
                    permutasyon=permutasyon*sayi1;
                    sayi1--;
                }
                System.out.println(k+" sayisinin "+sayi2+"'li permutasyonu: "+permutasyon);
                break;
            case "c":
                int sayi3,sayi4,kombinasyon,gecici1=1,gecici2=1;
                System.out.println("Kombinasyonunu almak istediginiz sayiyi giriniz: ");
                sayi3=input.nextInt();
                System.out.println("Sayinin kacli kombinasyonunu alacaksiniz: ");
                sayi4=input.nextInt();
                int j=sayi3,l=sayi4;
                for(int i=1;i<=l;i++){
                    gecici1=gecici1*sayi3;
                    sayi3--;
                    gecici2=gecici2*sayi4;
                    sayi4--;
                }
                kombinasyon=gecici1/gecici2;
                System.out.println(j+" sayisinin "+l+"'li kombinasyonu: "+kombinasyon);
                break;
            default:
                System.out.println("HATALI GIRIS YAPTINIZ.");
                
        }
    }
}
