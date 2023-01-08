import java.util.ArrayList;
import java.util.Scanner;

public class Order  {
	
	ArrayList<String>alName; 
	ArrayList<Integer>alCount; 
	ArrayList<Integer>alSum;
	ArrayList<String>alMenuName;
	Scanner s, s1;
	
	public Order() {
		
		this.alName = new ArrayList<String>();
		this.alCount = new ArrayList<Integer>();
		this.alSum = new ArrayList<Integer>();
		this.alMenuName = new ArrayList<String>();
		this.s = new Scanner(System.in);
		this.s1 = new Scanner(System.in);
	}	
	
	void addorder() {
		do {
			for(int i=0; i<Menu.alMenu.size(); i++) {
				System.out.println((i)+" �� �޴� "+Menu.alMenu.get(i)+" : "+Menu.alPrice.get(i));
				}
			
		System.out.println("�ڷ�: -1");
		System.out.println("---------------------------");
		
		System.out.println("�ֹ����� �Է��Ͻÿ�");
		String ordername=s.nextLine();
		
		if(ordername.equals("-1"))break;
		
		System.out.println("�޴���ȣ�� �Է��Ͻÿ�");
		int menunum=s1.nextInt();
		
		System.out.println("������ �Է��Ͻÿ�");
		int menucount = s1.nextInt();
		
		int sum=menucount*Menu.alPrice.get(menunum);
		String menuname = Menu.alMenu.get(menunum);
		
		this.append(ordername, menucount, sum, menuname);
		System.out.println("");
		}while(true);
		
	}
	
	void append(String name, int count, int sum, String menname) {
		this.alName.add(name);
		this.alCount.add(count);
		this.alSum.add(sum);
		this.alMenuName.add(menname);
	}
	
	void display() {
		
		for(int i=0; i<this.alName.size(); i++) {
					
					System.out.println("�ֹ��̸��� "+this.alName.get(i));
					System.out.println("��Ű�Ű� : "+this.alMenuName.get(i));
					System.out.println("������ "+this.alCount.get(i));
					System.out.println("������ "+this.alSum.get(i));
					System.out.println("-----------------------");
					
				}
		
	}
	void deletelogic() {
		
			for(int i=0; i<this.alName.size(); i++) {
						
						System.out.println("�ֹ��̸��� "+this.alName.get(i));
						System.out.println("��Ű�Ű� : "+this.alMenuName.get(i));
						System.out.println("������ "+this.alCount.get(i));
						System.out.println("������ "+this.alSum.get(i));
						System.out.println("-----------------------");
					}
	
		System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
		System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
		System.out.println("-----------------------");
		
		String ndxname=s.nextLine();
		
		int d;
		
			for(d=0; d<this.alName.size(); d++) {
				
				if(this.alName.get(d).equals(ndxname)) {
					break;
				}
			}
		
			while(!ndxname.equals("-1")) {
				
				
				this.delete(d);
				
				if(this.alName.size()==0) {
					System.out.println("���� �ֹ��� �����ϴ�.");
					break;
				}
				
				for(int i=0; i<this.alName.size(); i++) {
					System.out.println("�ֹ��̸��� "+this.alName.get(i));
					System.out.println("��Ű�Ű� : "+this.alMenuName.get(i));
					System.out.println("������ "+this.alCount.get(i));
					System.out.println("������ "+this.alSum.get(i)+" ��");
					System.out.println("");
					}
					
				System.out.println("��������"+-1+"�� �Է��Ͻÿ�");
				System.out.println("���� �ֹ��� �̸��� �Է��Ͻÿ�");
				System.out.println("-----------------------");
				ndxname=s.nextLine();
					
					
					for(d=0; d<this.alName.size(); d++) {
						
						if(this.alName.get(d).equals(ndxname)) {
							break;
						}
					}
			}
	}
	
	void delete(int order_num) {
		
		this.alName.remove(order_num);
		this.alCount.remove(order_num);
		this.alSum.remove(order_num);
		
		
	}
}
