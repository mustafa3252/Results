/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:27:06 GMT 2024
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
      Integer[] integerArray0 = new Integer[2];
      Integer integer0 = new Integer(2);
      // Undeclared exception!
      try { 
        SortHeap.sort(integerArray0, integer0);
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
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer(281);
      Integer integer1 = new Integer(7);
      integerArray0[1] = integer1;
      integerArray0[2] = integer1;
      integerArray0[5] = integer0;
      integerArray0[6] = integer1;
      // Undeclared exception!
      try { 
        SortHeap.sort(integerArray0, integerArray0[1]);
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
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer(281);
      integerArray0[0] = integer0;
      int int0 = 7;
      integerArray0[1] = integer0;
      integerArray0[2] = integerArray0[0];
      integerArray0[3] = integerArray0[0];
      integerArray0[4] = integer0;
      Integer integer1 = new Integer(int0);
      integerArray0[5] = integer1;
      integerArray0[6] = integer1;
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer1);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}
