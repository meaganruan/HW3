package Assignment3;
public class Apple extends Fruit{
	String name="Apple";
	String taste="Sour";
	double size=4;

	public Apple(String n, String t, double s) {
		super(n, t, s);
	}

	public void eat(){
		System.out.println(name + " tastes " + taste);
	}
}
