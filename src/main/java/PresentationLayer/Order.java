package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.OrderBOM;
import FunctionLayer.OrderBuilderException;
import FunctionLayer.User;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Order extends Command
{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderBuilderException
    {
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");
        
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        

        OrderBOM orderBOM = LogicFacade.createOrder(user, length, width, height);
      
        request.setAttribute("orderBOM", orderBOM);
        
        return "ordercreatedpage";
    }

}
