class A
{
	int m1(int a,int b,int c)
	{
        int d = a+b+c;
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
        return e;
	}
}
class dynamic_method_dispatch
{
	public static void main(String args[])
	{
		C c1 = new C();
		c1.m1(10,20,30);
	}
}
