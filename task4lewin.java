import java.util.Arrays;
public class task4{

    public static void main(String[] args) {
       System.out.println(one(new int[] {2, 55, 60, 97, 86}));	         
	   System.out.println(two(new int[] {5, 1, 4, 3, 2}));
	   System.out.println(three("hTsii  s aimex dpus rtni.g"));
	   System.out.println(four("What went wrong?????????"));
	   System.out.println(five("Inside the box was a x x xylophone"));
	   System.out.println(six(new int[] {9, 4, 26, 26, 0, 0, 5, 20, 6, 25, 5}));
       System.out.println(seven("832"));	  
       System.out.println(eight("Watch the characters dance!"));	  
       System.out.println(nine(1222, 30277));	
       System.out.println(ten("teshahset"));		   
    }
	public static String one(int[] mass) {
			
		 StringBuilder sb = new StringBuilder();
        for (int value : mass) {
            sb.append(value);
        }		
        return sb.toString().contains("7") ? "Boom!" : "there is no 7 in the array";
    }
		public static String two(int[] mass) {
		Arrays.sort(mass);	
        boolean	Yn=true;	
					for(int i=0;i<mass.length-1;i++){
						if((mass[i+1]-mass[i])!=1){
							Yn=false;
						}
					}
			
			return Yn==true? "true" : "false";
		}
 public static String three(String first){
	 char[] ch = first.toCharArray();

	 StringBuilder sb = new StringBuilder();
	 for(int i=0;i<first.length()-1;i+=2){
		 char vr=ch[i];
		 char vr2=ch[i+1];
		sb.append(vr2 );
		sb.append(vr );
	
	 }
	 return sb.toString();
 }
 public static String four(String first){
	 StringBuilder sb = new StringBuilder();
	 int n=0;
	  char[] ch = first.toCharArray();
	 if(ch[ch.length-1]==63){
		  for(int i=first.length()-1;i>1;i--){
			  if(ch[i]==ch[i-1] && ch[i]==63){
				 n=i;   
			  }
		  }	
for(int i=0;i<n;i++){
			    sb.append(ch[i]); 
		   }		  
	 return sb.toString();
	 }else  if(ch[ch.length-1]==33){
		   for(int i=first.length()-1;i>1;i--){
			  if(ch[i]==ch[i-1] && ch[i]==33){
				n=i;  
			  }
		  }
		   for(int i=0;i<n;i++){
			    sb.append(ch[i]); 
		   }
		   return sb.toString();
	 }else{
 return first;
	 }			  
 }
  public static String five(String first){
	 String[] words = first.split(" ");
	  StringBuilder sb = new StringBuilder();
	 for(int l=0;l<words.length;l++){
		  char[] ch = words[l].toCharArray();
		   for(int i=0;i<ch.length;i++){
			   if(ch.length==1 && ch[0]==120){
				   sb.append("cks"); 
			   }else if(ch[0]==120){
				   if(ch[i]==120){
					   sb.append("z");
				   }else{
					   sb.append(ch[i]);
				   
				   }
			   }else{
				    if(ch[i]==120){
					   sb.append("cks");
				   }else{
					   sb.append(ch[i]);
				   }
			   }
		  }
		  sb.append(" ");
	 }
	 return sb.toString();
	 
  }
  public static String six(int[] mass) {
	  	Arrays.sort(mass);	
		int max=Math.abs(mass[0]-mass[1]);
		
	for(int i=0;i<mass.length-1;i++){
			if(Math.abs(mass[i]-mass[i+1])>max){
				max=Math.abs(mass[i]-mass[i+1]);
			}			
		}
		return String.valueOf( max);
  }
  public static String seven(String first){
	  int two=0;
	   int one=Integer.parseInt(first);
	  char[] ch = first.toCharArray();
	  int [] n=new int[ ch.length];
	  
	  for(int i=0;i<ch.length;i++){
		  n[i]=Character.getNumericValue(ch[i]);
	  }
	    	Arrays.sort(n);
			
	int[] a=new int [n.length];
	  for(int i=0;i<n.length;i++){
		  a[i]=n[n.length-i-1];
	  }
		for(int i=0;i<ch.length;i++){
		 two+=a[i]*(Math.pow(10,i));
	  }
	  one=one-two;
	  return String.valueOf(one);	
  }
   public static String eight(String first){
	   String word2=first.toLowerCase();
	   
	 char[] glasn={'a','e','i','o','u','y'};
	   String[] words = first.split(" ");
	   int a=0;    int e =0;    int i=0;    int o=0;    int u=0;    int y=0;
	    for(int l=0;l<words.length;l++){
		  char[] ch = words[l].toCharArray();
		  if(ch[ch.length-1]==97){
			  a++;
		  }else if(ch[ch.length-1]==101){
			  e++;
		  }else if(ch[ch.length-1]==105){
			  i++;
		  }else if(ch[ch.length-1]==111){
			  o++;
		  }else if(ch[ch.length-1]==117){
			  u++;
		  }else if(ch[ch.length-1]==121){
			  y++;
		  }
		}
		int[] countGlass={a,e,i,o,u,y};
		int max=countGlass[0];
		int NomEl=0;
		for(int l=0;l<6;l++){
			
			if(max<countGlass[l]){
				max=countGlass[l];
				NomEl=l;
			}
		}
		
		return String.valueOf(glasn[NomEl]);
   }
    public static String nine(int num1,int num2){
		String resh="";
		int a,b,reza,razb,sum;
		if(num1>num2){
			a=num1;
			b=num2;
		}else{
				a=num2;
			b=num1;
		}
		while(a>0){
			reza=a%10;
			razb=b%10;
			sum=razb+reza;
			
			resh+=sum;
			a=a/10;
			b=b/10;
			
		}
		StringBuffer buf=new StringBuffer(resh);
		buf.reverse();
		
		return buf.toString();
		
	}
    public static String ten(String first){		
	//поворот
        String result = new StringBuilder(first).reverse().toString();
		//приводит к сохранению только последнего вхождения символа в строку(поэтому нужно развернуть строку до и посл езамены)
        result = result.replaceAll("(.)(?=.*\\1)", "");
		//поворот
        result = new StringBuilder(result).reverse().toString();
        
		  return result;	
	}
 
}

   