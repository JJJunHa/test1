import java.util.ArrayList;
import java.util.Scanner;

public class aray {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Array(�迭)int[] m = new int[5];
		ArrayList<Integer> m =new ArrayList<Integer>();
		
		System.out.println("�Է��Ͻÿ�");
		int n = s.nextInt();
		
		while(n!=-1) {
			System.out.println("�Է��Ͻÿ�");
			m.add(n); // ArrayList�� �ϳ� �þ�鼭, ������ �߰�
			n = s.nextInt();
		}
		int i=0;
		int sum=0;
//		float pp=0;
//		while(i<m.length) {
//			System.out.println("�Է��Ͻÿ�");
//			m[i]=s.nextInt();
//			//������ �հ踦 ����
//			sum+=(m[i]);
//			i++;
//		}
		
		
		while(i<m.size()) {
			if(m.get(i)==0) {
				m.remove(i);
				
			} else {
				i++;
			}
			
		}
		i = 0;
		while(i<m.size()) {
			System.out.println(m.get(i));
			i++;
		}
		
//		while(i<m.length) {
//			System.out.println(m[i]);
//			
//			i++;
//		}
		System.out.println("------------------");
		i=0;
		
		while(i<m.size()) {
			
			System.out.println(m.get(i)); // m[i]
			sum+=m.get(i);
			i++;
			
		}
		
		System.out.println("���� "+sum);
		System.out.println("����� "+((float)sum/(m.size())));
		
		//������� ���
		System.out.println("���α׷�����.");
	}

}
