public class WhileLoop {
    public static void main(String[] args) {

        boolean keepDriving = false;
        int currentFuel = 50;

        while (currentFuel > 0){
            keepDriving = true;
            currentFuel=currentFuel-1;
            System.out.println("Keep on driving!"+ " "+currentFuel);
        }
        keepDriving = false;
        System.out.println("Need to refuel!");
    }
}