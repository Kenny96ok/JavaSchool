package HomeWork1;

public class Square extends Rect
{
    public Square()
    {
        setCords(0,0);
        setHeight(0);
        setWidth(0);
    }
    public Square(int x, int y, int a)
    {
        setCords(x,y);
        setHeight(a);
        setWidth(a);
    }
    @Override
    public void showInfo()
    {
        System.out.println("Square(x = "+ getX() + ", y = " + getY()
                + ", a = " + getHeight() + ")");
    }
}
