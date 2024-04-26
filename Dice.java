package di.setter.exam01;

import java.util.Random;
public class Dice extends Random implements diceinter{
	
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
