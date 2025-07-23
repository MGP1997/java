package test3;

 class Test06 {
	private static Test06 instance = new Test06();
	public static Test06 getInstance() { 
		return instance;
	}
	private Test06(){}
	
	private Test06(int value) {
		y += value;
	}
	
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	public static void add(Test06 a2) {
		a2.x += 10; 
	}
	public static Test06 add(Test06 a3, int value) {
		return new Test06(value);
	}
	public void show() {
		System.out.println("===============");
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}

}
public class Test06 {
	public static void main(String[] args) {
		
		Test06 a1 = Test06.getInstance();
		
		a1.add(1,2);
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		
		Test06.add(a1);
		a1.show();
		
		a1 = Test06.add(a1, 3);
		a1.show();
	}
}
