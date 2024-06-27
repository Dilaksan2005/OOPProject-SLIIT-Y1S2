package Con;

import views.ManageCustomerOrderView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("ShipShape - Manage Customer Orders");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 600);
            frame.setLocationRelativeTo(null);

            ManageCustomerOrderView view = new ManageCustomerOrderView();
            frame.setContentPane(view);
            frame.setVisible(true);
        });
    }
}