package entitiy;

import dto.GelirFaturaBuilder;
import dto.GiderFaturaBuilder;

import java.io.Serializable;
import java.util.Date;

public class GelirFatura implements Cloneable {
    private int id;
    private String faturaNo;
    private String aliciSirket;
    private String aliciVergiNo;
    private int iskonto;
    private Date tarih;
    private int tutar;
    private String aciklama;
    private int mukellefId;

//    public GelirFatura(GelirFaturaBuilder builder) {
//
//    }

    public GelirFatura(GiderFaturaBuilder gelirFaturaBuilder) {
        //TODO Auto-generated constructor stub
    }

    public GelirFatura(GelirFaturaBuilder gelirFaturaBuilder) {
        //TODO Auto-generated constructor stub
    }

    public String getAliciVergiNo() {
        return aliciVergiNo;
    }

    public void setAliciVergiNo(String aliciVergiNo) {
        this.aliciVergiNo = aliciVergiNo;
    }

    public int getIskonto() {
        return iskonto;
    }

    public void setIskonto(int iskonto) {
        this.iskonto = iskonto;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
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

    public String getAliciSirket() {
        return aliciSirket;
    }

    public void setAliciSirket(String aliciSirket) {
        this.aliciSirket = aliciSirket;
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

    @Override
    protected GelirFatura clone() throws CloneNotSupportedException {
        return (GelirFatura) super.clone();
    }
}
