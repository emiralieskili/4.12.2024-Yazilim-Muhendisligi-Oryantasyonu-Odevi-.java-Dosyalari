package diziler;
import java.util.Scanner;
public class Diziler {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int ilkterim, istenenterim,ortakcarpan;
        String dizicesidi;
        System.out.println("BU PROGRAM ISTEDIGINIZ DIZI CESIDINE GORE ITEDIGINIZ TERIMIN DEGERINI VERIR.");
        System.out.println("Dizi cesidinizi secin(aritmetik/geometrik): ");
        dizicesidi=input.nextLine();
        if(dizicesidi.equals("aritmetik")){
            int toplam;
            System.out.println("Ilk terimi giriniz: ");
            ilkterim=input.nextInt();
            System.out.println("Istenen terimi giriniz: ");
            istenenterim=input.nextInt();
            System.out.println("Ortak carpani giriniz: ");
            ortakcarpan=input.nextInt();
            toplam=ilkterim+(istenenterim-1)*ortakcarpan;
            System.out.println("Girdiginiz dizi cesidine gore istenen terim: " + toplam);
        }
        else if(dizicesidi.equals("geometrik")){
            int gecici=1,toplam;
            System.out.println("Ilk terimi giriniz: ");
            ilkterim=input.nextInt();
            System.out.println("Istenen terimi giriniz: ");
            istenenterim=input.nextInt();
            System.out.println("Ortak carpani giriniz: ");
            ortakcarpan=input.nextInt();
            while(istenenterim>1){
                gecici=gecici*ortakcarpan;
                istenenterim--;
            }
            toplam=ilkterim*gecici;
            System.out.println("Girdiginiz dizi cesidine gore istenen terim: " + toplam);
        }
        else{
            System.out.println("HATALI DIZI CESIDI GIRDINIZ.");
        }
    }
}
