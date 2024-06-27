package dao;

import Con.DatabaseConnection;
import model.Order;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderDAO {
    public void addOrder(int customerId, String orderType, int partId, String status) throws SQLException {
        String sql = "INSERT INTO Orders (customer_id, order_type, part_id, status) VALUES (?, ?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, customerId);
            stmt.setString(2, orderType);
            stmt.setInt(3, partId);
            stmt.setString(4, status);
            stmt.executeUpdate();
        }
    }

    public List<Order> getAllOrders() throws SQLException {
        String sql = "SELECT * FROM Orders";
        List<Order> orders = new ArrayList<>();
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Order order = new Order();
                order.setOrderId(rs.getInt("order_id"));
                order.setCustomerId(rs.getInt("customer_id"));
                order.setOrderType(rs.getString("order_type"));
                order.setPartId(rs.getInt("part_id"));
                order.setStatus(rs.getString("status"));
                orders.add(order);
            }
        }
        return orders;
    }
}