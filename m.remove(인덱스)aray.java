import java.util.ArrayList;
import java.util.Scanner;

public class aray {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		//Array(배열)int[] m = new int[5];
		ArrayList<Integer> m =new ArrayList<Integer>();
		
		System.out.println("입력하시오");
		int n = s.nextInt();
		
		while(n!=-1) {
			System.out.println("입력하시오");
			m.add(n); // ArrayList가 하나 늘어나면서, 새값을 추가
			n = s.nextInt();
		}
		int i=0;
		int sum=0;
//		float pp=0;
//		while(i<m.length) {
//			System.out.println("입력하시오");
//			m[i]=s.nextInt();
//			//점수의 합계를 누적
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
		
		System.out.println("총합 "+sum);
		System.out.println("평균은 "+((float)sum/(m.size())));
		
		//평균점수 계산
		System.out.println("프로그램종료.");
	}

}
