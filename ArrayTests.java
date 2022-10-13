import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testReverseInPlaceArray() {
    int[] input1 = {4, 5, 6, 7};
    int[] expected = {7, 6, 5, 4};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(expected, input1);
  }

  @Test
  public void testReversedArray(){
    int[] input1 = {5, 7, 8, 0};
    int[] expected = {0, 8, 7, 5};
    assertArrayEquals(expected, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = {5.0, 7.0, 1.0, 12.0, 8.0};
    double outcome = ArrayExamples.averageWithoutLowest(input1);
    assertEquals(8.0, outcome, 0); 
  }
}
