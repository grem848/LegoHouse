package DBAccess;


import FunctionLayer.OrderBOM;
import FunctionLayer.OrderBuilderException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class OrderMapper
{
        public static boolean OrderToDB(OrderBOM orderBOM) throws OrderBuilderException
    {
        try
        {
            Connection con = Connector.connection();
            String SQL = "INSERT INTO orders (user_id, length, width, height) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.setInt(1, orderBOM.getUser_id());
            ps.setInt(2, orderBOM.getLength());
            ps.setInt(3, orderBOM.getWidth());
            ps.setInt(4, orderBOM.getHeight());
            ps.executeUpdate();

        } catch (SQLException | ClassNotFoundException ex)
        {
            throw new OrderBuilderException(ex.getMessage());
        }

        return false;
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
