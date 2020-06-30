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
public class File implements IStreamable {
    private String name;
    private int Length;
    private int BytesSent;

    public File(String name, int length, int bytesSent){
        this.name = name;
        Length = length;
        BytesSent = bytesSent;
    }
    
    public void setLenght(int length) {
        Length = length;
    }
    
    public void setBytesSent(int bytesSent){
        BytesSent = bytesSent;
    }
    
    @Override
    public int getLength() {
        return Length;
    }

    @Override
    public int getBytesSent() {
        return BytesSent;
    } 
}
