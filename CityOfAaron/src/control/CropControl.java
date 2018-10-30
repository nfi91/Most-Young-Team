/**
*The CropControl class - part of the control layer
* class contains all of the calculation methods for managing the crops
* Author: German De Marco
* Date last modified: October 2018
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
    private static int wheatInStore;

    /**
     * calcLandCost method Purpose: To calculate a random land cost between 30
     * and 50 bushels/acre Par: None
     *
     * @return
     */
    public static int calcLandCost() {

        int landPrice = random.nextInt(LAND_RANGE) + LAND_BASE;
        return landPrice;
    }

    /**
     * The sellLand method Purpose: To sell land
     *
     * @param landPrice
     * @param acresToSell
     * @param cropData
     * @return the number of acres Pre-Conditions: acres to sell must be
     * positive and <= acresOwned
     */
    public static int sellLand(int landPrice, int acresToSell, CropData cropData) {
        //if  acresToSell < 0, return -1
        if (acresToSell < 0) {
            return -1;
        }
        //if acresToSell > acresOwned, return -1
        int acresOwned = cropData.getAcresOwned();
        if (acresToSell > acresOwned) {
            return -1;
        }
        // acresOwned = acresOwned - acresToSell
        acresOwned -= acresToSell;
        cropData.setAcresOwned(acresOwned);
        //whetInStore = wheatInStore + acresToSell * 
        int wheatInStore = cropData.getWheatInStore();
        wheatInStore += (acresToSell * landPrice);
        cropData.setWheatInStore(wheatInStore);
        //return acresOwned
        return acresOwned;

    }

    /**
     * The BuyLand method Purpose: Show the final amount of land
     *
     * @param landPrice
     * @param acresToBuy
     * @param cropData
     * @return the number of acres after the operations Pre-Conditions: acres to
     * sell must be <= acresOwned
     */
    public static int buyLand(int landPrice, int acresToBuy, CropData cropData) {

// if acresTobuy < 0, return -1
        if (acresToBuy < 0) {
            return -1;
        }

//if wheatInStore < acresToBuy * landPrice, return -1
        int wheatAmount = cropData.getWheatInStore();
        if (wheatAmount < acresToBuy * landPrice) {
            return -1;
        }

//acresOwned = acresOwned + acresToBuy
        int acresOwned = cropData.getAcresOwned();

        acresOwned = acresOwned + acresToBuy;
        cropData.setAcresOwned(acresOwned);

//wheatAfterBuyAcres = wheatInStore – (acresOwned + acresToBuy)
        wheatAmount = (acresOwned + acresToBuy * landPrice);
        cropData.setWheatInStore(wheatAmount);
        return wheatAmount;

    }

    /**
     * SetOffering Method Purpose: Show valid values for offerings.
     *
     * @param offering_Payment
     * @param cropdata
     * @return
     */
    public static int setOffering(int offering_Payment, CropData cropData) {

        //if offering < 1 %, Return -1 
        if (offering_Payment < 1) {

            return -1;
        }

        //if offering > 99 % Return – 1
        if (offering_Payment > 99) {
            return -1;
        }

        cropData.setOffering(offering_Payment);
        return offering_Payment;

    }
    /**
     *  @author nefi verduga
     * 
     * The acresPlanted method : Purpose: To plant a crop.
     * 
     * @param acres you have
     * @param number of acres to plant
     * @param required number of wheat necessary to plant
     * @return the number of wheat remaining after planting
	Pre-conditions: acres needed and wheat must be positive

     */
    public static int acresPlanted(int acresOwned, int acresToPlant, CropData cropData) {
        //if acresToPlant < 1, return 1
        if (acresToPlant < 1) {
            return 1;
        }
        
        //if acresOwned < 1, return 1
        if (acresOwned < 1) {
            return 1;
        }
        
        //if acresOwned < acresToPlant, return 1
        if (acresOwned < acresToPlant) {
            return 1;
        }
        
       // acresPlanted = acresOwned - acresToPlant
       int acresPlanted ;
        acresPlanted = cropData.getacresPlanted;
        
        //wheatInstoreAfterPlanted = wheatInStore - (acresPlanted*(1/2)
        wheatInstoreAfterPlanted = wheatInStore - acresPlanted*(1/2) ;
        cropData.setacresPlanted (acresPlanted);
       
                return wheatInStore;
    }

}


}
