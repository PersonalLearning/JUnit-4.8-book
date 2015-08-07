public class CalculatorTest {
  private int nbErrors = 0;

  public  void testAdd() {
    Calculator calculator = new Calculator();
    double result = calculator.add(10,50);
    if (result != 60) {
      throw new IllegalStateException("Bad result: " + result);
    }
  }

  public static void main(String[] args) {
    CalculatorTest calculatorTest = new CalculatorTest();
    try {
      calculatorTest.testAdd();
    }
    catch (Throwable e) {
      calculatorTest.nbErrors++;
      e.printStackTrace();
    }
    if (calculatorTest.nbErrors > 0) {
      throw new IllegalStateException("There were " + calculatorTest.nbErrors + " error(s).");
    }
  }
}
