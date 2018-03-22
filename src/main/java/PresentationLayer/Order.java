package PresentationLayer;

import FunctionLayer.LogicFacade;
import FunctionLayer.OrderBOM;
import FunctionLayer.OrderBuilderException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Order extends Command
{

    @Override
    String execute(HttpServletRequest request, HttpServletResponse response) throws OrderBuilderException
    {
        System.out.println("hej");
        
        int length = Integer.parseInt(request.getParameter("length"));
        int width = Integer.parseInt(request.getParameter("width"));
        int height = Integer.parseInt(request.getParameter("height"));
        boolean sent = false;
        

        OrderBOM orderBOM = LogicFacade.createOrder(length, width, height, sent);
      
        request.setAttribute("orderBOM", orderBOM);
        
        return "ordercreatedpage";
    }

}
