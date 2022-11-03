
package practice;


class Dog{
	private String name;
	public void fun() {
		System.out.println("hello");
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
public void fun() {
	super.fun();
	System.out.println("hello animal");
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


