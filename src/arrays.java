public class arrays {
    public static void main(String[] args)
    {
        String students[];
        students = new String[4];

        students[0] = "Adam";
        System.out.println(students[0]);

        students[1] = "Lucy";
        students[2] = "Emma";
        students[3] = "John";

        System.out.println(students[2]);

        // another way to declare an array
        String names[] = {"Adam","Lucy","Emma","John"};
        System.out.println(names[3]);
        boolean a = true;
        boolean b = false;
        boolean c = true;

        // throws an exception
        System.out.println(a||b&&!c);
    }
}
