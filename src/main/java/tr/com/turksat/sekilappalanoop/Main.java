package tr.com.turksat.sekilappalanoop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Sekil seciliSekil = null;
        char sembol = '*';
        ToplamAlanCevre toplamAlanCevre = new ToplamAlanCevre();

        while (true) {
            LogUtil.log("");
            LogUtil.log("Seçenekler:");
            LogUtil.log("1: Küçük Kare çiz");
            LogUtil.log("2: İstediğin boyutta kare çiz");
            LogUtil.log("3: Dikdörtgen çiz");
            LogUtil.log("4: Üçgen çiz");
            LogUtil.log("5: Daire çiz");
            LogUtil.log("6: Toplam alan ve çevre bilgilerini göster");
            LogUtil.log("7: Alan ve çevre hesaplamalarını sıfırla");
            LogUtil.log("8: Yeni Sembol ");
            LogUtil.log("8: Çıkış");
            LogUtil.log("Seçiminiz: ");

            int secim = scanner.nextInt();
            scanner.nextLine();
            switch (secim) {
                case 1:
                    seciliSekil = new Kare(3, sembol);
                    seciliSekil.ciz();
                    toplamAlanCevre.alanEkle(seciliSekil.alanHesapla());
                    toplamAlanCevre.cevreEkle(seciliSekil.cevreHesapla());
                    break;
                case 2:
                    LogUtil.log("Kare boyutunu girin: ");
                    int kareBoyut = scanner.nextInt();
                    seciliSekil = new Kare(kareBoyut, sembol);
                    seciliSekil.ciz();
                    toplamAlanCevre.alanEkle(seciliSekil.alanHesapla());
                    toplamAlanCevre.cevreEkle(seciliSekil.cevreHesapla());
                    break;
                case 3:
                    LogUtil.log("Dikdörtgen genişliğini girin: ");
                    int genislik = scanner.nextInt();
                    LogUtil.log("Dikdörtgen yüksekliğini girin: ");
                    int yukseklik = scanner.nextInt();
                    seciliSekil = new Dikdortgen(genislik, yukseklik, sembol);
                    seciliSekil.ciz();
                    toplamAlanCevre.alanEkle(seciliSekil.alanHesapla());
                    toplamAlanCevre.cevreEkle(seciliSekil.cevreHesapla());
                    break;
                case 4:
                    LogUtil.log("Üçgenin yüksekliğini girin:");
                    int yukselik=scanner.nextInt();
                    seciliSekil= new Ucgen(yukselik, sembol);
                    seciliSekil.ciz();
                    toplamAlanCevre.alanEkle(seciliSekil.alanHesapla());
                    toplamAlanCevre.cevreEkle(seciliSekil.cevreHesapla());
                    break;
                case 5:
                    LogUtil.log("Dairenin çapını girin: ");
                    int cap = scanner.nextInt();
                    seciliSekil = new Daire(cap, sembol);
                    seciliSekil.ciz();
                    toplamAlanCevre.alanEkle(seciliSekil.alanHesapla());
                    toplamAlanCevre.cevreEkle(seciliSekil.cevreHesapla());
                    break;
                case 6:
                    toplamAlanCevre.toplamBilgisi();
                    break;

                case 7:
                    toplamAlanCevre.reset();
                    LogUtil.log("Alan ve çevre sıfırlandı.");
                    break;
                case 8:
                    System.out.print("Yeni sembolü girin: ");
                    sembol = scanner.next().charAt(0);
                    if (seciliSekil != null) {
                        seciliSekil.sembolDegistir(sembol);
                        seciliSekil.ciz();
                    }
                    break;
                case 9:
                    LogUtil.log("Programdan çıkılıyor...");
                    System.exit(0);
                    break;
                default:
                    LogUtil.log("Geçersiz seçenek. Tekrar deneyini.");
            }
        }

    }
}