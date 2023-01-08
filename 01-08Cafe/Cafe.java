import java.util.Scanner;

public class Cafe {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Order order = new Order();
		
		Scanner s = new Scanner(System.in);
		String read;
		String mread;
		
		do {
			System.out.println("---------------------------------------------");
			System.out.println("m.메뉴관리 | o.주문관리 | s.매출관리 | x.종료");
			System.out.println("---------------------------------------------");
			read = s.nextLine();
			
			if(read.equals("m")){
				do {
					System.out.println("메뉴관리");
					System.out.println("----------------------------------------------------");
					System.out.println("C.메뉴추가 | R.메뉴목록 표시 | U.메뉴수정 | D.메뉴삭제 | -1.뒤로");
					System.out.println("----------------------------------------------------");
					
					mread=s.nextLine();
					if(mread.equals("C")){
						
						menu.build();
						
					}else if(mread.equals("R")) {
						menu.display();
						
					}else if(mread.equals("U")) {
						menu.modify();
					}else if(mread.equals("D")) {
						menu.remove();
					}
				
				
			}while(!(mread.equals("-1")));
			
			}
			
			if(read.equals("o")){
				do {
					System.out.println("주문관리");
					System.out.println("----------------------------------");
					System.out.println("C.주문추가 | R.주문내역표시 | D.주문삭제| -1.뒤로");
					System.out.println("----------------------------------");
					
					mread = s.nextLine();
					
						if(mread.equals("C")) {
							order.addorder();
						}else if(mread.equals("R")) {
							order.display();
							
						}else if(mread.equals("D")) {
							order.deletelogic();
						}
					
				}while(!(mread.equals("-1")));
			}
			
			
		}while(!(read.equals("x")));
		
	}

}

	
