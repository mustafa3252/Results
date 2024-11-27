/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:27:37 GMT 2024
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
      Integer integer0 = new Integer(5);
      Integer integer1 = new Integer(3);
      Integer[] integerArray0 = new Integer[8];
      integerArray0[0] = integer0;
      integerArray0[1] = integer0;
      integerArray0[2] = integer1;
      integerArray0[3] = integer1;
      integerArray0[4] = integer1;
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integerArray0[0]);
      assertSame(integerArray1, integerArray0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer(2500);
      Integer integer1 = new Integer(2);
      Integer[] integerArray0 = new Integer[5];
      integerArray0[0] = integer1;
      integerArray0[1] = integer0;
      Integer[] integerArray1 = SortHeap.sort(integerArray0, integer1);
      assertSame(integerArray0, integerArray1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SortHeap sortHeap0 = new SortHeap();
  }
}
