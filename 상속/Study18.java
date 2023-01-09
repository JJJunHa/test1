
public class Study18 {

	public static void main(String[] args) {
		DmbCellPhone dcphone = new DmbCellPhone();
		
		dcphone.setModel("AnyCall 2004");
		dcphone.setColor("Silver");
		System.out.println("Model : "+dcphone.getModel());
		System.out.println("Color : "+dcphone.getColor());
		
		dcphone.powerOn();
		dcphone.bell();
		dcphone.sendVoice("여보세요");
		dcphone.receiveVoice("누구세요");
		dcphone.hangUp();
		dcphone.powerOff();
		

	}
}
