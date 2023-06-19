package OOps;
class Student{
    String name;
    int age;
    
  //this keyword is use to define the class data 

//   public  Student(String name , int age){//this is parametersize constructor
//         this.name=name;
//         this.age=age;
//     }
public Student(){}//this is defult constructor
  public void printInfo(){
   System.out.println("Student name: "+name+"\t Student age: "+age);
  }
  public Student(Student s2){//this is copy constructor
    this.name = s2.name;
    this.age=s2.age;

  }
}
public class Oops {
    public static void main(String[] args) {
        Student s1 = new Student();
         s1.name="Kajal";
         s1.age=20;
        Student s2 = new Student(s1);
        s2.printInfo();
        
    }
    
}
