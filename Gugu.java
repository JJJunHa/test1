import java.util.Scanner;

public class Gugu {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = 2;
		int y = 1;
//		while(x<=9) {
//			int y = 1;
//			while(y<=9) {
//				System.out.println(x+"x"+y+"="+(x*y));
//			y++;}
//		x++;}
			
		for(x=2; x<=9; x++) {
			for(y=1; y<=9; y++) {
				//String pstr = show(x,y); //반환값이 없어서 스트링에 넣지 못한다.
				String pstrr = view(x,y);//같은 타입에 반환된 값을 넣을 수 있다.
				System.out.println(pstrr);
				}
			System.out.println("");
			}
		
	 }
	static void show(int a, int b) {
		String str=(a+"x"+b+"="+(a*b));
	}
	
	static String view(int a, int b) {
		String str=a+"x"+b+"="+(a*b);
	
		return str;
	}
}


