
public class Car {
//	Tire frontLeft;
//	Tire frontRight;
//	Tire rearLeft;
//	Tire rearRight;
	Tire[] tire;
	
	public Car() {
		tire = new Tire[4];
		tire[0]=new Tire("앞왼쪽",6);
		tire[1]=new Tire("앞오른쪽",3);
		tire[2]=new Tire("뒤왼쪽",3);
		tire[3]=new Tire("뒤오른쪽",4);
//		this.frontLeft = new Tire("앞왼쪽",6);
//		this.frontRight = new Tire("앞오른쪽",3);
//		this.rearLeft = new Tire("뒤왼쪽",3);
//		this.rearRight = new Tire("뒤오른쪽",4);
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
