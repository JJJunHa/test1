//����(Declaration) - ��ü�� ���� ����.
public class Car {
	// �Ӽ�(Ư��) - property -> �ʵ�(����)
	String color;	//����
	int maxSpeed;	//�ְ�ӵ�
	int speed;		//����ӵ�
	String company; //������
	String model; 	//Sorent, seltos, Avante
	int personnel; 	//�ִ�°���
	int whell;		//�� ����
	
	// ���(����) - action/behavior -> �޼ҵ�(�Լ�)
		void setColor(String str) {
			this.color =str;
		}
		String getColor() {
			return this.color;
		}
	
	void drive(int speed) {
		this.speed=speed;
		System.out.println(this.model+" ����ӵ��� "+this.speed+"km�Դϴ�.");
		
	}
	void stop() {
		this.speed=0;
		System.out.println(this.model+" �����߽��ϴ�.");
		
	}
	void turnLeft() {
		System.out.println(this.model+" ��ȸ��");
		
	}
	void turnRigh() {
		System.out.println(this.model+" ��ȸ��");
	}
	void backWard() {
		System.out.println(this.model+" ����");
	}
}
