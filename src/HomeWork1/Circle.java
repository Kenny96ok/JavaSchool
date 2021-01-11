package HomeWork1;

public class Circle extends Shape{
    private int R;

    public Circle() {
        setCords(0,0);
        this.R=0;
    }

    public Circle(int x, int y, int R)
    {
        setCords(x,y);
        this.R=R;
    }
    @Override
    public double square()
    {
        return 2*(3.1415)*R*R;
    }
    @Override
    public void showInfo()
    {
        System.out.println("Circle(x = "+ getX() + ", y = " + getY() + ", R = " + R + ")");
    }
}
