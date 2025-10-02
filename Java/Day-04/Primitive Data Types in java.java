/* Primitive Data Types in java*/

class Example{
	public static void main(String args[]){
		int x;
		x=1.5;
		System.out.println(x);
	}
}



/**************************/

class Example{
	public static void main(String args[]){
		double x;
		x=1.5;
		System.out.println(x);
	}
}

/**************************/

class Example{
	public static void main(String args[]){
		System.out.println(Byte.MIN_VALUE); // Wrapper class 
		System.out.println(Byte.MAX_VALUE);
		System.out.println("=============");
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println("=============");
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("=============");
		// boolean *** -> [1,0]
		// Charactor
	}
}


/**************************/

class Example{
	public static void main(String args[]){

		byte b=100;
		short sh;
		sh=b;// works, legal, coversion		

		System.out.println(b+"=>"+sh);
	}
}

/**************************/
class Example{
	public static void main(String args[]){

		short sh =100;
		byte b;
		b=sh; // illegal		

		System.out.println(b+"=>"+sh);
	}
}


/**************************/

class Example{
	public static void main(String args[]){

		short sh =100;
		byte b;
		b=(byte)sh; // illegal		

		System.out.println(b+"=>"+sh);
	}
}

/**************************/
class Example{
	public static void main(String args[]){

		short sh =1000;
		byte b;
		b=(byte)sh; // illegal		

		System.out.println(b+"=>"+sh);
	}
}

/**************************/
class Example{
	public static void main(String args[]){
//wider coversion (automatic)
		byte b=100;
		short sh;
		sh=b;
		System.out.println(b+"=>"+sh);
	}
}

/**************************/
