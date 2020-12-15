
public class hemsire1 {
    private String isim;
    private String soyisim;
    private String calisacakDoktor;
    private String calisacakStajyer;
    private String nobetGünü;

    public hemsire1(String isim, String soyisim, String calisacakDoktor, String calisacakStajyer, String nobetGünü) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.calisacakDoktor = calisacakDoktor;
        this.calisacakStajyer = calisacakStajyer;
        this.nobetGünü = nobetGünü;
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

    public String getCalisacakStajyer() {
        return calisacakStajyer;
    }

    public void setCalisacakStajyer(String calisacakStajyer) {
        this.calisacakStajyer = calisacakStajyer;
    }

    public String getNobetGünü() {
        return nobetGünü;
    }

    public void setNobetGünü(String nobetGünü) {
        this.nobetGünü = nobetGünü;
    }

    
}
