package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ShipShapeView extends JFrame {
    private JButton manageCustomerOrderButton;
    private JButton allocateEmployeesButton;
    private JButton manageInventoryButton;
    private JButton manageSuppliersButton;
    private JButton manageEmployeesButton;
    private JButton viewMonthlyReportsButton;
    private JPanel DashPanel;

    public ShipShapeView() {
        getComponents();
        setTitle("Customer Order Dashboard");
        setSize(900, 500);
        setMinimumSize(new Dimension(900, 500));
        setContentPane(DashPanel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }

    public void addManageCustomerOrderButtonListener(ActionListener listenForButton) {
        manageCustomerOrderButton.addActionListener(listenForButton);
    }

    public void addAllocateEmployeesButtonListener(ActionListener listenForButton) {
        allocateEmployeesButton.addActionListener(listenForButton);
    }

    public void addManageInventoryButtonListener(ActionListener listenForButton) {
        manageInventoryButton.addActionListener(listenForButton);
    }

    public void addManageSuppliersButtonListener(ActionListener listenForButton) {
        manageSuppliersButton.addActionListener(listenForButton);
    }

    public void addManageEmployeesButtonListener(ActionListener listenForButton) {
        manageEmployeesButton.addActionListener(listenForButton);
    }

    public void addViewMonthlyReportsButtonListener(ActionListener listenForButton) {
        viewMonthlyReportsButton.addActionListener(listenForButton);
    }
}
