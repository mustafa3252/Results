/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 27 04:24:10 GMT 2024
 */


import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Triangle_ESTest extends Triangle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(601, 2, 601);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(601, 778, 960);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(778, 2435, 3);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int int0 = Triangle.classifyTriangle(960, 960, 960);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Triangle triangle0 = new Triangle();
  }
}
