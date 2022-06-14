public class static_keyword{
    public static void main(String[] a){
        Circled c1 = new Circled(10f);
        System.out.println("area of circle = " + c1.area());

        Circled c2 = new Circled(20f);
        System.out.println("area of circle = " + c2.area());

        Circled c3 = new Circled(15f);
        System.out.println("area of circle = " + c3.area());
        System.out.println("circumference of circle = " + c3.circumference());
    }
}

class Circled{
    public float radius;
    public static float PI = 3.1414f;

    public Circled(){
    }

    public Circled(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float circumference(){
        return 2 * PI * this.radius;
    }
}





