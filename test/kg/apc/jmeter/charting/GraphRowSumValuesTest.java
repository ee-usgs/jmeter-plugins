/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kg.apc.jmeter.charting;

import java.util.Iterator;
import java.util.Map.Entry;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author apc
 */
public class GraphRowSumValuesTest
{
   /**
    *
    */
   public GraphRowSumValuesTest()
   {
   }

   /**
    *
    * @throws Exception
    */
   @BeforeClass
   public static void setUpClass() throws Exception
   {
   }

   /**
    *
    * @throws Exception
    */
   @AfterClass
   public static void tearDownClass() throws Exception
   {
   }

   /**
    *
    */
   @Before
   public void setUp()
   {
   }

   /**
    *
    */
   @After
   public void tearDown()
   {
   }

   /**
    *
    */
   @Test
   public void testAdd()
   {
      System.out.println("add");
      long xVal = 0L;
      GraphRowSumValues instance = new GraphRowSumValues();
      instance.add(xVal, 1);
      instance.add(xVal, 2);
      instance.add(xVal, 3);
   }

   /**
    *
    */
   @Test
   public void testIterator()
   {
      System.out.println("iterator");
      System.out.println("iterator");
      GraphRowSumValues instance = new GraphRowSumValues();
      instance.add(1, 1);
      instance.add(1, 2);
      instance.add(1, 3);
      Iterator<Entry<Long, AbstractGraphPanelChartElement>> result = instance.iterator();
      assertEquals(6, ((AbstractGraphPanelChartElement) result.next().getValue()).getValue(), 0.001);
   }

   /**
    *
    */
   @Test
   public void testSetMaxY()
   {
      System.out.println("setMaxY");
      double val = 10.10;
      GraphRowSumValues instance = new GraphRowSumValues();
      instance.setMaxY(val);
   }

   /**
    * 
    */
   @Test
   public void testHasNext()
   {
      System.out.println("hasNext");
      GraphRowSumValues instance = new GraphRowSumValues();
      Iterator it = instance.iterator();
      boolean expResult = false;
      boolean result = it.hasNext();
      assertEquals(expResult, result);
   }

   /**
    *
    */
   @Test
   public void testNext()
   {
      System.out.println("next");
      GraphRowSumValues instance = new GraphRowSumValues();
      instance.add(1, 1);
      Iterator<Entry<Long, AbstractGraphPanelChartElement>> it = instance.iterator();
      Entry result = it.next();
      assertNotNull(result);
   }

   /**
    *
    */
   @Test
   public void testRemove()
   {
      System.out.println("remove");
      GraphRowSumValues instance = new GraphRowSumValues();
      try
      {
         instance.remove();
         fail("Exception expected");
      }
      catch (UnsupportedOperationException e)
      {
      }
   }
}