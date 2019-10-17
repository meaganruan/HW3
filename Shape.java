package Assignment3;
public class Shape {

	
	public void draw(){
	System.out.println("Drawing Shape");
	}
	
	public void erase(){
	System.out.println("Erasing Shape");
	}

}

class ShapeDemo{

static Shape c=new Circle();
static Shape t=new Triangle();
static Shape s=new Square();

public static void main (String args[]){
	c.draw();
	c.erase();
	t.draw();
	t.erase();
	s.draw();
	s.erase();
}

}
