
public class Cat implements Behavior {
	String name;
	public Cat() {
		this.name="������";
	}
	
	@Override
	public void sound() {
		System.out.println(this.name+"�߿�");

	}

}
