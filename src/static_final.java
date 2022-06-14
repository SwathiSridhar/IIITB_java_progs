public class static_final{
    public static void main(String[] a){
        Circles c1 = new Circles(10f);
        System.out.println("area of circle = " + c1.area());

        Circles c2 = new Circles(20f);
        System.out.println("area of circle = " + c2.area());

        Circles c3 = new Circles(15f);
        System.out.println("area of circle = " + c3.area());
        System.out.println("circumference of circle = " + c3.circumference());
    }
}

class Circles{
    public float radius;
    public static final float PI = 3.1414f;

    public Circles(){
    }

    public Circles(float radius) {
        this.radius = radius;
    }

    public float area(){
        return PI * this.radius * this.radius;
    }

    public float circumference(){
        return 2 * PI * this.radius;
    }
}





