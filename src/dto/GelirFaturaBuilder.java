package dto;

import entitiy.GelirFatura;

import java.util.Date;

public class GelirFaturaBuilder {


    private final int id;
    private final String faturaNo;
    private final String aliciSirket;
    private final String aliciVergiNo;
    private int iskonto;
    private Date tarih;
    private int tutar;
    private String aciklama;
    private int mukellefId;

    public GelirFaturaBuilder(int id, String faturaNo, String aliciSirket, String aliciVergiNo) {
        this.id = id;
        this.faturaNo = faturaNo;
        this.aliciSirket = aliciSirket;
        this.aliciVergiNo = aliciVergiNo;
    }

    public GelirFaturaBuilder iskonto(int iskonto) {
        this.iskonto = iskonto;
        return this;
    }

    public GelirFaturaBuilder tarih(Date tarih) {
        this.tarih = tarih;
        return this;
    }

    public GelirFaturaBuilder tutar(int tutar) {
        this.tutar = tutar;
        return this;
    }

    public GelirFaturaBuilder aciklama(String aciklama) {
        this.aciklama = aciklama;
        return this;
    }

    public GelirFaturaBuilder mukellefId(int mukellefId) {
        this.mukellefId = mukellefId;
        return this;
    }

    public GelirFatura build() {
        return new GelirFatura(this);
    }
}








