package OOps;
class Shape{
    public void area(){
     System.out.println("Display area");
    }
}
class Triangle extends Shape{
    public void area(int l ,int b){
        System.out.println("Display area of triangle: "+ l*b);
    }
}
class Equlatrial extends Triangle{
    public void area(int l ,int b){
        System.out.println("Display area of triangle: "+1/2*l*b);
    }
}
 class Circle extends Shape{
    public void area(int r){
        System.out.println("Display area of circle: "+ 3.14*r*r);
    }
 }
public class InheritanceSingle {
    public static void main(String[] args) {
          Triangle tr = new Triangle();
          tr.area();
          tr.area(3,4);

        Circle cr = new Circle();
        cr.area();
        cr.area(10);
    }
     
      
    
}
//type of inheritanace in Java
/*
 1.single inheritance
 2.multi Leve inheritance
 3.hierarchy inheritance


 */
//Access Modifier
/*
 1.Default
 2.Public
 3.Private
 4.Protected
 */