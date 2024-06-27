package controller;

import dao.CustomerDAO;
import dao.OrderDAO;
import model.Order;

import java.sql.SQLException;
import java.util.List;

public class ManageCustomerOrderController {
    private CustomerDAO customerDAO;
    private OrderDAO orderDAO;

    public ManageCustomerOrderController() {
        customerDAO = new CustomerDAO();
        orderDAO = new OrderDAO();
    }

    public void addCustomerAndOrder(String name, String email, String phone, String orderType) throws SQLException {
        if (orderType.isEmpty()) {
            throw new IllegalArgumentException("Please select at least one order type.");
        }

        customerDAO.addCustomer(name, email, phone);
        int customerId = customerDAO.getCustomerIdByEmail(email);

        // Assuming partId and status are known or need to be determined elsewhere
        int partId = 1; // Placeholder
        String status = "Pending"; // Placeholder
        orderDAO.addOrder(customerId, orderType, partId, status);
    }

    public List<Order> getAllOrders() throws SQLException {
        return orderDAO.getAllOrders();
    }
}