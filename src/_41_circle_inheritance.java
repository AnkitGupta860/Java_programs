import java.lang.Math;
public class _41_circle_inheritance {
    int radius;
    _41_circle_inheritance(int r)
    {
        this.radius = r;
    }
    public double area()
    {
        return Math.PI*this.radius*this.radius;
    }
}
class Cylinder extends _41_circle_inheritance
{
    int height;
    Cylinder(int r,int h)
    {
        super(r);
        this.height = h;
    }
    public double volume()
    {
        return Math.PI*this.radius*this.radius*this.height;
    }
}
class Math1
{

    public static void main(String[] args) {
        Cylinder obj = new Cylinder(10,12);
        obj.volume();
        obj.area();

    }
}
