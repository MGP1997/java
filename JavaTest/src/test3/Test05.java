package test3;

public class Test05 {
	private String name;
	private int price;
	
	public Test05(String name2, int price2) {
		// TODO Auto-generated constructor stub
	}
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public void info() {
		System.out.println("==================");
		System.out.println("차량명 : " +name);
		System.out.println("가 격 : " +price);
	}
}
class CarFactory { 
	//싱글톤
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	public Test05 createCar(String name, int price) {
		return new Test05(name, price);
	}
}

public class Test05 { 
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();
				
		Test05 avante = factory.createCar("아반테", 2500);		
		Test05 sonata = factory.createCar("소나타", 2500);	
		
		avante.info();
		sonata.info();
	}
}