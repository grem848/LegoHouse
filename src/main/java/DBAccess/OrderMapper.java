package DBAccess;

import FunctionLayer.OrderBOM;
import FunctionLayer.OrderBuilderException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OrderMapper
{

    public static boolean OrderToDB(OrderBOM orderBOM) throws OrderBuilderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (length, width, height, sent) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, orderBOM.getLength());
            ps.setInt(2, orderBOM.getWidth());
            ps.setInt(3, orderBOM.getHeight());
            ps.setBoolean(4, orderBOM.isSent());
            ps.executeUpdate();
            ResultSet ids = ps.getGeneratedKeys();
            ids.next();
            int id = ids.getInt(1);
            orderBOM.setId(id);
        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderBuilderException(ex.getMessage());
        }

        return false;
    }

    public static OrderBOM getOrder(int id) throws OrderBuilderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM orders WHERE id = ? ";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next())
            {
                int length = rs.getInt("length");
                int width = rs.getInt("width");
                int height = rs.getInt("height");
                boolean sent = rs.getBoolean("sent");

                OrderBOM orderBOM = new OrderBOM(height, width, length, sent);
                return orderBOM;
            } else
            {
                throw new OrderBuilderException("Could not validate Order");
            }
        } catch (ClassNotFoundException | SQLException ex)
        {
            throw new OrderBuilderException(ex.getMessage());
        }
    }

//    public static List<Order> getAllUserOrders(User user) throws LegohouseException {
//        List<Order> orderList;
//        try {
//            Connection connection = Connector.getConnection();
//            String SQL = "SELECT * FROM `order` WHERE userId = ?";
//            PreparedStatement statement = connection.prepareStatement(SQL);
//
//            statement.setInt(1, user.getId());
//            ResultSet rs = statement.executeQuery();
//
//            orderList = new ArrayList<>();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                int userId = rs.getInt("userId");
//                int length = rs.getInt("length");
//                int width = rs.getInt("width");
//                int height = rs.getInt("height");
//                LocalDate receivedDate = rs.getObject("receivedDate", LocalDate.class);
//
//                orderList.add(new Order(id, userId, length, width, height, receivedDate));
//            }
//
//            return orderList;
//        } catch (Exception ex) {
//            throw new LegohouseException(ex.getMessage());
//        }
//    }
//    public static List<Order> getAllOrders() throws LegohouseException {
//        List<Order> orderList;
//        try {
//            Connection connection = Connector.getConnection();
//            String SQL = "SELECT * FROM `order`";
//            Statement statement = connection.createStatement();
//
//            ResultSet rs = statement.executeQuery(SQL);
//
//            orderList = new ArrayList<>();
//
//            while (rs.next()) {
//                int id = rs.getInt("id");
//                int userId = rs.getInt("userId");
//                int length = rs.getInt("length");
//                int width = rs.getInt("width");
//                int height = rs.getInt("height");
//                LocalDate receivedDate = rs.getObject("receivedDate", LocalDate.class);
//                
//                orderList.add(new Order(id, userId, length, width, height, receivedDate));
//            }
//
//            return orderList;
//        } catch (Exception ex) {
//            throw new LegohouseException(ex.getMessage());
//        }
//    }
}
