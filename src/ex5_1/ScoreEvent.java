/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_1;

import java.util.EventObject;

/**
 *
 * @author Piyaporn
 */
public class ScoreEvent extends EventObject {
     private String someData;
    
    public ScoreEvent(Object o, String str) {
        super(o);
        someData = str;
    }
    
     public String getSomeData() {
        return someData;
    }
    
}