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
public class MyListModel extends AbstractListModel<String>{
    
    private ArrayList<String> list = new ArrayList();

    public MyListModel() {
        list.add("Első elem");
        list.add("Második elem");
        list.add("Harmadik elem");
    }
    
    
    @Override
    public int getSize() {
        System.out.println("size "+list.size());
        return list.size();
    }

    @Override
    public String getElementAt(int index) {
        System.out.println("get element "+list.get(index));
        return list.get(index);
    }

    public void addElement(String s){
        list.add(s);
        this.fireIntervalAdded(list, 0, list.size());
    }
    
    public void removeElement(int index){
        list.remove(index);
        this.fireIntervalRemoved(list, 0, list.size());
    }
    
}
