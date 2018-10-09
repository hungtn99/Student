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
public class CamCaoPhong extends QuaCam{
    protected double giaBan, soLuong;
    public CamCaoPhong(String nguonGoc, String ngayNhap, double giaBan, double soLuong){
        super(nguonGoc, ngayNhap);
        setGiaBan(giaBan);
        setSoLuong(soLuong);
    }
    public double getGiaBan(){
        return giaBan;
    }
    public void setGiaBan(double giaBan){
        this.giaBan = giaBan;
    }
    public double getSoLuong(){
        return soLuong;
    }
    public void setSoLuong(double soLuong){
        this.soLuong = soLuong;
    }
    public double thanhTien() {
	return giaBan * soLuong;
    }
    public static void main(String[] args) {
	CamCaoPhong ccp = new CamCaoPhong("Ha Giang", "09/10/2018", 25000, 1000);
	System.out.print(ccp.thanhTien());
    }
    
}
