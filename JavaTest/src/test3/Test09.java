package test3;

abstract class Test09 {
	public abstract void draw();
}

class Triangle extends Test09 {
	@Override
	public void draw() { 
		System.out.println("draw Triangle!");
	}
}

class Circle extends Test09 {
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}

public class Test09 {
	
	public static void main(String[] args) {
		
		Test09 here = new Test09();
		
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
	}
	public void araw(Test09 obj) { 
		obj.draw();
	}
}