
public class Study19 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=8; i++) {
			int punkLoc = car.Run();
			switch(punkLoc) {
			case 0:
				System.out.println("���� �� ������ �ѱ�Ÿ�̾�� ��ü");
				car.tire[punkLoc] = new HankookTire("frontLeft",15);
				//Tire FrontLeft = new HankookTire(...);����
				break;
			case 1:
				System.out.println("������ �� ������ ��ȣŸ�̾�� ��ü");
				car.tire[punkLoc] = new GeumhoTire("frontRight",13);
				break;
			case 2:
				System.out.println("���� �� ������ �ѱ�Ÿ�̾�� ��ü");
				car.tire[punkLoc] = new GeumhoTire("rearRight",14);
				break;
			case 3:
				System.out.println("������ �� ������ ��ȣŸ�̾�� ��ü");
				car.tire[punkLoc] = new GeumhoTire("rearRight",17);
				break;
			}
			System.out.println("-------------------------------");
		}

	}

}
