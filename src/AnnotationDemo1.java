class Rectangleann{
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
}
class Squareann extends Rectangleann{
	@Override
	public void printNameOfClass(){
		System.out.println("Square");
	}
}

public class AnnotationDemo1{
	public static void main(String[] args){
		Squareann s = new Squareann();
		s.printNameOfClass();
	}	
}