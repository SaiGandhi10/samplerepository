package week3;

public class TypeCasting {

	public static void main(String[] args) 
	{
		//int double float char
		//Primitive to Primitive conversion
		
		//converting int to char
		int i1=100;
		char c1=(char)i1;
		System.out.println(c1);
		
		System.out.println("**************************");
		//converting char to int
		char c2='s';
		int i2=(int)c2;
		System.out.println(i2);
		
		char c4=34;
		System.out.println(c4);
		int i=(int)c4;
		System.out.println(i);
		System.out.println("**************************");
	
		//converting character to float
		char c3='L';
		float f=(float)c3;
		System.out.println(f);
		
		//converting double to float
		double d=2343.35224098765432;
		float f1=(float)d;
		System.out.println(f1);
	
		//converting float to integer
		float f2=324.253F;
		int i4=(int)f2;
		System.out.println(i4);
		
		
		//converting double to char
		double d1=122.32;
		char c=(char)d1;
		System.out.println(c);		
		
		
		
	}

}
