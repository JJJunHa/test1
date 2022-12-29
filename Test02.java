import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		System.out.println("enter a name");
//		String name = s.nextLine();
//		if (name.equals("John")) {
//			System.out.println("name is " + name);
//		} else {
//			System.out.println("wrong name");
//		}
		
		int x = 0;
		int num=s.nextInt();
		int y=(num>0) ? x+1:((num==0) ? 0:x-1);
		System.out.println(y);
		
//		int z=0;
//		int v=0;
//		if(num>0) {
//			v=z+1;
//		}else {
//			v=z-1;
//		}
	}

}
