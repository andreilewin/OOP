import java.util.Scanner;
public class Reader {
	int min;
	int countx2;
	int countx3;
	int pobedy;
	int ni4iy;
	int porazh;
	int count;
	int n;
	int w;
	int h;
	int prob;
	int prize;
	int pay;
	int FPS;
	int cmin;
	int chislo10;
	int delitel;
	
	
	public void scan1(){
	Scanner scn = new Scanner(System.in);
	System.out.println(" minutes");
	min = scn.nextInt();
	}
	
	public void scan2(){
		Scanner scn = new Scanner(System.in);
		System.out.println(" 2 score");
		countx2 = scn.nextInt();
		System.out.println(" 3 score");
		countx3 = scn.nextInt();
		}
	
	public void scan3(){
		Scanner scn = new Scanner(System.in);
		System.out.println("pobeda");
		pobedy = scn.nextInt();
		System.out.println("ni4iy");
		ni4iy = scn.nextInt();
		System.out.println("porazh");
		porazh = scn.nextInt();
		}
	
	public void scan4(){
		Scanner scn = new Scanner(System.in);
		System.out.println("vvod n");
		count = scn.nextInt();
	}
	
	public void scan6(){
		Scanner scn = new Scanner(System.in);
		System.out.println("kol sten");
		n = scn.nextInt();
		System.out.println("dlina");
		w = scn.nextInt();
		System.out.println("visota");
		h = scn.nextInt();
	}
	
	public void scan8(){
		Scanner scn = new Scanner(System.in);
		System.out.println(" prob");
		prob = scn.nextInt();
		System.out.println(" prize");
		prize = scn.nextInt();
		System.out.println(" pay");
		pay = scn.nextInt();
	}
	
	public void scan9(){
		Scanner scn = new Scanner(System.in);
		System.out.println(" FPS");
		FPS = scn.nextInt();
		System.out.println(" sec");
		cmin = scn.nextInt();
		}
	
	public void scan10(){
		Scanner scn = new Scanner(System.in);
		System.out.println("vvod n");
		chislo10 = scn.nextInt();
		System.out.println("vvod divider");
		delitel = scn.nextInt();
		}

}