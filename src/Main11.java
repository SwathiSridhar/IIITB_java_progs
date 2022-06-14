public class Main11{
    public static void main(String[] a) {
        Circle11 c1 = new Circle11(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle11 c){
        System.out.println("radius of circle = " + c.getRadius() + '\n' +
                "area of circle = " + c.area());
    }
}

class Circle11{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle11(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return this.radius;
    }

    public void setRadius(float radius) {
        if(radius >= 0f){
            this.radius = radius;
        }
    }

    private float square(float radius){
        return radius * radius;
    }

    public float area(){
        return PI * square(this.radius);
    }
}





