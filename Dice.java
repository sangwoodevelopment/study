package di.annotation.exam01;

import java.util.Random;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("dice")
public class Dice extends Random implements diceinter{
	
	public int getDiceValue(){
		return nextInt(6)+1;
	}
}
