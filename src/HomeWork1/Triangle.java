package HomeWork1;

public class Triangle extends Shape
{
    private int x2,x3;
    private int y2,y3;
    public Triangle()
    {
        setCords(0,0);
        this.x2=this.x3=0;
        this.y2=this.y3=0;
    }
    public Triangle(int x1,int y1,int x2,int y2,int x3,int y3)
    {
        setCords(x1,y1);
        this.x2=x2;
        this.y2=y2;
        this.x3=x3;
        this.y3=y3;
    }
    @Override
    public double square()
    {
        return (getX()-x3)*(y2-y3)-(x2-x3)*(getY()-y3);
    }
    @Override
    public void showInfo()
    {
        System.out.println("Triangle("+getX()+", "+getY()+"; "+x2+", "+y2+"; "+x3+", "+y3+")");
    }
}
