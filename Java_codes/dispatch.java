class A
{
	int m1(int a,int b,int c)
	{
        int d = a+b+c;
        System.out.println(d);
		return d;
	}
}

class B extends A
{
	int m1(int a,int b,int c)
	{
        A a1 = new A();
        int d = a1.m1(10,20,30);
        int e = d/3;
        System.out.println(e);
		return e;
	}
}

class C extends A
{
	int m1(int a,int b,int c)
	{
		B b1 = new B();
        int f =(int) b1.m1(10,20,30);
        int e = (int)(f*.03);
        System.out.println(e);
        return e;
	}
}
class dispatch
{
	public static void main(String args[])
	{
		C c1 = new C();
		int d = c1.m1(10,20,30);
        System.out.println(d);      
	}
}
