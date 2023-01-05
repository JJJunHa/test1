import javax.xml.transform.stream.StreamSource;

public class Study15 {

	public static void main(String[] args) {
		Car seltos = new Car(); // 변수 seltos를 클래스 Car타입의 변수로서 선언.
		// 실체 seltos가 생성된다. -> 인스턴스
		Car porter = new Car(); // 변수 porter를 클래스 Car타입의 변수로서 선언.
		// 실체 porter가 생성된다. -> 인스턴스
		
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
