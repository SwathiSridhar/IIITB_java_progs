public class Main4{
    public static void main(String[] a){
        Circle4 c1 = new Circle4();
        c1.radius = 10.0f;
        System.out.println("area of circle = " + c1.area());
    }
}

class Circle4{
    public float radius;
    public float area(){
        return 3.141f * radius * radius;
    }
}





