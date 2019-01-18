/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaderadio;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author maria
 */
public class RadioTest {
    
   @Test
   public void testGetFrequency(){
       myRadio r = new myRadio();
       boolean result=r.getFrequency();
       assertEquals(false,result);
   }
   
   @Test
   public void testgetState(){
       myRadio r=new myRadio();
       boolean result=r.getState();
       assertEquals(false,result);
   }

    @Test
    public void testgetStation(){
        myRadio r=new myRadio();
        double result=r.getStation();
        assertEquals(87.9,result,88);
    }
   
}
