public class Main5{
    public static void main(String[] a){
        Circle5 c1 = new Circle5(10f);
        System.out.println("area of circle = " + c1.area());

        Circle5 c2 = new Circle5(20f);
        System.out.println("area of circle = " + c2.area());

        Circle5 c3 = new Circle5(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle5{
    public float radius;

    public Circle5(float r) {
        radius = r;
    }

    public float area(){
        return 3.141f * radius * radius;
    }
}





