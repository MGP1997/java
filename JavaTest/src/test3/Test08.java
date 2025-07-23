package test3;

public class Test08 {
	protected String productName;
	 protected int price;
	
	public Test08(String productName, int price) { 
		this.productName = productName;
		this.price = price;
	}
	public void spec(){}

}

class SmartPhone extends Test08{
	
	public SmartPhone(String productName, int price) {
		super(productName, price);
	}
	
	@Override
	public void spec() {
		System.out.println("==============");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}
}
class Computer extends Test08 {
	public Computer(String productName, int price) {
		super(productName, price);
	}
	
	@Overrride
	public void spec() {
		System.out.println("======================");
		System.out.println("제품명 : " + productName);
		System.out.println("제품가격 : " + price);
	}
	
}
public class Test08 {
	public static void main(String[] args) {
		
		SmartPhone p1 = new SmartPhone("갤럭시", 100);
		Computer p2 = new Computer("맥북프로", 100);
		
		p1.spec();
		Computer.spec();
	}
}