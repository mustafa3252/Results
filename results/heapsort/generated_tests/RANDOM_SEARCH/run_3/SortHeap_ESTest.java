/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:20:20 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SortHeap_ESTest extends SortHeap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer[] integerArray0 = new Integer[7];
      Integer integer0 = new Integer((-1));
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      integerArray0[2] = integerArray0[1];
      integerArray0[3] = integerArray0[0];
      Integer integer1 = new Integer((-2525));
      integerArray0[4] = integer1;
      Integer integer2 = new Integer(5);
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer2);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer[] integerArray0 = new Integer[3];
      Integer integer0 = new Integer(561);
      integerArray0[0] = integer0;
      Integer integer1 = new Integer((-1));
      integerArray0[1] = integer1;
      Integer integer2 = new Integer(2);
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer2);
      Integer[] integerArray2 = SortHeap.sort(integerArray1, integer2);
      assertSame(integerArray0, integerArray2);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}