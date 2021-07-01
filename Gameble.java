package RPG;
import java.math.*;
import java.util.*;
public class Gameble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}
	void gameble(){
		int dice;
		boolean result= true;
		Scanner sc =new Scanner(System.in);
		int chance = sc.nextInt();
		dice = (int)Math.random()*6+1;
		for(int i =0; i < 3; i++) {
		System.out.println(dice);
		}
	}

}
