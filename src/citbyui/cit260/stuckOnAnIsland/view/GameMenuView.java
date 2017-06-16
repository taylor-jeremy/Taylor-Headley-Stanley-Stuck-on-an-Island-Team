/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.stuckOnAnIsland.view;

import java.util.Scanner;

/**
 *
 * @author taylo
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                  + "\n-----------------------------------------"
                  + "\n| Game Menu                             |"
                  + "\n-----------------------------------------"
                  + "\nW - Calculate your Water Storage Capacity?"
                  + "\nH - Check your Health?"
                  + "\nQ - Quit"
                  + "\n-----------------------------------------");
    }

    @Override
    public boolean doAction(String value) {
        value = value.toUpperCase(); // convert choice to upper case
        
        switch (value) {
            case "W": // Goal of Game
                this.calcWaterStorage();
                break;
            case "H": // Fast Travel
                this.calcHealth();
                break;
            default:
                System.out.println("\n*** Invalid selection *** Try again");
                break;
        }
        
        return false;
    }

    
     //void displayMenu() {
       // WaterStorageView waterStorageView = new WaterStorageView();
       // waterStorageView.displayWaterStorageView();
    //}
    
    private void calcWaterStorage() {
        WaterStorageView waterStorageView = new WaterStorageView();
        waterStorageView.displayWaterStorageView();
    }

    private void calcHealth() {
        CheckHealthView checkHealthView = new CheckHealthView();
        checkHealthView.displayCheckHealthView();
    }
    
}