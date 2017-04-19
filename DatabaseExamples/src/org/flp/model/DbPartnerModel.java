/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.model;

import java.util.ArrayList;
import javax.swing.AbstractListModel;

/**
 *
 * @author tanulo
 */
public class DbPartnerModel extends AbstractListModel<Partner>{
    ArrayList<Partner> pList = new ArrayList();
    
    @Override
    public int getSize() {
        return pList.size();
    }

    @Override
    public Partner getElementAt(int index) {
        return pList.get(index);
    }

    public ArrayList<Partner> getpList() {
        return pList;
    }

    public void setpList(ArrayList<Partner> pList) {
        this.pList = pList;
    }
    
}
