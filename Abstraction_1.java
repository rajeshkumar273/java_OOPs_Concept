abstract class Shape {

	abstract void draw();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rectangle extends Shape {

	void draw() {

		System.out.println("Rectangle Shape");
	}

}

class Circle extends Shape {

	void draw() {

		System.out.println("Circle Shape");
	}

}
//In real scenario, method is called by programmer or 
class Abstraction_1 {

	public static void main(String args[]) {
		
		Rectangle r=new Rectangle();  // Tightly coupled depended on class 
			r.draw();
		Circle c=new Circle();      // Tightly coupled depended on class  
			c.draw();

		Shape s=new Circle();     // Loosely coupled depend on abstract method            In a real scenario, object is provided through method, e.g., getShape() method
		s.draw();
}

}

