/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ex5_1;

import java.util.EventListener;

/**
 *
 * @author Piyaporn
 */
public interface ScoreListener extends EventListener {
    public void scoreChange(ScoreEvent e);
}
