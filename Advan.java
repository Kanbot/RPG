package RPG;

import java.util.Scanner;

public class Advan extends Menu {
	Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	// 스토리 챕터 1
	void chap1() {
		System.out.println("모험을 시작합니다");
		if(this.trive.equals("인간")) {
			System.out.println("어느 이름 모를 나라의 작은 마을에서 태어난 당신 "+this.name+"은(는) 성년을 맞아 모험을 떠나기로 합니다.");
			System.out.println("들뜬 마음으로 모험을 떠난 당신 앞에 길 위에 쓰러진 노파가 보입니다. 도와주시겠습니까?");
			System.out.println("1. 도와준다  2.무시하고 떠난다 3. 밞고 지나간다");
			this.getkey();
		if(key == 1) {
			System.out.println("저런! 노파는 사실 변장한 마녀 였습니다. 당신이 다가가자 독병을 뿌리고 도망 갔습니다.");
			System.out.println("당신은 독에 중독되어 정신이 점점 멀어 집니다...");
			this.die();
			
		}
		if(key == 2) {
			System.out.println("당신은 쓰러진 노파를 무시하고 모험을 떠났습니다.");
			System.out.println("하지만 당신은 양심의 가책을 느끼고 다시 되돌아가던 중 돌부리에 걸려 넘어져 죽었습니다.");
			this.die();
		}if(key ==3 ) {
			System.out.println("당신은 쓰러진 노파를 밞고 지나갔습니다.");
			System.out.println("중간에 비명소리가 들렸지만 아무 일도 있어나지 않았습니다.");
			System.out.println("길을 따라 걷던 당신 앞에 도박꾼이 나타았습니다.");
			System.out.println("도박사가 자신과 도박을 해보지않겠냐고 물어옵니다.");
			System.out.println("1. 도박을 한다  2.도박을 하지 않고 떠난다");
			this.getkey();
			if(key == 1) {
				System.out.println("당신은 도박에 응합니다.");
				
			}
			if(key == 2) {
				System.out.println("당신은 도박을 거절 했습니다.");
				System.out.println("다시 모험을 나섭니다.");
				
			}
		}
			
		}else if(this.trive.equals("오크")) {
			
		}else if(this.trive.equals("엘프")) {
			
		}
	}
	void die() {
		System.out.println("\r\n"
				+ "__   __ _____  _   _   ______  _____  _____ \r\n"
				+ "\\ \\ / /|  _  || | | |  |  _  \\|_   _||  ___|\r\n"
				+ " \\ V / | | | || | | |  | | | |  | |  | |__  \r\n"
				+ "  \\ /  | | | || | | |  | | | |  | |  |  __| \r\n"
				+ "  | |  \\ \\_/ /| |_| |  | |/ /  _| |_ | |___ \r\n"
				+ "  \\_/   \\___/  \\___/   |___/   \\___/ \\____/ \r\n"
				+ "                                            \r\n"
				+ "                                            \r\n"
				+ "");
		System.out.println("모험을 다시 시작하시겠습니까? (y/n)");
		String ket="x";
		sc.nextLine();
		ket =sc.nextLine();
		if(ket.equals("y")) {
			this.chap1();
		}else{
			this.menu();
		}
	}
	void getkey() {
		key =sc.nextInt();
	}

}
