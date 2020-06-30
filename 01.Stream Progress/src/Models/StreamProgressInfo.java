/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import Interfaces.IStreamable;

/**
 *
 * @author Rishindo
 */
public class StreamProgressInfo{
    private IStreamable file;
    
    public StreamProgressInfo(IStreamable file){
        this.file = file;
    }

    public int CalculateCurrentPercent(){
        return file.getBytesSent() * 100 / file.getLength();
    }
}
