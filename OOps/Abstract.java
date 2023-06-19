package OOps;
  abstract class Animal{
    public Animal(){
        System.out.println("thsi is the new animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal Are eats");
    }
  }
  class Horse extends Animal{
    public Horse(){
        System.out.println("This is creating horse");
    }
    public void Walk(){
        System.out.println("Walk on 4 legs");
    }
    @Override
    void walk() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'walk'");
    }
}

    
  class Chicken extends Animal{
   
    public void walk(){
        System.out.println("Wlks on 2 legs");
    }
  }
public class Abstract {
    public static void main(String args[]){
        Horse h = new Horse();
        h.eat();
        h.Walk();
    
    }
}
// in Abstract class We do not make any the Object of the class
//Abstract is a run time error
//Abstract find error after compile is also known as runtime error
//it cannot be instantiated
/*
 -> Abstract can have a constractor and static method
 ->it can ve final methods which will force the subclass not to
     be change the body of the method
     => Construct in heritance call first the base class
 */