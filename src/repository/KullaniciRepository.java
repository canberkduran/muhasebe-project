package repository;

import core.Baglanti;
import entitiy.Kullanici;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class KullaniciRepository {
    private Baglanti baglanti;

    public KullaniciRepository() {baglanti=new Baglanti();}

    public List<Kullanici> getAll(){
        List<Kullanici> kullaniciList=new ArrayList<>();

        String sql = "select * from kullanici";
        Connection con=baglanti.getConnection();

        try {
            Statement st= con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                Kullanici kullanici=new Kullanici();
                kullanici.setId(rs.getInt("id"));
                kullanici.setAd(rs.getString("ad"));
                kullanici.setSoyad(rs.getString("soyad"));
                kullanici.setTc(rs.getString("tc"));
                kullanici.setPassword(rs.getString("password"));
                kullaniciList.add(kullanici);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return kullaniciList;
    }
}
