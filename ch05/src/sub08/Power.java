package sub08;

public class Power implements Socket{
	
	private Bulb bulb;
	
	public Power(Bulb bulb) { 
		this.bulb = bulb;
	}
	
	
	@Override
	public void swichOn() {
		bulb.lightOn();
		
	}

	@Override
	public void swichOff() {
		bulb.lightOff();
		
	}

}
