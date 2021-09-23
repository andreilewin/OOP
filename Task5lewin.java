package t5;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;

public class Task5 {
	
	public static void main(String[] args){
		//System.out.println(sameLetternPattern("matbebal", "hruB"));
		
		//System.out.println(spiderVsFly("G1", "A4"));
		
		System.out.println(digitsCount(70000));
		
		//String[] check = {"trance", "recant"};
		//System.out.println(totalPoints(check, "recant" ));
		
		//int[] temp = {1, 2, 3, 5, 6, 7, 8, 9};
		//System.out.println(longestRun(temp));
		
		//int[] temp1 = {95, 83, 90, 87, 88, 93};
		//System.out.println(takeDownAverage(temp1));
		
		//System.out.println(rearrange("Tesh3 th5e 1I lov2e way6 she7 j4ust i8s."));
		
		//System.out.println(maxPossible(8732, 91255));
		
		//System.out.println(timeDifference("Moscow", "April 1, 2011 23:23", "Tehran"));
		
		//System.out.println(isNew(123));
	}
	
	public static boolean sameLetternPattern(String str1, String str2) {
		if(str1.length() == str2.length())
		{
			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();
			int[] mas = new int[str1.length()];
			int[] mas2 = new int[str2.length()];
			int un = 1;	
			mas[0] = un;
			mas2[0] = un;		
			
			for (int i = 1; i < str1.length(); i++){
				for (int j = 0; j < i; j++) {
					if (ch1[i] == ch1[j]) {
						mas[i] = mas[j];
					}
					else
					{
						mas[i] = un;
						un = un + 1;
					}
				}
			}
			
			un = 1;
			
			for (int i = 1; i < str2.length(); i++){
				for (int j = 0; j < i; j++) {
					if (ch2[i] == ch2[j]) {
						mas2[i] = mas2[j];
					}
					else
					{
						mas2[i] = un;
						un = un + 1;
					}
				}
			}
			
			for (int i = 0; i < str1.length(); i++){
				if(mas[i] != mas2[i])
					return false;
			}
			return true;
		}
		else
			return false;
	} 
	
	public static String spiderVsFly(String sc, String fc) {
		
		HashMap<Integer, String> bykvi = new HashMap<>();
		bykvi.put(-2, "G");
		bykvi.put(-1, "H");
		bykvi.put(0, "A");
		bykvi.put(1, "B");
		bykvi.put(2, "C");
		bykvi.put(3, "D");
		bykvi.put(4, "E");
		bykvi.put(5, "F");
		bykvi.put(6, "G");
		bykvi.put(7, "H");
		bykvi.put(8, "A");
		bykvi.put(9, "B");
		
		String result = "";
		
		int sr = sc.charAt(0) - 65; 
		int so = sc.charAt(1) - 48;
		
		int fr = fc.charAt(0) - 65; 
		int fo = fc.charAt(1) - 48;
		
		if (sr >= 6 && fr <= 1)
			fr += 8;
		if (sr <= 1 && fr >= 6)
			sr += 8;
		
		if (Math.abs(sr - fr) > 2) {
			for (int i = so; i >= 0; i--)
				result +=  sc.charAt(0) + Integer.toString(i) + "->";
			for	(int i = 0; i <= fo; i++)
				result += "->" +  fc.charAt(0) + Integer.toString(i);
		}
		else
			if (so > fo) {
				result += sc.charAt(0) + Integer.toString(so) + "->";
				while (so != fo) {
					so--;
					result += sc.charAt(0) + Integer.toString(so) + "->";					
				}
				if ( sr < fr ) {
					while ( sr != fr ) {
						sr++;
						result += bykvi.get(sr) + Integer.toString(so) + "->";
					}
				}
				else
					if ( sr > fr ) {
						while ( sr != fr ) {
							sr--;
							result += bykvi.get(sr) + Integer.toString(so) + "->";
						}
					}
			}
			else
			{
				if ( sr < fr ) {
					while ( sr != fr ) {
						sr++;
						result += bykvi.get(sr) + Integer.toString(so) + "->";
					}
				}
				else
					if ( sr > fr ) {
						while ( sr != fr ) {
							sr--;
							result += bykvi.get(sr) + Integer.toString(so) + "->";
						}
					}
				result += sc.charAt(0) + Integer.toString(so) + "->";
				while (so != fo) {
					so++;
					result += sc.charAt(0) + Integer.toString(so) + "->";					
				}
			}
		return result;
	}
	
	public static int digitsCount(int x) {
		if ( x / 10 == 0 )
			return 1;
		else
			return digitsCount(x / 10) + 1;
	}
	
	public static int totalPoints(String[] strmas, String resultstr) {
		int tc = 0;
		
		HashMap<Integer, Integer> bykvi = new HashMap<>();
		resultstr.toLowerCase();
		for (int i = 0; i < resultstr.length(); i++)
			if (bykvi.containsKey(resultstr.charAt(i)))
				bykvi.put((int) resultstr.charAt(i), bykvi.get(resultstr.charAt(i)) + 1);
			else
				bykvi.put((int) resultstr.charAt(i), 1);
		System.out.println(bykvi);
		HashMap<Integer, Integer> tempmap;
		int Flag;
		for (int i = 0; i < strmas.length; i++)
		{
			Flag = 1;
			strmas[i].toLowerCase();
			tempmap = new HashMap<>();
			for (int j = 0; j < strmas[i].length(); j++)
				if (tempmap.containsKey(strmas[i].charAt(j))){
					tempmap.put((int) strmas[i].charAt(j), tempmap.get(strmas[i].charAt(j)) + 1);
					}
				else
				{
					tempmap.put((int) strmas[i].charAt(j), 1);
				}
			for (int key : tempmap.keySet())
				if (!(bykvi.containsKey(key)) || (tempmap.get(key) > bykvi.get(key))){
						Flag = 0;
						break;
				}
			if (Flag != 0) {
				if (strmas[i].length() == 3)
					tc += 1;
				if (strmas[i].length() == 4)
					tc += 2;
				if (strmas[i].length() == 5)
					tc += 3;
				if (strmas[i].length() == 6)
					tc += 54;
			}
			
			
		}
		
		return tc;
	}

	public static int longestRun(int[] mas) {
		int tr = 1;
		int ts = Math.abs(mas[1] - mas[0]);
		int br = 0;
		
		for ( int i = 2; i < mas.length; i++)
		{
			if (Math.abs(mas[i] - mas[i - 1]) == ts)
				tr++;
			else
			{
				if (tr > br)
					br = tr;
				tr = 1;
				ts = Math.abs(mas[i] - mas[i - 1]);
			}
		}

		if (tr > br)
			br = tr;
		return br;
	}

	public static int takeDownAverage(int[] mas) {
		int sum = 0;
		for (int x : mas)
			sum += x;
		return (sum / mas.length - 5 * mas.length - 5 );
	}
	
	public static String rearrange(String str) {
		String result = "";
		int Flag = 1;
		int i = 49;
		
		int ts = 0;
		int lg = 0;
		int rg = 10;
		
		char[] chars = str.toCharArray();
		
		while (true)
		{
			ts = str.indexOf((char)i);
			if (ts == -1)
				break;
			for (int j = 0; j < ts; j++)
			{
				if ((chars[j] == ' ') || (j == 0))
					lg = j;
			}
			for (int j = chars.length - 1; j > ts; j--)
			{
				if ((chars[j] == ' ') || (j == str.length() - 1))
					rg = j;
			}
			result += str.substring(lg, ts) + str.substring(ts + 1, rg) + ' ';
			i++;
		}
		return result;
	}

	public static int maxPossible(int a, int b) {
		
		int count1 = (int)Math.ceil(Math.log10( a + 0.5 ));
		int count2 = (int)Math.ceil(Math.log10( b + 0.5 ));
		
		int index = -1;
		int result = 0;
		
		int[] arrA = new int[count1];
		int[] arrB = new int[count2];
		
		for ( int i = 0; i < count1; i++){
			arrA[i] = a / (int)Math.pow(10, count1 - 1 - i);
			a %= (int)Math.pow(10, count1 - 1 - i);
		}
		
		for ( int i = 0; i < count2; i++){
			arrB[i] = b / (int)Math.pow(10, count2 - 1 - i);
			b %= (int)Math.pow(10, count2 - 1 - i);
		}
		
		for ( int i = 0; i < count1; i++){
			for ( int j = 0; j < count2; j++){
				if ( arrA[i] < arrB[j] ){
					arrA[i] = arrB[j];
					index = j;
				}
			}
			if ( index != -1)
				arrB[index] = -1;
		}
		
		for( int i = 0; i < count1; i++){
			result += arrA[i] * (int)Math.pow(10, count1 - 1 - i);
		}
		
		return result;
	}
	
	public static String timeDifference(String town1, String data, String town2) { 
		data = data.replace(",", "");
		data = data.replace(":", " ");
		
		String[] dataS = data.split(" ");
		
		String mounth = dataS[0];
		int hour = Integer.parseInt(dataS[3]);
		int minuts = Integer.parseInt(dataS[4]);
		int dataNum = Integer.parseInt(dataS[1]);
		int year = Integer.parseInt(dataS[2]);
		int monthindex = 0;
		
		String[] towns = {"Los Angeles", "New York","Caracas", "Buenos Aires", "London", "Rome", "Moscow", "Tehran", "New Delhi", "Beijing", "Canberra"};
		String[] months ={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		int[] townsTime={-480, -300, -270, -180, 0, 60, 180, 210, 330, 480, 600};
		
		int indexOne = 0;
		int indexTwo = 0;
		
		for(int i = 0; i < towns.length; i++)
		{	
			if(towns[i].equals(town1))
				indexOne=i;
			if(towns[i].equals(town2))
				indexTwo=i;
		}
		
		for(int i = 0; i < months.length;i++)
		{
			if(mounth.equals(months[i]))
				monthindex=i;
		}
		Calendar calendar=new GregorianCalendar(year,monthindex,dataNum);
		calendar.set(Calendar.HOUR, hour);
		calendar.set(Calendar.MINUTE, minuts);
		calendar.add(Calendar.MINUTE, townsTime[indexOne] - townsTime[indexTwo]);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-M-d HH:mm");
		return format.format(calendar.getTime());
	}
	
	public static boolean isNew(int num) {
		int i = (int)Math.ceil(Math.log10(num + 0.5));
		int numCopy = num;
		int num1 = 0; 
		Integer[] arrNum1 = new Integer[i];
		i--;
		while ( numCopy > 0 ){
			arrNum1[i] = numCopy % 10;
			numCopy /= 10;
			i--;
		}
		Arrays.sort(arrNum1);
		for(int j = 0; j <= arrNum1.length - 1; j++){
			num1 += arrNum1[j] * (int)Math.pow(10, arrNum1.length - 1 - j);
		}
		System.out.println(num1);
		if (( arrNum1[0] != 0 ) && ( num1 < num ))
			return false;
		else
			return true;
	}	
}
