
public class Tire {
	
	public int curRound;	//Ÿ�̾��� ������� ����ȸ��Ƚ��
	
	public String location;	//Ÿ�̾��� ������ġ
	public int maxRound;	//Ÿ�̾� �ִ�ȸ��Ƚ��
	
	public Tire() {
		
	}
	public Tire(String loc, int max) {
		this.location=loc;
		this.maxRound=max;
		this.curRound=0;
	}
	public boolean roll() {
		++curRound;
		if(curRound<maxRound) {
			System.out.println(this.location+"���� ȸ�� ������: "+(this.maxRound-this.curRound));
			 return true;
		}else {	// curRound >=maxRound
			System.out.println(this.location+
					"Tire punk !!!");
			return false;
		}
	}
	

}
