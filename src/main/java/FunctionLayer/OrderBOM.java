package FunctionLayer;

public class OrderBOM
{

    private int id;
    private int length;
    private int width;
    private int height;
    private boolean sent;

    public OrderBOM(int length, int width, int height, boolean sent)
    {
        this.length = length;
        this.width = width;
        this.height = height;
        this.sent = sent;
    }
    
    
    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public boolean isSent()
    {
        return sent;
    }

    public void setSent(boolean sent)
    {
        this.sent = sent;
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
