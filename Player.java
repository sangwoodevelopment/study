package di.setter.exam01;
public class Player implements play{
	diceinter d;
	int totalValue=0;//totalValue변수는 주사위를 굴리고 얻은 결과가 저장되므로 컨테이너가 생성해주지 않아도된다
	
	public Player() {
		
	}
	
	public Player(diceinter d) {
		this.d= d;
	}
	
	
	
	public diceinter getD() {
		return d;
	}

	public void setD(diceinter d) {
		this.d = d;
	}

	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	public int getTotalValue(){
		return totalValue;
	}
}