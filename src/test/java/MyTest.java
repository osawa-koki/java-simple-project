import org.example.Math;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class MyTest {
  @Test
  void sampleTest() {
    Assertions.assertEquals(1, 1);
  }

  @Test
  void addTest() {
    int num1 = 1;
    int num2 = 2;
    int expected = 3;
    int actual = Math.add(num1, num2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void subtractTest() {
    int num1 = 1;
    int num2 = 2;
    int expected = -1;
    int actual = Math.subtract(num1, num2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void multiplyTest() {
    int num1 = 2;
    int num2 = 5;
    int expected = 10;
    int actual = Math.multiply(num1, num2);
    Assertions.assertEquals(expected, actual);
  }

  @Test
  void divideTest() {
    int num1 = 7;
    int num2 = 3;
    int expected = 2;
    int actual = Math.divide(num1, num2);
    Assertions.assertEquals(expected, actual);
  }
}
