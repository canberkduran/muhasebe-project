package entitiy;

public class Sigorta {
    private int id;
    private int calisanAdet;
    private int primTutari;

    private int mukellefId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCalisanAdet() {
        return calisanAdet;
    }

    public void setCalisanAdet(int calisanAdet) {
        this.calisanAdet = calisanAdet;
    }

    public int getPrimTutari() {
        return primTutari;
    }

    public void setPrimTutari(int primTutari) {
        this.primTutari = primTutari;
    }

    public int getMukellefId() {
        return mukellefId;
    }

    public void setMukellefId(int mukellefId) {
        this.mukellefId = mukellefId;
    }


}
