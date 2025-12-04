package controller;

import core.Baglanti;
import java.sql.*;

public class SigortaController<dbConnection> {
    private Baglanti dbConnection;

    public SigortaController() {
        dbConnection = new Baglanti();
    }

    public ResultSet getSigortaIslemleri() throws SQLException {
        String query = "SELECT * FROM sigorta_islemleri";
        return dbConnection.executeQuery(query);
    }

    public boolean addSigortaIslem(String sirketAdi, int calisanSayisi) throws SQLException {
        String query = "INSERT INTO sigorta_islemleri (sirket_adi, calisan_sayisi) VALUES ('" + sirketAdi + "', " + calisanSayisi + ")";
        return dbConnection.executeUpdate(query) > 0;
    }

    public double calculatePrim(String sirketAdi) throws SQLException {
        String query = "SELECT prim FROM sigorta_islemleri WHERE sirket_adi = '" + sirketAdi + "'";
        ResultSet rs = dbConnection.executeQuery(query);
        if (rs.next()) {
            return rs.getDouble("prim");
        }
        return 0;
    }
}
