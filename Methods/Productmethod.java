class Method_example
  {
    int pno=101,pquant=2,pcost=20;
    String pname="harika";
    float bill;
  
    void tbill()
    {
      bill = (float)(pcost)*pquant;
      
    }
    void display()
    {
      System.out.println("the product details");
      System.out.println("the product number is"+pno);
      System.out.println("the product name is"+pname);
      System.out.println("The product cost "+pcost);
      System.out.println("the  product quantity "+pquant);
      System.out.println("the bill = "+bill);
    }
     }
public class Productmethod
  {
   public static void main(String args[])
    {
      Method_example m1=new Method_example();
      m1.tbill();
      m1.display();
    }