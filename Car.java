//선언(Declaration) - 실체는 아직 없다.
public class Car {
	// 속성(특성) - property -> 필드(변수)
	String color;	//색상
	int maxSpeed;	//최고속도
	int speed;		//현재속도
	String company; //제조사
	String model; 	//Sorent, seltos, Avante
	int personnel; 	//최대승객수
	int whell;		//륄 갯수
	
	// 기능(동작) - action/behavior -> 메소드(함수)
		void setColor(String str) {
			this.color =str;
		}
		String getColor() {
			return this.color;
		}
	
	void drive(int speed) {
		this.speed=speed;
		System.out.println(this.model+" 현재속도는 "+this.speed+"km입니다.");
		
	}
	void stop() {
		this.speed=0;
		System.out.println(this.model+" 정지했습니다.");
		
	}
	void turnLeft() {
		System.out.println(this.model+" 좌회전");
		
	}
	void turnRigh() {
		System.out.println(this.model+" 우회전");
	}
	void backWard() {
		System.out.println(this.model+" 후진");
	}
}
