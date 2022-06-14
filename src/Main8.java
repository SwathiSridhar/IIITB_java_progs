public class Main8{
    public static void main(String[] a) {
        Circle8 c1 = new Circle8(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle8 c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle8{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle8(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





