/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:21:51 GMT 2024
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
      Integer[] integerArray0 = new Integer[8];
      Integer integer0 = new Integer(5);
      integerArray0[0] = integer0;
      Integer integer1 = new Integer((-2157));
      integerArray0[1] = integer1;
      integerArray0[2] = integerArray0[1];
      integerArray0[3] = integerArray0[2];
      integerArray0[4] = integerArray0[0];
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integerArray0[4]);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer[] integerArray0 = new Integer[5];
      Integer integer0 = new Integer(2);
      integerArray0[0] = integer0;
      // Undeclared exception!
      try { 
        SortHeap.sort(integerArray0, integerArray0[0]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("SortHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}
