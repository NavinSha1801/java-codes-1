interface A {
    public void a(); 
  }
interface S 
{
    public void s();
}
  class p implements A,S {
    public void a() {
      System.out.println("This is just an simple text");
    }
    public void s() {
      System.out.println("This is yet another text");
    }
  }
  
  public class inter { 
    public static void main(String[] args) {
      p p1 = new p();
      p1.a();
      p1.s();
    }
  }