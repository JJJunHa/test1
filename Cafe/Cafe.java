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
			System.out.println("m.�޴����� | o.�ֹ����� | s.������� | x.����");
			System.out.println("---------------------------------------------");
			read = s.nextLine();
			
			if(read.equals("m")){
				do {
					System.out.println("----------------------------------------------------");
					System.out.println("C.�޴��߰� | R.�޴���� ǥ�� | U.�޴����� | D.�޴����� | B.-1");
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
				
				
			}while(!(mread.equals("B")));
			
			}
		}while(!(read.equals("x")));
		
	}

}
