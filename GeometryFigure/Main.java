
public class Main {
    public static void main(String[] args) {
        
        Rectangle r = new Rectangle(1, 1, 2, 2);
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r);
        r.move(2, 2);
        r.resize(2);
        System.out.println(r);
        
        Circle c = new Circle(1, 1, 3);
        System.out.println(c.getArea());
        System.out.println(c.getPerimeter());
        System.out.println(c);
        c.move(2, 2);
        c.resize(2);
        System.out.println(c);
    }
}

interface Moveable {
    public void move(float dx, float dy);
    public void resize(float koeff);
    
}

abstract class Figure implements Moveable {

    protected float x, y;
    
    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public abstract float getArea();
    public abstract float getPerimeter();

    public void move(float dx, float dy) {
        this.x += dx;
        this.y += dy;
    }

    protected float getX() {
        return x;
    }
    protected float getY() {
        return y;
    }

}


class Rectangle extends Figure {
    
    protected float height, width;

    public Rectangle(float x, float y, float height, float width) {
        super(x, y);
        this.height = height;
        this.width = width;
    }

    public float getArea() {
        return height * width;
    }
    public float getPerimeter() {
        return (height * 2) + (width * 2); 
    }

    @Override
    public void resize(float koeff) {
        this.height *= koeff;
        this.width *= koeff;
    }

    @Override
    public String toString() {
        return "Rectangle\n Center: (" + getX() + ", " + getY() + ")\n Height: " + height + "\n Width: " + width;
    }
  
}

class Circle extends Figure {
    
    protected float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    public float getArea() {
        return (float) (Math.PI * Math.pow(radius, 2));
    }
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius); 
    }

    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }

    @Override
    public String toString() {
        return "Circle\n Center: (" + getX() + ", " + getY() + ")\n Radius: " +radius;
    }
    
}