import java.util.Scanner;

//Armstrong code with for
public class Main2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int sayi = scanner.nextInt();
        int basamak_sayisi = String.valueOf(sayi).length();

        int gecici_sayi = sayi;

        int toplam = 0;

        for (; sayi > 0; sayi /= 10) {

            int basamak_degeri = sayi % 10;
            System.out.println(basamak_degeri);

            toplam += Math.pow(basamak_degeri, basamak_sayisi);

        }

        if (toplam == gecici_sayi) {
            System.out.println("Sayı bir armstrong sayısıdır" + toplam);
        }
        else {
            System.out.println("Sayı bir armstrong sayısı değildir." + toplam);
        }

    }
}