package sub08;
//상속(extends)은 하나밖에 안됨 구현(implements)은 여러개 가능
public class SmartTv extends Tv implements Internet{

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
	}
	public void process() { 
		powerOn();
		access();
		
		System.out.println("SmartTv On...");
	}
}
