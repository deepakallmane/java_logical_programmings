class Method_example {
  int cno = 101, pmr = 26, lmr = 17, tunits;
  String cname = "deepu";
  float bill;

  void units() {
    tunits = pmr - lmr;

  }

  void tbill() {
    bill = (float) (3.80) * tunits;

  }

  void display() {
    System.out.println("the consumer number is" + cno);
    System.out.println("the consumer name is" + cname);
    System.out.println("The total units " + tunits);
    System.out.println("the  total current bill " + bill);
  }

}

class Bill {
  public static void main(String args[]) {
    Method_example m1 = new Method_example();
    m1.units();
    m1.tbill();
    m1.display();
  }
}