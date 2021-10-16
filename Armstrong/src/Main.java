import java.util.Scanner;


//Armstrong code with do-while
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        System.out.print("Basamak sayısını giriniz: ");
        int basamak_sayisi = scanner.nextInt();

        int gecici_sayi = sayi;

        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi = gecici_sayi / 10; // gecici_sayi /= 10;

            toplam += Math.pow(basamak_degeri, basamak_sayisi);

        }while (gecici_sayi > 0);

        if (sayi == toplam) {

            System.out.println("Bu sayı bir armstrong sayısıdır");
        }
        else {

            System.out.println("Bu sayı bir armstrong sayısı değildir.");
        }
    }
}
