/* Variables in java */

class Example{
	public static void main(String args[]){
		int x,y,z;
		x=100;
		y=200;
		z=300;
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		//int y;
		System.out.println(y);
	}
}

/**************************/
class Example{
	public static void main(String args[]){
		int x,y,z;
		x=100;
		y=200;

		z=x+y;		

		System.out.println(x);
		System.out.println(y);
		System.out.println(z);

		//int y;
		System.out.println(y);
	}
}

/**************************/
class Example{
	public static void main(String args[]){
		int x,y;
		x=100;
		System.out.println(x); //100
		y=200;

		System.out.println(y); //200

		x=y; // valid code		

		System.out.println(x); //200
		System.out.println(y); //200
	}
}

/**************************/
class Example{
	public static void main(String args[]){
		System.out.println("AB"+"CD"); // print ABCD
		System.out.println(10+20); // print 30
		System.out.println(10+"20");// 1020
		System.out.println("10"+20);// 1020
	}
}

/**************************/
class Example{
	public static void main(String args[]){
		int x=10,y=20,z=30;
		System.out.println("x+y+z"); 	//Line 1
		System.out.println("x+y"+"z"); 	//Line 2
		System.out.println("x"+"y+z"); 	//Line 3
		System.out.println(x+"y+z"); 	//Line 4
		System.out.println("x+y"+z); 	//Line 5
		System.out.println("x"+"y"+"z");//Line 6
		System.out.println(x+"y"+"z");	//Line 7
		System.out.println("x"+y+"z");	//Line 8
		System.out.println("x"+"y"+z);	//Line 9
		System.out.println(x+"y"+z);	//Line 10
		System.out.println("x"+y+z);	//Line 11
		System.out.println(x+y+"z");	//Line 12
		System.out.println(x+y+z);		//Line 13
	}
}

/**************************/

