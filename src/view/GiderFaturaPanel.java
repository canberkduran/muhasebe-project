package view;

import controller.GiderFaturaController;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class GiderFaturaPanel extends JPanel {
    private GiderFaturaController controller;
    private JTextField tarihField;
    private JTextField vergiNoField;
    private JTextField tutarField;
    private JTable giderFaturaTable;
    private JButton addButton;

    public GiderFaturaPanel() {
        controller = new GiderFaturaController();
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(4, 2));
        
        inputPanel.add(new JLabel("Tarih:"));
        tarihField = new JTextField();
        inputPanel.add(tarihField);

        inputPanel.add(new JLabel("Vergi No:"));
        vergiNoField = new JTextField();
        inputPanel.add(vergiNoField);

        inputPanel.add(new JLabel("Tutar:"));
        tutarField = new JTextField();
        inputPanel.add(tutarField);

        addButton = new JButton("Gider Faturası Ekle");
        inputPanel.add(addButton);

        add(inputPanel, BorderLayout.NORTH);

        giderFaturaTable = new JTable();
        add(new JScrollPane(giderFaturaTable), BorderLayout.CENTER);

        loadGiderFaturaIslemleri();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String tarih = tarihField.getText();
                    String vergiNo = vergiNoField.getText();
                    double tutar = Double.parseDouble(tutarField.getText());

                    if (controller.addGiderFatura(tarih, vergiNo, tutar)) {
                        JOptionPane.showMessageDialog(GiderFaturaPanel.this, "Gider faturası başarıyla eklendi!");
                        loadGiderFaturaIslemleri();
                    } else {
                        JOptionPane.showMessageDialog(GiderFaturaPanel.this, "Fatura eklenemedi.");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(GiderFaturaPanel.this, "Hata: " + ex.getMessage());
                }
            }
        });
    }

    private void loadGiderFaturaIslemleri() {
    try {
        
        ResultSet resultSet = controller.getGiderFaturalar();
        
        
        String[] columnNames = {"Tarih", "Vergi No", "Tutar"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        
        while (resultSet.next()) {
            String tarih = resultSet.getString("tarih");
            String vergiNo = resultSet.getString("vergi_no");
            double tutar = resultSet.getDouble("tutar");
            Object[] row = {tarih, vergiNo, tutar};
            model.addRow(row);
        }

        
        giderFaturaTable.setModel(model);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gider faturaları yüklenirken hata oluştu: " + e.getMessage());
    }
}

    
}
