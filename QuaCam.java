/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab05;

/**
 *
 * @author CCNE
 */
public class QuaCam extends HoaQua{
    
    protected String color;
    public QuaCam(String nguonGoc, String color) {
        super(nguonGoc);
        setColor(color);
    }
   
    
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
}
