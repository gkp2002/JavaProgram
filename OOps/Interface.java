package OOps;

interface Animals{
     void walk1();
}
class Horses implements Animals{
    public void walk1(){
        System.out.println("Horse is run on four leg");
    }
}
public class Interface{
    public static void main (String args[]){
        Horses h = new Horses();
       h.walk1();

    }
}
/*
   *********Interface**********
   =>All the fields in interface are the public static and final by default
   . all the methods are public & abstract by default
   => A class that implements an interface must implements all the 
   method declared in the interface
   => interface support the functionlity of multiple interface 
   => Multiple inheritance is not working in the class 
       MULTIPLE INHERITANCE IS WORK ON INTERFACE IN JAVA
 */