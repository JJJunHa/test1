
public class Study22 {

	public static void main(String[] args) {
		TV smartTV = new TV();
		Audio inkel = new Audio();
		
		smartTV.turnOn();
		inkel.turnOn();
		
		smartTV.setMute(false);
		inkel.setMute(false);
		
		smartTV.setVolume(-5);
		inkel.setVolume(-1);
		
		smartTV.setMute(true);
		inkel.setMute(true);
	
		RemoteControl.changeBattery();
		
		smartTV.turnOff();
		inkel.turnOff();
	}

}
