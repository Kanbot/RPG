package RPG;

import java.util.Scanner;

public class Advan extends Menu {
	Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}
	// ���丮 é�� 1
	void chap1() {
		System.out.println("������ �����մϴ�");
		if(this.trive.equals("�ΰ�")) {
			System.out.println("��� �̸� �� ������ ���� �������� �¾ ��� "+this.name+"��(��) ������ �¾� ������ ������� �մϴ�.");
			System.out.println("��� �������� ������ ���� ��� �տ� �� ���� ������ ���İ� ���Դϴ�. �����ֽðڽ��ϱ�?");
			System.out.println("1. �����ش�  2.�����ϰ� ������ 3. ��� ��������");
			this.getkey();
		if(key == 1) {
			System.out.println("����! ���Ĵ� ��� ������ ���� �����ϴ�. ����� �ٰ����� ������ �Ѹ��� ���� �����ϴ�.");
			System.out.println("����� ���� �ߵ��Ǿ� ������ ���� �־� ���ϴ�...");
			this.die();
			
		}
		if(key == 2) {
			System.out.println("����� ������ ���ĸ� �����ϰ� ������ �������ϴ�.");
			System.out.println("������ ����� ����� ��å�� ������ �ٽ� �ǵ��ư��� �� ���θ��� �ɷ� �Ѿ��� �׾����ϴ�.");
			this.die();
		}if(key ==3 ) {
			System.out.println("����� ������ ���ĸ� ��� ���������ϴ�.");
			System.out.println("�߰��� ���Ҹ��� ������� �ƹ� �ϵ� �־�� �ʾҽ��ϴ�.");
			System.out.println("���� ���� �ȴ� ��� �տ� ���ڲ��� ��Ÿ�ҽ��ϴ�.");
			System.out.println("���ڻ簡 �ڽŰ� ������ �غ����ʰڳİ� ����ɴϴ�.");
			System.out.println("1. ������ �Ѵ�  2.������ ���� �ʰ� ������");
			this.getkey();
			if(key == 1) {
				System.out.println("����� ���ڿ� ���մϴ�.");
				
			}
			if(key == 2) {
				System.out.println("����� ������ ���� �߽��ϴ�.");
				System.out.println("�ٽ� ������ �����ϴ�.");
				
			}
		}
			
		}else if(this.trive.equals("��ũ")) {
			
		}else if(this.trive.equals("����")) {
			
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
		System.out.println("������ �ٽ� �����Ͻðڽ��ϱ�? (y/n)");
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
