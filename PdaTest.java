import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class PdaTest {


 Pda pda;
  @Before

  public void before() { 
      
      pda = new Pda();

  }

  @Test
  public void testFunctionOne(){
    assertEquals(true, pda.func1(1));
    assertEquals(false, pda.func1(2));
  }

  @Test
  public void testMaxGreaterFunction(){
    assertEquals(6, pda.max(6, 3));
  }

  @Test
  public void testLooper(){
    assertEquals(11, pda.looper());
  }


}