package RPG;

import java.util.Calendar;
import java.util.InputMismatchException;

import java.util.Scanner;

public class Menu {
	
	
	String id = "xxx";
	String pass = "xxx";
	String name = "xxx";
	String sex = "xxx";
	String trive = "�ΰ�";
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
	String day =cal.get(Calendar.YEAR)+"��"+ cal.get(Calendar.MONTH)+"��"+cal.get(Calendar.DAY_OF_MONTH)+"��"+cal.get(Calendar.HOUR)
	+"��"+ cal.get(Calendar.MINUTE)+"��"+cal.get(Calendar.SECOND)+ "��";
	
	
	
	
	void menu() {
		System.out.println("\n");
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("1. ���� ���� 2.���� ���� 3.���� ���� 000.�޴��ε��ư���");
		Scanner sc = new Scanner(System.in);

		try {
			an = sc.nextInt(); // ���� �Է�

		}

		catch (InputMismatchException e) {

			System.out.println("������ �ƴմϴ�. �ٽ� �Է����ּ���");
			this.menu();

		}

		sc.nextLine();

		if (an == 1) {
			System.out.println("���� ����");
			System.out.println("���� ���̵�:");
			this.id = sc.nextLine();
			this.xxx(id);
			this.exid();
			System.out.println("���� ��й�ȣ:");
			this.pass = sc.nextLine();
			this.xxx(pass);
			this.exid();
			System.out.println("ĳ�� �̸�:");
			this.name = sc.nextLine();
			this.xxx(name);
			this.exid();
			System.out.println("ĳ�� ����: (��/��)");
			this.sex = sc.nextLine();
			this.exid();
			while (true) {
				if (this.sex.equals("��") || this.sex.equals("��")) {
					break;

				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��ϼ��� (��/��)");
					this.sex = sc.nextLine();
				}
			}
			System.out.println("ĳ�� ����: (�ΰ�/��ũ/����)");
			this.trive = sc.nextLine();
			this.exid();
			while (true) {
				if (this.trive.equals("�ΰ�") || this.trive.equals("��ũ") || this.trive.equals("����")) {
					break;

				} else {
					System.out.println("�߸��� �Է��Դϴ�. �ٽ��Է��ϼ��� (�ΰ�/��ũ/����)");
					this.trive = sc.nextLine();
				}
			}
			System.out.println("������ �����Ǿ����ϴ�.");
			this.menu();
		} else if (an == 2) {
			System.out.println("���� ����");
			System.out.println("�������̵� �Է��ϼ���");
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
					System.out.println("��ϵ������� ���̵� �Դϴ�. �ٽ��Է��ϼ��� ����Ƚ��:" + idcount);
					this.checkid = sc.nextLine();
					this.exid();
					this.idcount++;
				}
			}
			System.out.println("������й�ȣ�� �Է��ϼ���");
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
					System.out.println("��й�ȣ�� ��ġ�����ʽ��ϴ�. �ٽ��Է��ϼ��� ����Ƚ��:" + passcount);
					this.checkpass = sc.nextLine();
					this.exid();
					this.passcount++;
				}
			}
			System.out.println(" -���� ����");
			System.out.println("�Ӱ��� ���̵�:" + this.id);
			System.out.println("�Ӱ��� ��й�ȣ:" + this.pass);
			System.out.println("�Ӱ��� �г���:" + this.name);
			System.out.println("�Ӱ��� ����:" + this.sex);
			System.out.println("�Ӱ��� ����:" + this.trive + "\n");
			System.out.println("���� �ɷ�ġ �̱⸦ ���� �մϴ�.");
			if (this.trive.equals("�ΰ�")) {
				System.out.println("����� ������ \"�ΰ�\"�Դϴ�.");
				System.out.println("�ΰ��� �������� 100 �Դϴ� (������ = Str+Dex+Int)");
				while (hap != 100) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("��:" + Str);
				System.out.println("��ø:" + Dex);
				System.out.println("����:" + Int);
				System.out.println("������:" + hap);
				System.out.println("ü��:" + 150);
				System.out.println("����:" + 150);
			} else if (this.trive.equals("��ũ")) {
				System.out.println("����� ������ \"��ũ\"�Դϴ�.");
				System.out.println("��ũ�� �������� 200 �Դϴ� (������ = Str+Dex+Int)");
				while (hap != 200) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("��:" + Str);
				System.out.println("��ø:" + Dex);
				System.out.println("����:" + Int);
				System.out.println("������:" + hap);
				System.out.println("ü��:" + 200);
				System.out.println("����:" + 100);
			} else if (this.trive.equals("����")) {
				System.out.println("����� ������ \"����\"�Դϴ�.");
				System.out.println("������ �������� 150 �Դϴ� (������ = Str+Dex+Int)");
				while (hap != 150) {
					Str = (int) (Math.random() * 100) + 1;
					Dex = (int) (Math.random() * 100) + 1;
					Int = (int) (Math.random() * 100) + 1;
					hap = Str + Dex + Int;
				}
				System.out.println("��:" + Str);
				System.out.println("��ø:" + Dex);
				System.out.println("����:" + Int);
				System.out.println("������:" + hap);
				System.out.println("ü��:" + 100);
				System.out.println("����:" + 200);

			}
			System.out.println("������ �����Ͻðڽ��ϱ�?(y/n)");
			key1 = sc.nextLine();
			if (this.key1.equals("y")) {

			}
			if (this.key1.equals("n")) {
				this.menu();
			} else {

			}

		} else if (an == 3) {
			System.out.println("���� ����");
			this.idcount = 1;
			this.passcount = 1;
			System.out.println("���� �� ���� ���̵� �Է��ϼ���");
			this.delid = sc.nextLine();
			this.exid();
			while (true) {
				if (this.delid.equals(this.id)) {
					break;
				} else {
					if (this.idcount == 3) {
						this.eror();
					}
					System.out.println("��ϵ������� ���̵� �Դϴ� �ٽ��Է��ϼ��� ����Ƚ��:" + idcount);
					this.delid = sc.nextLine();
					this.idcount++;

				}
			}
			System.out.println("��й�ȣ�� �Է��ϼ���");
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
			System.out.println("������ �����Ǿ����ϴ�.");
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
		System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ� �ٽ��Է��ϼ��� ����Ƚ��:" + passcount);
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		x++;
	}

	void xxx(String x) {
		while (true) {
			if (x.equals("xxx")) {
				Scanner sc = new Scanner(System.in);
				System.out.println("���� �� �� ���� ���Դϴ�. �ٸ����� �Է����ּ���");
				x = sc.nextLine();
			} else {
				break;
			}
		}
	}

	void eror() {
		System.out.println("���� ȸ���� �ʰ��ϼ̽��ϴ�. �޴��ε��ư��ϴ�.");
		this.menu();

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
