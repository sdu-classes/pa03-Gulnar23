public class Calculator {
      int number1;
      int number2;

      public Calculator(int number1, int number2) {
          this.number1=number1;
          this.number2=number2;
      }
      public void Add () {
          try {
              System.out.println("Addition is started");
                  if (number1 < 0 || number2 < 0) {
                      throw new ArithmeticException("Two integers not be a negative numbers");
                  } else {
                      System.out.print(number1 + "+" + number2 + " is ");
                  }
                  System.out.println(number1 + number2);
          } catch (Exception e) {
                  //System.out.println(e.getMessage());
                  e.printStackTrace();
              }
              System.out.println("Addition is finished");
          }
    public void Subtract () {
        try {
            System.out.println("Subtract is started");
            if (number1 < 0 || number2 < 0) {
                throw new ArithmeticException("Two integers not be a negative numbers");
            } else {
                System.out.print(number1 + "-" + number2 + " is " );
            }
            System.out.println(number1 - number2);
        } catch(Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Subtraction is finished");
    }
    public void Multiplication() {
        try {
            System.out.println("Multiplication is started");
            if (number1 == 0 || number2 == 0) {
                throw new ArithmeticException("Two integers should not be a zero");
            } else {
                System.out.print(number1 + "*" + number2 + " is " );
            }
            System.out.println(number1 * number2);
        } catch(Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Multiplication is finished");
    }
    public void Division() {
        try {
            System.out.println("Division is started");
            if (number1 == 0 || number2 == 0) {
                throw new ArithmeticException("Two integers should not be a zero");
            } else {
                System.out.print(number1 + "/" + number2 + " is " );
            }
            System.out.println(number1 / number2);
        } catch(Exception e) {
            //System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Division is finished");
     }
 }

