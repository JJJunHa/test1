import javax.xml.transform.stream.StreamSource;

public class Study15 {

	public static void main(String[] args) {
		Car seltos = new Car(); // ���� seltos�� Ŭ���� CarŸ���� �����μ� ����.
		// ��ü seltos�� �����ȴ�. -> �ν��Ͻ�
		Car porter = new Car(); // ���� porter�� Ŭ���� CarŸ���� �����μ� ����.
		// ��ü porter�� �����ȴ�. -> �ν��Ͻ�
		
//		seltos.color = "white";
		seltos.setColor("white");
		seltos.model = "Seltos";
		seltos.maxSpeed = 280;
		seltos.speed = 0;
		seltos.whell = 4;
		seltos.personnel = 5;
		seltos.company = "kia";
		
		porter.color = "blue";
		porter.model = "Porter";
		porter.maxSpeed = 180;
		porter.speed = 0;
		porter.whell = 6;
		porter.personnel = 3;
		porter.company = "hyundai";
		
		
		System.out.println("seltos.color= "+seltos.getColor());
		System.out.println("seltos.moder= "+seltos.model);
		System.out.println("seltos.whell= "+seltos.whell);
		System.out.println("porter.color= "+porter.color);
		System.out.println("porter.model= "+porter.color);
		System.out.println("porter.whell= "+porter.whell);
		
		seltos.drive(60);
		porter.drive(40);
		seltos.turnLeft();
		porter.turnRigh();
		seltos.stop();
		porter.stop();
	}

}
