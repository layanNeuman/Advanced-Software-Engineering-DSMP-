/* Primitive Data Types in java*/

/**************************/

class Example{
	public static void main(String args[]){
		int age=20;
		//age=age+10;
		//System.out.println(age); // 30
//===================
		//age+=10;
		//System.out.println(age);
//===================
		byte b=10;
		int x =100;
		//b=b+x;//?
		//System.out.println(b);
		b+=x;
		System.out.println(b);
	}
}



/**************************/
class Example{
	public static void main(String args[]){
		int x=5, y=2;
		//double d=x/y;
		//System.out.println(d);//2.0
		double d=(double) x/y;
		System.out.println(d);//2.5
	}
}

/**************************/

class Example{
	public static void main(String args[]){
		short s=100;
		byte b;
		// b=s;// illegal
		b=(byte)s;
		System.out.println(b);
	}
}
