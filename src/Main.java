import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        //Scanner sınıfını tanımladım
        Scanner input = new Scanner(System.in);

        //Değerler
        System.out.print("Matematik Notu: ");
        mat = input.nextInt();

        System.out.print("Fizik Notu: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notu: ");
        kimya = input.nextInt();

        System.out.print("Tarih Notu:");
        tarih = input.nextInt();

        System.out.print("Müzik Notu: ");
        muzik = input.nextInt();

        int toplam = (mat + fizik + kimya + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("Ortalama : " + sonuc);

        if (sonuc> 60) {
            System.out.println("Geçti");
        } else {
            System.out.println("Kaldı");
        }
    }
}

