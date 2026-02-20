package abstraction_prc;

abstract class Child{
    abstract void Drink();
}

class Son extends Child{
    void Drink(){
        System.out.println("drinking alocohol");
    }
}
public class Common {
    public static void main(String[] args) {
        Son son = new Son();
        son.Drink();
    }

}
