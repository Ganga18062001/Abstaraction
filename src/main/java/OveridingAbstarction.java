abstract class Hotel{
    abstract void eat1();
    abstract void eat2();
    abstract void eat3();
    abstract void eat4();
    abstract void eat();
}


abstract class Indianhotel extends Hotel{
    void eat(){
        System.out.println("Indian food available");
    }

     @Override
     void eat1() {
         System.out.println("Indianhotel.eat1");

     }

    @Override
    void eat2() {
        System.out.println("Indianhotel.eat2");

    }

    @Override
    void eat3() {

    }

    @Override
    void eat4() {

    }
}
  class Japanhotel extends Indianhotel{
    void eat(){
        System.out.println("Japan food available");
    }

      @Override
      void eat1() {
          System.out.println("Japanhotel.eat1");
      }

      @Override
      void eat2() {
          System.out.println("Japanhotel.eat2");
      }

      @Override
      void eat3() {

      }

      @Override
      void eat4() {

      }
  }

public class OveridingAbstarction {
    public static void main(String[] args) {
        Japanhotel japan = new Japanhotel();
        japan.eat();
        japan.eat1();
        japan.eat2();


//        Indianhotel indian = new Indianhotel();
//        indian.eat1();
    }

}
