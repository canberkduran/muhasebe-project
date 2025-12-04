package entitiy;

import java.util.Date;

import dto.GiderFaturaBuilder;

public class GiderFatura {

    private int id;
    private String faturaNo;
    private String saticiSirket;
    private Date tarih;
    private int tutar;

    private int mukellefId;



    public GiderFatura(GiderFaturaBuilder giderFaturaBuilder) {
        //TODO Auto-generated constructor stub
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFaturaNo() {
        return faturaNo;
    }

    public void setFaturaNo(String faturaNo) {
        this.faturaNo = faturaNo;
    }

    public String getSaticiSirket() {
        return saticiSirket;
    }

    public void setSaticiSirket(String saticiSirket) {
        this.saticiSirket = saticiSirket;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getMukellefId() {
        return mukellefId;
    }

    public void setMukellefId(int mukellefId) {
        this.mukellefId = mukellefId;
    }
}
