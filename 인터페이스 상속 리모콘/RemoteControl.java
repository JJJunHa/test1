
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//추상메소드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트메소드(일반클래스의 일반메소드)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("소리를 죽입인다.");
			
		}else {
			System.out.println("소리가 납니다. ");
		}
	}
	//정적메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
