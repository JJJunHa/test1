
public interface Behavior {
	
	void sound();
	default void run() {// �������̽��� default �޼ҵ� = �Ϲ� Ŭ������ �Ϲݸ޼ҵ�
		System.out.println("�޸���.");
	}
	
	
}



