package tr.com.turksat.sekilappalanoop;

/**

 * Tüm şekillerin çizilmesi, sembol değiştirilmesi, alan ve çevre hesaplanması için gerekli metotları içerir.
 */

public interface Sekil {
    /**
     * Şekli ekrana çizer.
     */
    void ciz();

    /**
     * Şeklin sembolünü değiştirir.
     * @param yeniSembol Yeni sembol
     */
    void sembolDegistir(char yeniSembol);

    /**
     * Şeklin alanını hesaplar.
     * @return Alan değeri
     */
    double alanHesapla();

    /**
     * Şeklin çevresini hesaplar.
     * @return Çevre değeri
     */
    double cevreHesapla();

}
