package HomeWork1;

public abstract class Shape
{
    private int x;
    private int y;
    public Shape()
    {
        this.x=0;
        this.y=0;
    }
    public Shape(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    public void setCords(int x,int y)
    {
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    public abstract double square();

    public void showInfo()
    {
        System.out.println("Shape(x = "+ x + ", y = " + y + ")");
    }
}