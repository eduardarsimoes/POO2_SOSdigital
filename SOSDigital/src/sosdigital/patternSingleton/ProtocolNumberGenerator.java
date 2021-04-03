/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sosdigital.patternSingleton;

import sosdigital.patternSingleton.Arquivo;

public class ProtocolNumberGenerator {
    private static ProtocolNumberGenerator instance;
    
    public synchronized static ProtocolNumberGenerator getInstance(){
        if (instance == null){
            instance = new ProtocolNumberGenerator();
        }
        return instance;
    }
    
    private int count;
    
    private ProtocolNumberGenerator(){
        String sCount = Arquivo.Read("protocolo.txt");
        count = Integer.parseInt(sCount);
    }
    
    public synchronized int getNextNumber(){
        ++count;
        String sCount = Integer.toString(count);
        Arquivo.Write("protocolo.txt",sCount);
        return count;
    }
}
