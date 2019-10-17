package Assignment3;
public class Orange extends Fruit{
	String name="Orange";
	String taste="Sweet";
	double size=6;
	public Orange(String n, String t, double s) {
		super(n, t, s);
		
	}

	public void eat(){
		System.out.println(name + " tastes " + taste);
	}
	
}
