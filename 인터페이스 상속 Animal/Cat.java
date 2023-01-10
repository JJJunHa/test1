
public class Cat implements Behavior {
	String name;
	public Cat() {
		this.name="강아지";
	}
	
	@Override
	public void sound() {
		System.out.println(this.name+"야옹");

	}

}
