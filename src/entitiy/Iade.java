package entitiy;

import java.util.Date;

public class Iade {
    private int id;
    private Date date;
    private int tutar;

    private int mukellefId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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
