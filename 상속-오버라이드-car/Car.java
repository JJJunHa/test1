
public class Car {
//	Tire frontLeft;
//	Tire frontRight;
//	Tire rearLeft;
//	Tire rearRight;
	Tire[] tire;
	
	public Car() {
		tire = new Tire[4];
		tire[0]=new Tire("�տ���",6);
		tire[1]=new Tire("�տ�����",3);
		tire[2]=new Tire("�ڿ���",3);
		tire[3]=new Tire("�ڿ�����",4);
//		this.frontLeft = new Tire("�տ���",6);
//		this.frontRight = new Tire("�տ�����",3);
//		this.rearLeft = new Tire("�ڿ���",3);
//		this.rearRight = new Tire("�ڿ�����",4);
	}
	int Run() {
		System.out.println("Car is driving.");
		for(int i =0; i<tire.length; i++) {
			if(!tire[i].roll()) {
				this.stop(); return i;
			}
		}
		return -1;
		
	}
	void stop() {
		System.out.println("Car stops");
	}
}
