
public class Study19 {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=1; i<=8; i++) {
			int punkLoc = car.Run();
			switch(punkLoc) {
			case 0:
				System.out.println("왼쪽 앞 바퀴를 한국타이어로 교체");
				car.tire[punkLoc] = new HankookTire("frontLeft",15);
				//Tire FrontLeft = new HankookTire(...);가능
				break;
			case 1:
				System.out.println("오른쪽 앞 바퀴를 금호타이어로 교체");
				car.tire[punkLoc] = new GeumhoTire("frontRight",13);
				break;
			case 2:
				System.out.println("왼쪽 뒷 바퀴를 한국타이어로 교체");
				car.tire[punkLoc] = new GeumhoTire("rearRight",14);
				break;
			case 3:
				System.out.println("오른쪽 뒷 바퀴를 금호타이어로 교체");
				car.tire[punkLoc] = new GeumhoTire("rearRight",17);
				break;
			}
			System.out.println("-------------------------------");
		}

	}

}
