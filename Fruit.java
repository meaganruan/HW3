package Assignment3;
public class Fruit {
String name;
String taste;
double size;

public Fruit(String n, String t, double s){
	name="Peach";
	taste="Good";
	size=5;
}
public void eat(){
	System.out.println(name + " tastes " + taste);
}
}