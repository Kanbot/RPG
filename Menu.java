package RPG;

import java.util.Calendar;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Menu {
	
	
	String id = "xxx";
	String pass = "xxx";
	String name = "xxx";
	String sex = "xxx";
	String trive = "인간";
	String checkid = "xxx";
	String checkpass = "xxx";
	int idcount = 1;
	int passcount = 1;
	String delid = "xxx";
	String delpass = "xxx";
	int an;
	int Str;
	int Dex;
	int Int;
	int hap;
	int HP;
	int MP;
	String key1;
	int key;
	Calendar cal = Calendar.getInstance();
	String day =cal.get(Calendar.YEAR)+"년"+ cal.get(Calendar.MONTH)+"월"+cal.get(Calendar.DAY_OF_MONTH)+"일"+cal.get(Calendar.HOUR)
	+"시"+ cal.get(Calendar.MINUTE)+"분"+cal.get(Calendar.SECOND)+ "초";
	
	
	
	
	void menu() {
		System.out.println("\n");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 계정 생성 2.계정 접속 3.계정 삭제 000.메뉴로돌아가기");
		Scanner sc = new Scanner(System.in);

		try {
			an = sc.nextInt(); // 정수 입력

		}

		catch (InputMismatchException e) {

			System.out.println("정수가 아닙니다. 다시 입력해주세요");
			this.menu();

		}

		sc.nextLine();

		if (an == 1) {
			System.out.println("계정 생성");
			System.out.println("계정 아이디:");
			this.id = sc.nextLine();
			this.xxx(id);
			this.exid();
			System.out.println("계정 비밀번호:");
			this.pass = sc.nextLine();
			this.xxx(pass);
			this.exid();
			System.out.println("캐릭 이름:");
			this.name = sc.nextLine();
			this.xxx(name);
			this.exid();
			System.out.println("캐릭 성별: (남/녀)");
			this.sex = sc.nextLine();
			this.exid();
			while (true) {
				if (this.sex.equals("남") || this.sex.equals("녀")) {
					break;

				} else {
					System.out.println("잘못된 입력입니다. 다시입력하세요 (남/녀)");
					this.sex = sc.nextLine();
				}
			}
			System.out.println("캐릭 종족: (인간/오크/엘프)");
			this.trive = sc.nextLine();
			this.exid();
			while (true) {
				if (this.trive.equals("인간") || this.trive.equals("오크") || this.trive.equals("엘프")) {
					break;

				} else {
					System.out.println("잘못된 입력입니다. 다시입력하세요 (인간/오크/엘프)");
					this.trive = sc.nextLine();
				}
			}
			System.out.println("계정이 생성되었습니다.");
			this.menu();
		} else if (an == 2) {
			System.out.println("계정 접속");
			System.out.println("계정아이디를 입력하세요");
			idcount =1;
			this.checkid = sc.nextLine();
			this.exid();
			while (true) {
				if (this.checkid.equals(this.id)) {
					break;

				} else {
					if (this.idcount == 3) {
						this.eror();
					}
					System.out.println("등록되지않은 아이디 입니다. 다시입력하세요 오류횟수:" + idcount);
					this.checkid = sc.nextLine();
					this.exid();
					this.idcount++;
				}
			}
			System.out.println("계정비밀번호를 입력하세요");
			passcount =1;
			this.checkpass = sc.nextLine();
			this.exid();
			while (true) {
				if (this.checkpass.equals(this.pass)) {
					break;

				} else {
					if (this.passcount == 3) {
						this.eror();
					}
					System.out.println("비밀번호가 일치하지않습니다. 다시입력하세요 오류횟수:" + passcount);
					this.checkpass = sc.nextLine();
					this.exid();
					this.passcount++;
				}
			}
			System.out.println(" -계정 정보");
			System.out.println("ㅣ계정 아이디:" + this.id);
			System.out.println("ㅣ계정 비밀번호:" + this.pass);
			System.out.println("ㅣ계정 닉네임:" + this.name);
			System.out.println("ㅣ계정 성별:" + this.sex);
			System.out.println("ㅣ계정 종족:" + this.trive + "\n");
			System.out.println("계정 능력치 뽑기를 진행 합니다.");
			if (this.trive.equals("인간")) {
				System.out.println("당신의 종족은 \"인간\"입니다.");
				System.out.println("인간의 종족값은 100 입니다 (종족값 = Str+Dex+Int)");
				while (hap != 100) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("힘:" + Str);
				System.out.println("민첩:" + Dex);
				System.out.println("지력:" + Int);
				System.out.println("종족값:" + hap);
				System.out.println("체력:" + 150);
				System.out.println("마력:" + 150);
			} else if (this.trive.equals("오크")) {
				System.out.println("당신의 종족은 \"오크\"입니다.");
				System.out.println("오크의 종족값은 200 입니다 (종족값 = Str+Dex+Int)");
				while (hap != 200) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("힘:" + Str);
				System.out.println("민첩:" + Dex);
				System.out.println("지력:" + Int);
				System.out.println("종족값:" + hap);
				System.out.println("체력:" + 200);
				System.out.println("마력:" + 100);
			} else if (this.trive.equals("엘프")) {
				System.out.println("당신의 종족은 \"엘프\"입니다.");
				System.out.println("엘프의 종족값은 150 입니다 (종족값 = Str+Dex+Int)");
				while (hap != 150) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("힘:" + Str);
				System.out.println("민첩:" + Dex);
				System.out.println("지력:" + Int);
				System.out.println("종족값:" + hap);
				System.out.println("체력:" + 100);
				System.out.println("마력:" + 200);

			}
			System.out.println("게임을 시작하시겠습니까?(y/n)");
			key1 = sc.nextLine();
			if (this.key1.equals("y")) {

			}
			if (this.key1.equals("n")) {
				this.menu();
			} else {

			}

		} else if (an == 3) {
			System.out.println("계정 삭제");
			this.idcount = 1;
			this.passcount = 1;
			System.out.println("삭제 할 계정 아이디를 입력하세요");
			this.delid = sc.nextLine();
			this.exid();
			while (true) {
				if (this.delid.equals(this.id)) {
					break;
				} else {
					if (this.idcount == 3) {
						this.eror();
					}
					System.out.println("등록되지않은 아이디 입니다 다시입력하세요 오류횟수:" + idcount);
					this.delid = sc.nextLine();
					this.idcount++;

				}
			}
			System.out.println("비밀번호를 입력하세요");
			this.delpass = sc.nextLine();
			this.exid();
			while (true) {
				if (this.delpass.equals(this.pass)) {
					break;
				} else {
					if (this.passcount == 3) {
						this.eror();
					}
					this.erorr(passcount);
				}
			}
			System.out.println("계정이 삭제되었습니다.");
			this.pad();
			this.menu();

		}

	}

	void exid() {
		if (this.id.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.pass.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.name.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.sex.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.trive.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.checkid.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.checkpass.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.delid.equals("000")) {
			this.pad();
			this.menu();
		}
		if (this.delpass.equals("000")) {
			this.pad();
			this.menu();
		}
	}

	void pad() {

		id = "xxx";
		pass = "xxx";
		name = "xxx";
		sex = "xxx";
		trive = "xxx";
		checkid = "xxx";
		checkpass = "xxx";
		idcount = 1;
		passcount = 1;
		delid = "xxx";
		delpass = "xxx";
	}

	void erorr(int x) {
		System.out.println("비밀번호가 틀렸습니다 다시입력하세요 오류횟수:" + passcount);
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		x++;
	}

	void xxx(String x) {
		while (true) {
			if (x.equals("xxx")) {
				Scanner sc = new Scanner(System.in);
				System.out.println("지정 할 수 없는 값입니다. 다른값을 입력해주세요");
				x = sc.nextLine();
			} else {
				break;
			}
		}
	}

	void eror() {
		System.out.println("오류 회수를 초과하셨습니다. 메뉴로돌아갑니다.");
		this.menu();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
