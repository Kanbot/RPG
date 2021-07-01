package RPG;

import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.out;
import java.math.*;
public class RPG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu me = new Menu();
		Scanner sc = new Scanner(System.in);
		System.out.print("RPG 게임을 시작합니다.");
		Advan ad =new Advan();
		
		System.out.println( " "+me.day);
		me.menu();
		ad.chap1();
		out.println("d");
	}

}





