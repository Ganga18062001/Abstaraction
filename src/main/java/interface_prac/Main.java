package interface_prac;
//In interface only allowed , abstract method does not allowed not abstarct method
//abstract method  can not have body
//also we does not need to declare abstract keyword to method , inside the interface
//by default variable is public static final
//By default , method is public


interface A{
    void Play();
}
interface B extends A{
    void Run();
}
class C implements B,A{
    public void Play(){
        System.out.println("Man is playing");
    }
    public void Run(){
        System.out.println("Man is run");
    }
}



public class Main {
    public static void main(String[] args) {
        C c = new C();
        c.Play();
        c.Run();

    }
}
