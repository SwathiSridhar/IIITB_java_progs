public class Main9{
    public static void main(String[] a) {
        Circle9 c1 = new Circle9(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle9 c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle9{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle9(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





