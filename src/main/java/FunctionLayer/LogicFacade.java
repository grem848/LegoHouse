package FunctionLayer;

import DBAccess.OrderMapper;
import DBAccess.UserMapper;


public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password ) throws LoginSampleException {
        User user = new User(email, password, "customer");
        UserMapper.createUser( user );
        return user;
    }
    public static OrderBOM createOrder(User user, int length, int width, int height) throws OrderBuilderException {
        OrderBOM orderBOM = new OrderBOM(user.getId(), length, width, height);
        OrderMapper.OrderToDB(orderBOM);
        
        return orderBOM;
    }
}
