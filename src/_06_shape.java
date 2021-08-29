//(Q1) Write a program to create a class named shape. It should contain 2 methods, draw() and erase() that prints “Drawing Shape” and “Erasing Shape” respectively.
public class _06_shape {
    public void draw(){
        System.out.println("Drawing shape");
    }
    public void erase(){
        System.out.println("Erasing shape");
    }
}
class CallingFunction
{
    public static void main(String[] args) {
        _06_shape obj = new _06_shape();
        obj.draw();
        obj.erase();
    }
}
