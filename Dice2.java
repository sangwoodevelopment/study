package di.annotation.exam01;

import java.util.Random;

import org.springframework.stereotype.Component;
@Component("dice2")
public class Dice2 extends Random implements diceinter{
	public Dice2() {
		System.out.println("Dice2기본생성자");
	}
	public int getDiceValue(){
		System.out.println("dice2");
		return (nextInt(6)+1)*2;
	}
}
