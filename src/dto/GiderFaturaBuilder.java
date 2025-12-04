package dto;

import entitiy.GelirFatura;
import entitiy.GiderFatura;

import java.util.Date;

public class GiderFaturaBuilder {
    private final int id;
    private final String faturaNo;
    private final String saticiSirket;
    private final String saticiVergiNo;
    private int iskonto;
    private Date tarih;
    private int tutar;
    private String aciklama;
    private int mukellefId;

    public GiderFaturaBuilder(int id, String faturaNo, String saticiSirket, String saticiVergiNo) {
        this.id = id;
        this.faturaNo = faturaNo;
        this.saticiSirket = saticiSirket;
        this.saticiVergiNo = saticiVergiNo;
    }

    public GiderFaturaBuilder iskonto(int iskonto) {
        this.iskonto = iskonto;
        return this;
    }

    public GiderFaturaBuilder tarih(Date tarih) {
        this.tarih = tarih;
        return this;
    }

    public GiderFaturaBuilder tutar(int tutar) {
        this.tutar = tutar;
        return this;
    }

    public GiderFaturaBuilder aciklama(String aciklama) {
        this.aciklama = aciklama;
        return this;
    }

    public GiderFaturaBuilder mukellefId(int mukellefId) {
        this.mukellefId = mukellefId;
        return this;
    }

    public GiderFatura build() {
        return new GiderFatura(this);
    }
}

