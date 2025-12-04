package controller;

import java.sql.*;

import core.Baglanti;

public class GelirFaturaController {
    private Baglanti dbConnection;

    public GelirFaturaController() {
        dbConnection = new Baglanti();
    }

    public ResultSet getGelirFaturalar() throws SQLException {
        String query = "SELECT * FROM gelir_faturalar";
        return dbConnection.executeQuery(query);
    }

    public boolean addGelirFatura(String tarih, String vergiNo, double tutar) throws SQLException {
        String query = "INSERT INTO gelir_faturalar (tarih, vergi_no, tutar) VALUES ('" + tarih + "', '" + vergiNo + "', " + tutar + ")";
        return dbConnection.executeUpdate(query) > 0;
    }
}
