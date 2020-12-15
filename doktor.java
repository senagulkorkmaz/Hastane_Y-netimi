
public class doktor {

    static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String isim;
    private String soyisim;
    private String calisacakHemsire;
    private String calisacakStajyer;
    private String nobetGünü;

    public doktor(String isim, String soyisim, String calisacakHemsire, String calisacakStajyer, String nobetgünü) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.calisacakHemsire = calisacakHemsire;
        this.calisacakStajyer = calisacakStajyer;
        this.nobetGünü = nobetgünü;
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

    public String getCalisacakHemsire() {
        return calisacakHemsire;
    }

    public void setCalisacakHemsire(String calisacakHemsire) {
        this.calisacakHemsire = calisacakHemsire;
    }

    public String getCalisacakStajyer() {
        return calisacakStajyer;
    }

    public void setCalisacakStajyer(String calisacakStajyer) {
        this.calisacakStajyer = calisacakStajyer;
    }

    public String getNobetgünü() {
        return nobetGünü;
    }

    public void setNobetgünü(String nobetgünü) {
        this.nobetGünü = nobetgünü;
    }
}
