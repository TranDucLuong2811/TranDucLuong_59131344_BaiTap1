/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tranducluong_59131344_baitap1;

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan
{
    private final String Lop;
    private final String NangKhieu;
    
    public HocSinh(String Lop, String NangKhieu, String HoTen, int Tuoi, String DiaChi, String Sdt)
    {
        super(HoTen, Tuoi, DiaChi, Sdt);
        this.Lop = Lop;
        this.NangKhieu = NangKhieu;
    }
    
    @Override
    public String HienThiTT()
    {
        return super.HienThiTT() +
                "\nLớp: " + Lop +
                "\nNăng khiếu: " + NangKhieu;
    }
}
