
public class hasta {

    static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private int id;
    private String isim;
    private String soyisim;
    private String bolum;
    private String sikayet;

    public hasta(int id, String isim, String soyisim, String bolum, String sikayet) {
        this.id = id;
        this.isim = isim;
        this.soyisim = soyisim;
        this.bolum = bolum;
        this.sikayet = sikayet;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getSikayet() {
        return sikayet;
    }

    public void setSikayet(String sikayet) {
        this.sikayet = sikayet;
    }

}
