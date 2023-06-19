package OOps;
//this is the polymorphism function overloading
// this is compile time error
class Studentinfo{
    String name;
    int age;
    public void printInf(String name){
        System.out.println("The name is: "+name);
    }
    public void printInf(int age){
        System.out.println("The age is: "+age);
    }
    public void printInf(String name,int age){
            System.out.print("The name is: "+name);
            System.out.println("\tThe age is: "+age);
        }
    
}

public class Polymorphism {
    public static void main(String[] args) {
        Studentinfo st = new Studentinfo();
        st.name = "Rahul";
        st.age = 22;
       st.printInf(st.name);
       st.printInf(st.age);
       st.printInf(st.name,st.age);
    }
}
