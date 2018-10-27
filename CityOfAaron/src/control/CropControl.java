/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import model.cityofaaron.CropData;
import java.util.Random;
/**
 *
 * @author de marco, german
 */
public class CropControl {
    
//constants
private static final int LAND_BASE = 17;
private static final int LAND_RANGE = 10;
  
// random number generator
private static Random random = new Random();

    
    /**
     * calcLandCost method
     * Purpose: To calculate a random land cost between 30 and 50 bushels/acre
     * Par: None
     * @return 
     */
    public static int calcLandCost(){
    
int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
return landPrice;
    }
    
    /**
     * The sellLand method
     * Purpose: To sell land
     * @param landPrice
     * @param acresToSell
     * @param cropData
     * @return the number of acres
     * Pre-Conditions: acres to sell must be positive
     * and <= acresOwned
     */
   public static int sellLand(int landPrice, int acresToSell, CropData cropData)
   {
       //if  acresToSell < 0, return -1
        if (acresToSell <0)
            return -1;
       //if acresToSell > acresOwned, return -1
       int acresOwned = cropData.getAcresOwned();
       if (acresToSell > acresOwned)
           return -1;
       // acresOwned = acresOwned - acresToSell
       acresOwned -= acresToSell;
       cropData.setAcresOwned(acresOwned);
       //whetInStore = wheatInStore + acresToSell * 
       int wheatInStore = cropData.getWheatInStore();
       wheatInStore += (acresToSell - landPrice);
       cropData.setWheatInStore(wheatInStore);
       //return acresOwned
       return acresOwned;
       
       
   }
   
  /**
   * The BuyLand method
   * Purpose Buy land
   * @param landPrice
   * @param acresToBuy
   * @param cropData
   * @return the acres owned.
   * * Precondition: acres to buy must be positive
   * and <= acresOwned
   */
   
  
 public static int buyLand(int landPrice, int acresToBuy, CropData cropData, int wheatAfterBuyAcres)
    {
     
// if acresTobuy < 0, return 1
     if (acresToBuy < 0)
         return -1;
     //
int wheatInStore = cropData.getWheatInStore();     
if (wheatInStore < landPrice)
         return 1;
//acresOwned = acresOwned + acresToBuy
int acresOwned = cropData.getAcresOwned();     
    
    acresOwned += acresToBuy;
    cropData.setAcresOwned(acresToBuy);
     
//wheatAfterBuyAcress = wheatInStore – (acresOwned + acresToBuy)
wheatAfterBuyAcres = wheatInStore – (acresOwned + acresToBuy)
cropData.setWheatInStore(wheatInStore);
    //return acresOwned
    return acresOwned;
    }
   
}

