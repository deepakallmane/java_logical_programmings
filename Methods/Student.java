class Student_Example {
  int sno = 100, s1 = 32, s2 = 87, s3 = 55, sum;
  String sname = "deepu";
  float avg;

  void sum() {
    sum = (s1 + s2 + s3);
  }

  void average() {
    avg = (float) (sum) / 3;
  }

}

  void display() {
    System.out.println("the student number is" + sno);
    System.out.println("the student name is" + sname);
    System.out.println("The total marks " + sum);
    System.out.println("the average of 3 subject marks is " + avg);
  }

class Student
{
    public static void main(String args[])
    {
      Student_Example m1=new Student_Example();
      m1.sum();
      m1.average();
      m1.display(); 
    }
}