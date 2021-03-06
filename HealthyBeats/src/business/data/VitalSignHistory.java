/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business.data;

import business.HelperMethods;
import java.util.ArrayList;

/**
 *
 * @author JAHNVI
 */
public class VitalSignHistory {
    private ArrayList<VitalSign> vitalSignHistory;

    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<>();
    }
    
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSign addVitalSign() {
        VitalSign vs = new VitalSign();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public ArrayList<VitalSign> getVitalSignsForDate(String date) {
        ArrayList<VitalSign> vitalSigns = new ArrayList<>();
        
        for (VitalSign vs : vitalSignHistory) {
            if (HelperMethods.getDateFromStamp(vs.getTimestamp()).equals(date)) {
                vitalSigns.add(vs);
            }
        }
        
        return vitalSigns;
    }
}
