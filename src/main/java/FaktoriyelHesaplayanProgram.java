import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        int sayi, sonuc = 1, n, r, nF = 1, rF = 1, nRF = 1, kS;
        Scanner input = new Scanner(System.in);
        // n = eleman sayısı
        // r = seçim sayısı
        // nF = n Faktöriyel
        // rF = r Faktöriyel
        // nRF = n-r Faktöriyel
        // kS = kombinasyon sayısı

        //Faktöriyel Hesaplayan Program
        System.out.print("\n!!! FAKTÖRİYEL HESAPLAYAN PROGRAM\n");

        System.out.print("Faktörüyel hesaplamak için bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 1; x <= sayi; x++) {
            sonuc = sonuc * x;
        }
        System.out.print(sayi + " Faktöriyel= " + sonuc);
    }
}
