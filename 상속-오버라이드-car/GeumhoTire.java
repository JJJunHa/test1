
public class GeumhoTire extends Tire {
	public GeumhoTire() {
		
	}
	public GeumhoTire(String loc, int maxRound) {
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
					"Geumho Tire punk !!!");
			return false;
		}
	}

}
