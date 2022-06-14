class Rectangledep{
	//old method
	@Deprecated
	public void showNameOfClass(){
		System.out.println("Rect");
	}
	
	public void printNameOfClass(){
		System.out.println("Rectangle");
	}
}


public class AnnotationDemo2{
	public static void main(String[] args){
		Rectangledep r = new Rectangledep();
		r.showNameOfClass();
		r.printNameOfClass();
	}	
}