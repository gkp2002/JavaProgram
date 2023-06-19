package OOps;
class StudentsClass{
    String name;
    static String school ;
}

public class staticClass {
    public static void main(String args[]){
          StudentsClass.school="A N Cambrigian Academy";
          StudentsClass st = new StudentsClass();
             st.name="gajanan";
          System.out.println(StudentsClass.school);
    }
    
}
/*
  Static keyword is accessable for all not for a public
  Static is common for a class
  Static variable has been do not change into runtime
  static variabl or function for all same 
  static in java take space in one a time

 */