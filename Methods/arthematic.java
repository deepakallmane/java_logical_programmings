class arthematic1 {
  int a = 40, b = 80;
  int c;

  void add() {
    c = a + b;
    System.out.println("the addition value is:" + c);
  }

  void sub() {
    c = b - a;
    System.out.println("the subtraction value is:" + c);
  }

  void mul() {
    c = a * b;
    System.out.println("the multiplication value is:" + c);
  }

  void div() {
    c = b / a;
    System.out.println("the division value is:" + c);
  }
}

class arthematic {
  public static void main(String args[]) {
    arthematic1 a1 = new arthematic1();
    a1.add();
    a1.sub();
    a1.mul();
    a1.div();
  }
}