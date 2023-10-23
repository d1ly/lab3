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
	public void testReverseInPlace2() {
    int[] input1 = { 1234, 2342, 150 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 150, 2342, 1234 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

    @Test
  public void testReversed2() {
    int[] input1 = {1, 2, 3, 4 };
    assertArrayEquals(new int[]{4, 3, 2, 1 }, ArrayExamples.reversed(input1));
  }
/* 
      @Test
  public void testAverage() {
    double[] input1 = {5,5,5,10,15};
    assertEquals(10.0, ArrayExamples.averageWithoutLowest(input1), 0.00001);
  }
  */
}
