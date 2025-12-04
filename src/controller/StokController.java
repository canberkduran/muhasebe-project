package controller;

import java.sql.*;

import core.Baglanti;

public class StokController {
    private Baglanti dbConnection;

    public StokController() {
        dbConnection = new Baglanti();
    }

    public ResultSet getStoklar() throws SQLException {
        String query = "SELECT * FROM stoklar";
        return dbConnection.executeQuery(query);
    }

    public boolean addStok(String urunAdi, String birim, int miktar, double fiyat) throws SQLException {
        String query = "INSERT INTO stoklar (urun_adi, birim, miktar, fiyat) VALUES ('" + urunAdi + "', '" + birim + "', " + miktar + ", " + fiyat + ")";
        return dbConnection.executeUpdate(query) > 0;
    }
}

