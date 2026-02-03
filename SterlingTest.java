import org.junit.Test;

import static org.junit.Assert.*;
public class SterlingTest {
  @Test
    public  void testMultiply(){
      Sterling value = new Sterling(5);
      value.multiplyBy(2);
      assertEquals(5+2, value.getValue());

}}




