
public class Study18 {

	public static void main(String[] args) {
		DmbCellPhone dcphone = new DmbCellPhone();
		
		dcphone.setModel("AnyCall 2004");
		dcphone.setColor("Silver");
		System.out.println("Model : "+dcphone.getModel());
		System.out.println("Color : "+dcphone.getColor());
		
		dcphone.powerOn();
		dcphone.bell();
		dcphone.sendVoice("��������");
		dcphone.receiveVoice("��������");
		dcphone.hangUp();
		dcphone.powerOff();
		

	}
}
