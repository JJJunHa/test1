
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	//�߻�޼ҵ�
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//����Ʈ�޼ҵ�(�Ϲ�Ŭ������ �Ϲݸ޼ҵ�)
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("�Ҹ��� �����δ�.");
			
		}else {
			System.out.println("�Ҹ��� ���ϴ�. ");
		}
	}
	//�����޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
