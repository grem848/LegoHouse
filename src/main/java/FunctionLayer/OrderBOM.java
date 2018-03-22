
package FunctionLayer;


public class OrderBOM
{
    private int order_id;
    private int user_id;
    private int length;
    private int width;
    private int height;

    public OrderBOM(int user_id, int length, int width, int height)
    {
        this.user_id = user_id;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public OrderBOM(int order_id, int user_id, int length, int width, int height)
    {
        this.order_id = order_id;
        this.user_id = user_id;
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    public int getUser_id()
    {
        return user_id;
    }

    public void setUser_id(int user_id)
    {
        this.user_id = user_id;
    }

    public int getOrder_id()
    {
        return order_id;
    }

    public void setOrder_id(int order_id)
    {
        this.order_id = order_id;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getWidth()
    {
        return width;
    }

    public void setWidth(int width)
    {
        this.width = width;
    }

    public int getHeight()
    {
        return height;
    }

    public void setHeight(int height)
    {
        this.height = height;
    }


}
