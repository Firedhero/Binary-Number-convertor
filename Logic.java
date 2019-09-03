import java.util.Scanner;

public class Logic  {

	static String[] NumAray=new String[1];
	public static String Nu;
	static Scanner Numbers = new Scanner(System.in);
	 static int[] n;
	static int NewLength;
	static String [] up;
	static String reverse="";
	static String[] Bin;
	static String[] d;
	static int[] c;
	static String[] p;
	static String[] m;
	
	public static void splitter() {
		
		//splits
		up= Nu.split("(?<=\\G....)");
		
	}
	public static void Reverse() {
	//reverse string
		
		for(int i = Nu.length() - 1; i >= 0; i--)
        {
            reverse = reverse + Nu.charAt(i);
        }
		m= reverse.split("(?<=\\G....)");
}
	
	
	public static void Binary() {
		
		 Bin=new String[up.length];
		 n=new int[up.length];
		 d=new String[up.length];
		 c=new int[up.length];
		for(int o=0;o<up.length;o++) {
		//convert string to double
		n[o] = Integer.parseInt(up[o]);
		c[o]=Integer.parseInt(m[o]);
		}
		
		//adds 0's to make a incomplete 4 digit num to 4 digits
		for(int i=0;i<up.length;i++) {
			
			 Bin[i] = String.format("%04d", n[i]);
			 d[i]=String.format("%04d", c[i]);
		}
		
	}
	public static void Input() {
		
			Nu=Numbers.next();
			
	}
	
public static void convertor() {
			Input();
			
			Reverse();
			splitter();
			Binary();
			
			
			
			System.out.println("this is the string revered "+reverse);
	System.out.println("this is New ");
	for(int i=0;i<up.length;i++) {
		System.out.println(up[i]);
		
		}
	System.out.println("this is old Binary ");
	for(int i=0;i<up.length;i++) {
		System.out.println(Bin[i]);
		
		}
	System.out.println("this is first reverse Binary ");
	for(int i=0;i<up.length;i++) {
		System.out.println(d[i]);
		
		}
	System.out.println("second reverse");
			
			for(int i=up.length-1;i>=0;i--) {
				System.out.println(d[i]);
				
				}
	}

	
}
