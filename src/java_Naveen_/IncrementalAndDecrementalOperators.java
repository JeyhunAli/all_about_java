package java_Naveen_;

public class IncrementalAndDecrementalOperators {

	public static void main(String[] args) {
		
		
		/** post increment -- means increase the given value later 
		 * 
		 * pre increment -- means first increase the given value 
		 * 
		 * ++ means increase the valur by one 
		 * -- means decrease the value by one 
		 */

		System.out.println("hello world " + 'a' + 'b');   //hello world ab
		System.out.println("hello world " + ('a' + 'b'));   //hello world 195 
		
		
		
		int a = 1;
		int b = a++; //post increment  means increase later
		
		// here a is 1. 1 immediately given to the b.  b now is one a is increased by one its now 2 
		
		System.out.println(a);//2
		System.out.println(b);//1
		
		int m = -1;
		int n = m++;
		
		// here m is -1.  -1 immediately given to the n then increased by one  -1+1=0  m is 0 now 
		
		System.out.println(m);//0
		System.out.println(n);//-1
		
		int p = 1;
		int q = ++p; //pre increment  means increase the value first
		
		//here p is 1 pre increment means first increase the value  p now 2 it given to the q 
		System.out.println(p);//2
		System.out.println(q);//2
		
		int l = -5;
		int u = ++l;
		//-5+(-1)=-4
		System.out.println(l);//-4
		System.out.println(u);//-4
		
		
		int h = 2;
		int g = h--; //post decrement
		System.out.println(h);//1
		System.out.println(g);//2
		
		int x = -99;
		int y = --x; //pre decrement
		System.out.println(x);//-100
		System.out.println(y);//-100
		
		
		int s1 = 0;
		int s2 = --s1;
		System.out.println(s1);//-1
		System.out.println(s2);//-1
		
		
		
		int v = 2;
		System.out.println(v++); //2 why because this post increase 
		//in post increase first printing original value 
		System.out.println(v); //3 because first orignal value then post incremented value
		
		int v1 = 2;
		System.out.println(++v1); //3 because its pre increment 
		// first incrmeent 
		
		
		
		
	}

}