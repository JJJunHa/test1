import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	ArrayList<String> alMenu;
	ArrayList<Integer> alPrice;
	Scanner s, s1;
	
	public Menu() {
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.s = new Scanner(System.in);
		this.s1 = new Scanner(System.in);
	}
	void build() {
		System.out.println("메뉴명을 입력하시오: ");
		String name = this.s.nextLine();
		while(!name.equals("-1")) {
			System.out.println("가격을 입력하시오: ");
			int price = this.s1.nextInt();
			if(price==-1)break;
			this.append(name, price);
			
			System.out.println("메뉴명을 입력하시오: ");
			name = this.s.nextLine();
			}
	}
	
	void modify() {
		
			for(int i=0; i<this.alMenu.size(); i++) {
				System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
				}
		
		System.out.println("수정할 메뉴번호를 입력하시오:");
		int ndx = s1.nextInt();
		
			while(ndx!=-1) {
				
				
				
				System.out.println("새 메뉴명을 입력하시오:");
				String name = this.s.nextLine();
				if(name.equals("-1"))break;
				System.out.println("새 가격을 입력하시오:");
				int price = this.s1.nextInt();
				if(price==-1)break;
				this.update(name, price, ndx);
				
					for(int i=0; i<this.alMenu.size(); i++) {
						System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
						}
				
				System.out.println("수정할 메뉴번호를 입력하시오:");
				ndx = this.s1.nextInt();
				
				
			}
	}
	
	void remove() {
			
		for(int i=0; i<this.alMenu.size(); i++) {
			System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
			}
		
		System.out.println("삭제할 메뉴번호를 입력하시오:");
		int ndx = this.s1.nextInt();
			
			while(ndx!=-1) {
				this.deleteupdate(ndx);
					
					for(int i=0; i<this.alMenu.size(); i++) {
						System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
						}
				System.out.println("삭제할 메뉴번호를 입력하시오:");
				ndx = this.s1.nextInt();
				
			}
		
	}
	
	void append(String name, int price) {
		
			//System.out.println("메뉴추가");
					this.alMenu.add(name);
					//System.out.println("가격추가");
					this.alPrice.add(price);
					System.out.println(name+"는 "+price+"원 입니다. ");
				
		
	}
	void display() {
		
					for(int i=0; i<this.alMenu.size(); i++) {
						System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
						}
		
	}
	void update(String newName, int newPrice, int indexNum) {
		
		
					this.alMenu.set(indexNum, newName);
					this.alPrice.set(indexNum, newPrice);
		
	}
	void deleteupdate(int indexNum) {
		
					this.alMenu.remove(indexNum);
					this.alPrice.remove(indexNum);
	}

}
