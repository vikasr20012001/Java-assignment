
package practice;


class Dog{
	private String name;
	public int fun(int x) {
		return x;
	}
	
	
	
}



public  class Animal extends Dog{
private String name;
private int id;
private String color;
public void f() {
	System.out.println("hello world");
}
@Override
public int fun(int x) {
	super.fun(3);
	return x;
}
public float fun(float x,float y) {
	super.fun(3);
	return x+y;
}

public Animal(String name, int id, String color) {
	this.name = name;
	this.id = id;
	this.color = color;
}
@Override
public String toString() {
	return "Animal [name=" + name + ", id=" + id + ", color=" + color + "]";
}



	
}


