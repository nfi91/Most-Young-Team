/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.cityofaaron.CropData;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jaryger
 */
public class CropControlTest {
    
    public CropControlTest() {
    }

    /**
     * Test of calcLandCost method, of class CropControl.
     * Test Case Buy Land - 1
     */
    
    @Test
  public void testBuyLand() {
        System.out.println("buyLand Test Case 1");
        int landPrice = 10;
        int acresToBuy = 50;
        CropData cropData = new CropData();
        cropData.setAcresOwned(1500);
        cropData.setWheatInStore(700);
        int expResult = 300;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    /**
     * Test of sellLand method, of class CropControl.
     * Test Case Buy Land - 2 **/
   
    
    @Test
 public void testBuyLand2() {
        System.out.println("buyLand Test Case 2");
        int landPrice = 25;
        int acresToBuy = -8;
        CropData cropData = new CropData();
        cropData.setAcresOwned(1500);
        cropData.setWheatInStore(700);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of buyLand method, of class CropControl.
     Test Case Buy Land - 3 **/
    @Test
    public void testBuyLand3() {
        System.out.println("buyLand Test Case 3");
        int landPrice = 50;
        int acresToBuy = 800;
        CropData cropData = new CropData();
        cropData.setAcresOwned(1500);
        cropData.setWheatInStore(700);
        int expResult = -1;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
    /**
     * Test of buyLand method, of class CropControl.
     Test Case Buy Land - 4 **/
    
    
    @Test
    public void testBuyLand4() {
        System.out.println("buyLand Test Case 4 ");
        int landPrice = 30;
        int acresToBuy = 3;
        CropData cropData = new CropData();
        cropData.setAcresOwned(1500);
        cropData.setWheatInStore(200);
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
     /**
     * Test of buyLand method, of class CropControl.
     Test Case Buy Land - 5 **/
    
    
   @Test 
   public void testBuyLand5() {
        System.out.println("buyLand");
        int landPrice = 30;
        int acresToBuy = 0;
        CropData cropData = new CropData();
        cropData.setAcresOwned(1500);
        cropData.setWheatInStore(200);
        int expResult = 0;
        int result = CropControl.buyLand(landPrice, acresToBuy, cropData);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
      
    }  
    
 /**
     * Test of SetOffering method, of class CropControl.
     Test Case SetOffering - 1 **/
   
   @Test
   public void testSetOffering1() {
       
     System.out.print("Offering Test 1");
     int offering_Payment = 5;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 5;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   }
 /**
     * Test of SetOffering method, of class CropControl.
     Test Case SetOffering - 2 **/
     @Test
   public void testSetOffering2() {
       
     System.out.print("Offering Test 2");
     int offering_Payment = 0;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = -1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   }
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 3 **/
   
    @Test
   public void testSetOffering3() {
       
     System.out.print("Offering Test 4");
     int offering_Payment = -5;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = -1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
    
     
   }
   
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 4 **/
   
   @Test
   public void testSetOffering4() {
       
     System.out.print("Offering Test 4");
     int offering_Payment = 1;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 1;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   } 
    
    /**
     * Test of SetOffering method, of class CropControl.
     *  Test Case SetOffering - 5 **/
   
   public void testSetOffering5() {
       
     System.out.print("Offering Test 5");
     int offering_Payment = 99;
     CropData cropData = new CropData();
     cropData.setOffering(offering_Payment);
     int expResult = 99;
     int result = CropControl.setOffering(offering_Payment, cropData);
     assertEquals(expResult, result);
     
     
     
   } 
}


