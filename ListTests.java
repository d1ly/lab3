import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;


public class ListTests {
	@Test 
	public void testFilter() {
    StringCheck sc = new StringCheck();
    List<String> testList = new ArrayList<>();
    testList.add("1234");
    testList.add("this is a string!");
    testList.add("stringlol");
    assertEquals("1234, this is a string, stringlol", ListExamples.filter(testList, sc));
  }
}
