package sayitahmini;
import java.util.Scanner;
public class Sayitahmini {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int min=1;
        int max=10;
        int rastgele=(int) (Math.random()*(max-min+1))+min;
        int tahminhakki=3;
        System.out.println("SAYI TAHMIN OYUNUNA HOS GELDINIZ");
        System.out.println("1 ile 10 arasinda bir sayi tuttum. Bilebilecek misin?");
        System.out.println("Tahmin hakkiniz 3'tur");
        for(int i=1;i<=tahminhakki;i++){
            System.out.println("Bir tahmin yapiniz: ");
            int tahmin=input.nextInt();
            if(tahmin==rastgele){
                System.out.println("DOGRU TAHMIN TEBRIKLER.");
                break;
            }
            else if(tahmin<rastgele){
                System.out.println("Daha buyuk bir sayi tahmin ediniz. ");
            }        
            else{
                System.out.println("Daha kucuk bi sayi tahmin ediniz. ");
            }
        }
    }
}
