package view;

import controller.GelirFaturaController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;



import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class GelirFaturaPanel extends JPanel {
    private GelirFaturaController controller;
    private JTextField tarihField;
    private JTextField vergiNoField;
    private JTextField tutarField;
    private JButton addButton;
    private JTable gelirFaturaTable;

    public GelirFaturaPanel() {
        controller = new GelirFaturaController();
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputPanel.add(new JLabel("Tarih:"));
        tarihField = new JTextField();
        inputPanel.add(tarihField);

        inputPanel.add(new JLabel("Vergi No:"));
        vergiNoField = new JTextField();
        inputPanel.add(vergiNoField);

        inputPanel.add(new JLabel("Tutar:"));
        tutarField = new JTextField();
        inputPanel.add(tutarField);

        addButton = new JButton("Gelir Faturası Ekle");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        gelirFaturaTable = new JTable();
        add(new JScrollPane(gelirFaturaTable), BorderLayout.CENTER);

        loadGelirFaturaIslemleri();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tarih = tarihField.getText();
                    String vergiNo = vergiNoField.getText();
                    double tutar = Double.parseDouble(tutarField.getText());

                    if (controller.addGelirFatura(tarih, vergiNo, tutar)) {
                        JOptionPane.showMessageDialog(GelirFaturaPanel.this, "Gelir faturası başarıyla eklendi!");
                        loadGelirFaturaIslemleri();
                    } else {
                        JOptionPane.showMessageDialog(GelirFaturaPanel.this, "İşlem eklenemedi.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(GelirFaturaPanel.this, "Hata: " + ex.getMessage());
                }
            }
        });
    }

    private void loadGelirFaturaIslemleri() {
    try {
        ResultSet resultSet = controller.getGelirFaturalar();

        // Tablo başlıklarını belirleyin
        String[] columnNames = {"Tarih", "Vergi No", "Tutar"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // ResultSet'ten verileri al ve tabloya ekle
        while (resultSet.next()) {
            String tarih = resultSet.getString("tarih");
            String vergiNo = resultSet.getString("vergi_no");
            double tutar = resultSet.getDouble("tutar");

            Object[] row = {tarih, vergiNo, tutar};
            tableModel.addRow(row);
        }

        // JTable'a modeli ata
        gelirFaturaTable.setModel(tableModel);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Veriler yüklenemedi: " + e.getMessage());
    }
}

}
