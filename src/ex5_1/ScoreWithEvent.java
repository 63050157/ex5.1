/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_1;

import java.util.Scanner;

/**
 *
 * @author Piyaporn
 */
public class ScoreWithEvent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ScoreSource source = new ScoreSource();
        Subscriber1 s1 = new Subscriber1();
        Subscriber2 s2 = new Subscriber2();
        
        source.addScoreListener(s1);
        source.addScoreListener(s2);
        
        boolean b = true;
        while(b) {
            System.out.print("Enter Score " );
            String str = sc.nextLine();
            if(str.equals("")) {
                break;
            }
            source.setScoreLine(str);
        }
   }  
}