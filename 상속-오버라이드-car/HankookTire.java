
public class HankookTire extends Tire {
	public HankookTire() {
		
	}
	public HankookTire(String loc, int maxRound) {
		super(loc,maxRound);
	}
	@Override
	public boolean roll() {
		++curRound;
		if(curRound<maxRound) {
			System.out.println(this.location+"남은 회전 바퀴수: "+(this.maxRound-this.curRound));
			 return true;
		}else {	// curRound >=maxRound
			System.out.println(this.location+
					"Hankook Tire punk !!!");
			return false;
		}
	}

}
