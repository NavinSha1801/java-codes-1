interface A {
    public void a(); 
    public void s();
  }
  class p implements A 
  {
    public void a() {
      System.out.println("This is just an simple text");
    }
    public void s() {
      System.out.println("This is yet another text");
    }
  }
  
  public class interface {
    public static void main(String[] args) {
      p p1 = new P();
      p1.a();
      p1.s();
    }
  }