package HomeWork1;

public class Rect extends Shape {
    private int height;
    private  int width;
    public Rect()
    {
        setCords(0,0);
        this.height=0;
        this.width=0;
    }
    public Rect(int x,int y, int height, int width)
    {
        setCords(x,y);
        this.width=width;
        this.height=height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public double square()
    {
        return height*width;
    }
    @Override
    public void showInfo()
    {
        System.out.println("Rect(x = "+ getX() + ", y = " + getY()
                + ", w = " + width + ", h = " + height + ")");
    }
}
