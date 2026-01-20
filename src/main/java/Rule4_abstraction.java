//when both are abstract class it does not necessary implement the abstract method inside abstract class
//but when non-abstract class extend abstract class , it must be implement abstract method

abstract class Parent1{
    abstract void work();
}

abstract class child1 extends Parent1{
    abstract void childWork();
    void run(){
        System.out.println("child1.run");
    }
}
class child extends child1{
    void work(){
        System.out.println("child.work");
    }
    void childWork(){
        System.out.println("child.childWork");
    }
}
class Animal2{

}
abstract class dog extends Animal2{

}



public class Rule4_abstraction {
    public static void main(String[] args) {
        child ch = new child();
        ch.childWork();
        ch.work();
        ch.run();

    }
}
