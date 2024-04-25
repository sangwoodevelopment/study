package exam01;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AccountDemo {
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/exam.xml");
		Account acc = (Account)factory.getBean("account");
		acc.setAccId("111-222-3333");
		System.out.println("************은행업무 프로그램**************");
		System.out.println("현재 잔액은:"+acc.getBalance()+"입니다.");
		System.out.println("어떤 작업을 하시겠습니까?");
		System.out.print("1.입금");
		System.out.print("2.출금");
		System.out.println("3.조회");
		System.out.println("원하는 작업을 선택하세요.");
		int num = key.nextInt();
		switch(num){
			case 1:
				System.out.println("입금금액을 입력하세요");
				acc.input(key.nextLong());
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			case 2:
				System.out.println("출금금액을 입력하세요");
				acc.output(key.nextLong());
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			case 3:
				System.out.println(acc.getAccId()
						+"계좌의 현재잔액은 "+acc.getBalance());
				break;
			default:
				System.out.println("잘못선택하셨습니다.");
				System.exit(0);
		}
	}

}









