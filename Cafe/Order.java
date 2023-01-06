import java.util.ArrayList;

public class Order {
	
	ArrayList<String>alName; 
	ArrayList<Integer>alCount; 
	ArrayList<Integer>alSum; 
	
	public Order() {
		
		this.alName = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
	}
	void append(String name, int qty) {
		
	}
	void display() {
		
		for(int i=0; i<this.alName.size(); i++) {
					
					System.out.println("주문번호는 "+this.alName.get(i));
					System.out.println("수량은 "+this.alCount.get(i));
					System.out.println("총합은 "+this.alSum.get(i));
					System.out.println("-----------------------");
					
				}
		
	}
	void delete(int order_num) {
		
		for(int i=0; i<this.alName.size(); i++) {
			
			System.out.println("주문번호는 "+this.alName.get(i));
			System.out.println("수량은 "+this.alCount.get(i));
			System.out.println("총합은 "+this.alSum.get(i));
			System.out.println("-----------------------");
		}
		this.alName.remove(order_num);
		this.alCount.remove(order_num);
		this.alSum.remove(order_num);
		
		
		
	}
}
