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
public class HoaQua {
    protected String nguonGoc;
    public HoaQua(String nguonGoc){
        setNguonGoc(nguonGoc);  
    }
    public String getNguonGoc() {
	return nguonGoc;
	}
    public void setNguonGoc(String nguonGoc) {
	this.nguonGoc = nguonGoc;
	}
    protected String ngayNhap;
    
    
}
