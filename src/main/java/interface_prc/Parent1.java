package interface_prc;

interface A1{
    void a1();

}
interface A2{
    void a();

}
interface A3 extends A1,A2{
    void b();


}

public  class Parent1 implements A3,A2,A1 {

    @Override
    public void b() {

    }

    @Override
    public void a1() {

    }

    @Override
    public void a() {
        System.out.println("Parent1.a");

    }
    static void show(){
        System.out.println("Parent1.show");
    }

    public static void main(String[] args) {
        Parent1.show();
        Parent1 p1 = new Parent1();
        p1.a();
        p1.a1();
        p1.b();

    }
}
