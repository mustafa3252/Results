/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:28:05 GMT 2024
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
      Integer[] integerArray0 = new Integer[9];
      Integer integer0 = new Integer((-806));
      Integer integer1 = new Integer(427);
      integerArray0[3] = integer1;
      integerArray0[4] = integer0;
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
      Integer integer0 = new Integer(466);
      Integer[] integerArray0 = new Integer[7];
      integerArray0[5] = integer0;
      // Undeclared exception!
      try { 
        SortHeap.sort(integerArray0, integerArray0[5]);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 232 out of bounds for length 7
         //
         verifyException("SortHeap", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer[] integerArray0 = new Integer[9];
      Integer integer0 = new Integer((-806));
      integerArray0[0] = integer0;
      Integer integer1 = new Integer(427);
      integerArray0[1] = integer1;
      integerArray0[2] = integerArray0[1];
      integerArray0[3] = integer0;
      integerArray0[4] = integer1;
      Integer integer2 = new Integer(5);
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer2);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(466);
      Integer[] integerArray0 = new Integer[7];
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
      integerArray0[2] = integerArray0[0];
      integerArray0[3] = integer0;
      integerArray0[4] = integer0;
      integerArray0[5] = integer0;
      integerArray0[6] = integer0;
      Integer integer1 = new Integer(7);
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer1);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}