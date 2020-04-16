/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranducluong_59131344_baitap1;

/**
 *
 * @author DELL
 */
public abstract class CaNhan 
{
    private final String HoTen;
    private final int Tuoi;
    private final String DiaChi;
    private final String Sdt;
    
    public String getHoTen()
    {
        return HoTen;
    }
    
    public int getTuoi()
    {
        return Tuoi;
    }
    
    public String getDiaChi()
    {
        return DiaChi;
    }
    
    public String getSdt()
    {
        return Sdt;
    }
    
    public CaNhan(String HoTen, int Tuoi, String DiaChi, String Sdt)
    {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
    }
    
    public String HienThiTT()
    {
        return "Họ tên: " + HoTen +
                "\nTuổi: " + Tuoi +
                "\nĐịa chỉ: " + DiaChi +
                "\nSĐT: " + Sdt;
    }
}
