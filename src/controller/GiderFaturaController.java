package controller;

import java.sql.*;

import core.Baglanti;

public class GiderFaturaController {
    private Baglanti dbConnection;

    public GiderFaturaController() {
        dbConnection = new Baglanti();
    }

    public ResultSet getGiderFaturalar() throws SQLException {
        String query = "SELECT * FROM gider_faturalar";
        return dbConnection.executeQuery(query);
    }

    public boolean addGiderFatura(String tarih, String vergiNo, double tutar) throws SQLException {
        String query = "INSERT INTO gider_faturalar (tarih, vergi_no, tutar) VALUES ('" + tarih + "', '" + vergiNo + "', " + tutar + ")";
        return dbConnection.executeUpdate(query) > 0;
    }
}

