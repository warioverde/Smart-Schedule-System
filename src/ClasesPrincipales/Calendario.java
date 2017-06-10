/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPrincipales;

import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Jorge
 */
public class Calendario extends GregorianCalendar {
    
    
    
    public Calendario(){
        
    }
    
    public int getDay(){
        String diaS = Integer.toString(get(Calendar.DATE));
        return Integer.parseInt(diaS);
    }
    public int getMonth(){
        String mesS = Integer.toString(get(Calendar.MONTH));
        return Integer.parseInt(mesS)+1;
    }
    public int getYear(){
        String añoS = Integer.toString(get(Calendar.YEAR));
        return Integer.parseInt(añoS);
    }
    
}
