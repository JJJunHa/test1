import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	static ArrayList<String> alMenu;
	static ArrayList<Integer> alPrice;
	Scanner s, s1;
	
	public Menu() {
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		this.s = new Scanner(System.in);
		this.s1 = new Scanner(System.in);
	}
	
	void build() {
		menunameprint();
		String name = this.s.nextLine();
		while(!name.equals("-1")) {
			menupriceprint();
			int price = this.s1.nextInt();
			if(price==-1)break;
			this.append(name, price);
			
			menunameprint();
			name = this.s.nextLine();
			}
	}
	
	void modify() {
		
			for(int i=0; i<this.alMenu.size(); i++) {
				System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
				}
			
		menurevicenum();
		int ndx = s1.nextInt();
		
			while(ndx!=-1) {
				
				
				menunameprint();
				String name = this.s.nextLine();
				if(name.equals("-1"))break;
				
				menupriceprint();
				int price = this.s1.nextInt();
				if(price==-1)break;
				
				this.update(name, price, ndx);
				
					for(int i=0; i<this.alMenu.size(); i++) {
						System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
						}
					
				menurevicenum();
				ndx = this.s1.nextInt();
				
				
			}
	}
	
	void remove() {
			
		for(int i=0; i<this.alMenu.size(); i++) {
			System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
			}
		
		removenum();
		int ndx = this.s1.nextInt();
			
			while(ndx!=-1) {
				this.deleteupdate(ndx);
					
					for(int i=0; i<this.alMenu.size(); i++) {
						System.out.println((i)+" 번 메뉴 "+this.alMenu.get(i)+" : "+this.alPrice.get(i));
						}
					
				removenum();
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
	
	void menunameprint() {
		System.out.println("뒤로: -1");
		System.out.println("메뉴명을 입력하시오: ");
		System.out.println("----------------");
		
	}
	
	void menupriceprint() {
		System.out.println("뒤로: -1");
		System.out.println("가격을 입력하시오: ");
		System.out.println("---------------");
		
	}
	
	void menurevicenum() {
		System.out.println("뒤로: -1");
		System.out.println("수정할 메뉴번호를 입력하시오:");
		System.out.println("----------------------");
		
	}
	void removenum() {
		System.out.println("뒤로: -1");
		System.out.println("삭제할 메뉴번호를 입력하시오:");
		System.out.println("---------------------");
	}
	

}
