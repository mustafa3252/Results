/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:24:28 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SortHeap_ESTest extends SortHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer[] integerArray0 = new Integer[6];
      Integer integer0 = new Integer(367);
      integerArray0[1] = integer0;
      Integer integer1 = new Integer(1);
      integerArray0[2] = integer1;
      integerArray0[3] = integerArray0[1];
      integerArray0[4] = integerArray0[3];
      Integer integer2 = new Integer(5);
      // Undeclared exception!
      try { 
        SortHeap.sort(integerArray0, integer2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("SortHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = Integer.valueOf(4);
      Integer[] integerArray0 = new Integer[6];
      Integer integer1 = new Integer(0);
      integerArray0[0] = integer1;
      integerArray0[1] = integer0;
      integerArray0[2] = integer0;
      integerArray0[3] = integer0;
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer0);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = 4;
      Integer integer0 = Integer.valueOf(4);
      Integer[] integerArray0 = new Integer[13];
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      integerArray0[2] = integer0;
      integerArray0[3] = (Integer) int0;
      Integer[] integerArray1 = SortHeap.sort(integerArray0, (Integer) int0);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}
