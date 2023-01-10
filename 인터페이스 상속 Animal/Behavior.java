
public interface Behavior {
	
	void sound();
	default void run() {// 인터페이스의 default 메소드 = 일반 클래스의 일반메소드
		System.out.println("달린다.");
	}
	
	
}



