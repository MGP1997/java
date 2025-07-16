package sub05;

import sub02.Car;

public class Sedan extends Car {
	
	private int cc; // 배기량
	
	// 상수(Constant) - 최초 한번 초기화된 값으로 고정된 변수
	private  final int Max_Speed = 180;
	
	public Sedan(String name, String color, int speed, int cc) {
		// 부모 클래스 생성자 호출, 자식클래스는 부모클래스 속성을 초기화해줘야 함
		super(name, color, speed);
		this.cc = cc;
		
	}
	@Override
	public void speedUp(int speed) {
		// 부모 클래스 speedUp을 자식 클래스에 맞게 재정의
		
		this.speed += speed;
		
		if(this.speed > Max_Speed) {
			this.speed = Max_Speed;
		}
	}
	
	
	public void turbo() { 
		//부모 클래스 speed 참조를 위해 접근권한을 private에서 protected로 변경
		this.speed += 10;
	}
	
	public void show() {
		super.show(); // 부모클래스 show 호출
		System.out.println("배기량 : " + this.cc);
	}
}
