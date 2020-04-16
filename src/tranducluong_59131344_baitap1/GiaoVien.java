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
public class GiaoVien extends CaNhan
{
    private final String MonDay;
    private final String ToBoMon;
    
    public GiaoVien(String MonDay, String ToBoMon, String HoTen, int Tuoi, String DiaChi, String Sdt)
    {
        super(HoTen, Tuoi, DiaChi, Sdt);
        this.MonDay = MonDay;
        this.ToBoMon = ToBoMon;
    }
    
    @Override
    public String HienThiTT()
    {
        return super.HienThiTT() +
                "\nMôn dạy: " + MonDay +
                "\nTổ bộ môn:" + ToBoMon;
    }
}
