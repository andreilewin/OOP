public class task1levin {
	
	public static void main(String args[])
	{
		zad1();	
		zad2();
		zad3();
		zad4();
		zad5();
		zad6();
		zad7();
		zad8();
		zad9();
		zad10();
		
	}
	
	public static void zad1()
	{
		System.out.println("zadanie 1");
		Reader r = new Reader();
		r.scan1();
		int sec = resh1(r.min);
		System.out.println("sec " + sec);
		
	}
	
	public static int resh1(int min)
	{
		int sec;
		sec = min * 60;
		return sec;
	}
	
	public static void zad2()
	{
		System.out.println();
		System.out.println("zadanie 2");
		Reader r = new Reader();
		r.scan2();
		int answer = resh2(r.countx2,r.countx3);
		System.out.println("o4ki= " + answer);

	}
	
	public static int resh2(int x,int y)
	{
		int two;
		int tree;
		int answer;
		two = x * 2;
		tree = y * 3;
		answer = two+ tree;
		return answer;
	}
	
	public static void zad3()
	{
		System.out.println();
		System.out.println("zadanie 3");
		Reader r = new Reader();
		r.scan3();
		int answer = resh3(r.pobedy,r.ni4iy,r.pobedy);
		System.out.println("vsego o4kov " + answer);

	}
	
	public static int resh3(int pob,int ni4,int por)
	{
		int answer;
		answer = pob * 3 + ni4 * 1 + por * 0;
		return answer;
	}
	
	public static void zad4()
	{
		System.out.println();
		System.out.println("zadanie 4");
		Reader r = new Reader();
		r.scan4();
		boolean answer = resh4(r.count);
		System.out.println("otvet " + answer);
		
	}
	
	public static boolean resh4(int count)
	{
		if (count % 5 == 0)
			return true;
		else
		    return false;
	}
	
	public static void zad5()
	{
		System.out.println();
		System.out.println("zadanie 5");
		Reader r = new Reader();
		r.scan4();
		boolean answer = resh5(r.count);
		System.out.println("otvet " + answer);
		
	}
	
	public static boolean resh5(int count)
	{
		if ((count % 20 == 0) && (count % 10 == 0))
			return true;
		else
			return false;

	}
	
	public static void zad6()
	{
		System.out.println();
		System.out.println("zadanie 6");
		Reader r = new Reader();
		r.scan6();
		int answer = resh6(r.n,r.w,r.h);
		System.out.println("kol sten  " + answer + " whall");
		
	}
	
	public static int resh6(int n, int w , int h)
	{
		int answer;
		answer = n/(w*h);
		return answer;
	}
	
	public static void zad7()
	{
		System.out.println();
		System.out.println("zadanie 7");
		Reader r = new Reader();
		r.scan4();
		int answer = resh7(r.count);
		System.out.println("otvet: " + answer);
		
	}
	
	public static int resh7(int b)
	{
		return b * b;
	}
	
	public static void zad8()
	{
		System.out.println();
		System.out.println("zadanie 8");
		Reader r = new Reader();
		r.scan8();
		boolean answer = resh8(r.prob,r.prize,r.pay);
		System.out.println("otvet: " + answer);
	}
	
	public static boolean resh8(int prob, int prize , int pay)
	{
		if (prob * prize - pay > 0)
			return true;
		else 
			return false;

	}
	
	public static void zad9()
	{
		System.out.println();
		System.out.println("zadanie 9");
		Reader r = new Reader();
		r.scan9();
		int answer = resh9(r.FPS,r.cmin);
		System.out.println("kol FPS: " + answer);
	}
	
	public static int resh9(int FPS,int min)
	{
		int answer;
		answer = FPS * min;
		return answer;
	}
	
	public static void zad10()
	{
		System.out.println();
		System.out.println("zadanie 10");
		Reader r = new Reader();
		r.scan10();
		int answer = resh10(r.chislo10,r.delitel);
		System.out.println("ostatok ot del: " + answer);

	}
	
	public static int resh10(int x,int delitel)
	{
		int answer;
		int rezdel = x / delitel;
		if ( rezdel * delitel == x)
			return 0;
		else {
			answer = x - rezdel * delitel;
			return answer;
		}

	}
	
}