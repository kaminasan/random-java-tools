/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kam.algorithms;

/**
 *
 * @author teacher
 */
public class TimeConverter {
    
    public static void main(String[] args) {
        TimeConverter converter = new TimeConverter();
        converter.secondsToDaysMinutesandHours(86401);
        
    }
    public String HoursToMinutesAndSeconds(int NumOfHours){
          int minutes = NumOfHours * 60;
          int seconds = minutes * 60;
          return "minutes  " + minutes + " OR seconds " + seconds;
          
          }
    
    
    public void secondsToDaysMinutesandHours(int numOfSeconds){
        int remaining_time, days, hrs, mins, secs;
         days = numOfSeconds / (60 * 60 * 24);
        remaining_time = numOfSeconds % (60 * 60 * 24);
         hrs = remaining_time / (60*60);
        remaining_time %= (60*60);
        mins = remaining_time / 60;
        remaining_time %= 60;
        System.out.println(days + " Days :" + hrs + " Hrs:" + mins + "Mins:" + remaining_time +":seconds" );
        
        
        
    }
}
