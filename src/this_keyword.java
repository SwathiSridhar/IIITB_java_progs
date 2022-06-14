public class this_keyword
{
    public static void main(String[] a){
        Circle6 c1 = new Circle6(10f);
        System.out.println("area of circle = " + c1.area());

        Circle6 c2 = new Circle6(20f);
        System.out.println("area of circle = " + c2.area());

        Circle6 c3 = new Circle6(15f);
        System.out.println("area of circle = " + c3.area());
    }
}

class Circle6{
    public float radius;

    public Circle6(float radius) {
        this.radius = radius;
    }

    public float area(){
        return 3.141f * this.radius * this.radius;
    }
}





