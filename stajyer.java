
public class stajyer {

    private String isim;
    private String soyisim;
    private String calisacakDoktor;
    private String calisacakHemsire;

    public stajyer(String isim, String soyisim, String calisacakDoktor, String calisacakHemsire) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.calisacakDoktor = calisacakDoktor;
        this.calisacakHemsire = calisacakHemsire;
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

    public String getCalisacakDoktor() {
        return calisacakDoktor;
    }

    public void setCalisacakDoktor(String calisacakDoktor) {
        this.calisacakDoktor = calisacakDoktor;
    }

    public String getCalisacakHemsire() {
        return calisacakHemsire;
    }

    public void setCalisacakHemsire(String calisacakHemsire) {
        this.calisacakHemsire = calisacakHemsire;
    }
    
    
}
