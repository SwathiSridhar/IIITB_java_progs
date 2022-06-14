public class parameterized_constructor
{
    public static void main(String[] a){
        Circle3 c1 = new Circle3(10f);
        System.out.println("area of circle = " + c1.area());

        Circle3 c2 = new Circle3(20f);
        System.out.println("area of circle = " + c2.area());

        Circle3 c3 = new Circle3();
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle3{
    public float radius;

    public Circle3(){
    }

    public Circle3(float radius) {
        this.radius = radius;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }
}





