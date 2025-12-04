package entitiy;

import java.util.List;

public class Stok {
    private int id;
    private String ad;
    private int miktar;
    private int fiyat;

    private int mukellefId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getMiktar() {
        return miktar;
    }

    public void setMiktar(int miktar) {
        this.miktar = miktar;
    }

    public int getFiyat() {
        return fiyat;
    }

    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getMukellefId() {
        return mukellefId;
    }

    public void setMukellefId(int mukellefId) {
        this.mukellefId = mukellefId;
    }
}
