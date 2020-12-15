
public class temizlikPersoneli {

    private String isim;
    private String soyisim;
    private String bakilacakKatlar;

    public temizlikPersoneli(String isim, String soyisim, String bakilacakKatlar) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bakilacakKatlar = bakilacakKatlar;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBakilacakKatlar() {
        return bakilacakKatlar;
    }

    public void setBakilacakKatlar(String bakilacakKatlar) {
        this.bakilacakKatlar = bakilacakKatlar;
    }
    
    
}
