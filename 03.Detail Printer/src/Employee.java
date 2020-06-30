/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rishindo
 */
public class Employee {
    private String Name;
    
    public Employee(String name){
        this.Name = name;
    }

    public String getName(){
        return this.Name;
    }
    
    public void setName(String name){
        this.Name = name;
    }

    public String ToString(){
        return this.Name;
    }   
}
