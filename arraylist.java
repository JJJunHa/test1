import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> m = new ArrayList<Integer>();
		
		while(true) {
			
			System.out.println("�Է��Ͻÿ�");
			int n = s.nextInt();
			if(n == -1) break;
			if(n == 0) { 
				System.out.println("Ȯ��");
				continue;
			}
			m.add(n);
			
		}
		System.out.println("----------------");
		int i = 0;
		int sum = 0;
		int ag = 0;
		while(i<m.size()) {
			System.out.println(m.get(i));			
			sum +=(m.get(i));
			i++;
			
		}
		 
		System.out.println("���� "+sum);
		System.out.println("��� "+(sum/m.size()));
		System.out.println("����");
	}

}
