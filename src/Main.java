import view.GelirFaturaPanel;
import view.GiderFaturaPanel;
import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame("Muhasebe Uygulaması");
                frame.setSize(800, 600);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                JTabbedPane tabbedPane = new JTabbedPane();
                tabbedPane.addTab("Gelir Faturaları", new GelirFaturaPanel());
                tabbedPane.addTab("Gider Faturaları", new GiderFaturaPanel());
                
                frame.add(tabbedPane);
                frame.setVisible(true);
            }
        });
    }
}
