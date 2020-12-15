
public class HastaBakici {
    private String isim;
    private String soyisim;
    private String bakilacakOdalar;
    private String nöbetgünü;

    public HastaBakici(String isim, String soyisim, String bakilacakodalar, String nöbetgünü) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.bakilacakOdalar = bakilacakodalar;
        this.nöbetgünü = nöbetgünü;
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

    public String getBakilacakOdalar() {
        return bakilacakOdalar;
    }

    public void setBakilacakOdalar(String bakilacakodalar) {
        this.bakilacakOdalar = bakilacakodalar;
    }

    public String getNöbetgünü() {
        return nöbetgünü;
    }

    public void setNöbetgünü(String nöbetgünü) {
        this.nöbetgünü = nöbetgünü;
    }
    
    
}
