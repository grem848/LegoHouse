package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;

public class LogicFacade
{

    public static User login(String email, String password) throws LoginSampleException
    {
        return UserMapper.login(email, password);
    }

    public static User createUser(String email, String password) throws LoginSampleException
    {
        User user = new User(email, password, "customer");
        UserMapper.createUser(user);
        return user;
    }

    public static OrderBOM createOrder(int length, int width, int height, boolean sent) throws OrderBuilderException
    {
        OrderBOM orderBOM = new OrderBOM(length, width, height, sent);
        OrderMapper.OrderToDB(orderBOM);

        return orderBOM;
    }

    public static OrderBOM getOrder(int id) throws OrderBuilderException
    {
        return OrderMapper.getOrder(id);
    }
}
