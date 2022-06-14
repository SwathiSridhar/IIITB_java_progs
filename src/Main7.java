public class Main7{
    public static void main(String[] a) {
        Circle7 c1 = new Circle7(10f);
        printCircle(c1);
    }

    public static void printCircle(Circle7 c){
        System.out.println("area of circle = " + c.area());
    }
}

class Circle7{
    private float radius;
    public static final float PI = 3.1414f;

    public Circle7(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }
}





