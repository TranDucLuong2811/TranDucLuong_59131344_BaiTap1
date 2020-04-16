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
public class Baitap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       HocSinh hs1 = new HocSinh("Lopmamnon", "Choi", "Trần Thứ Một", 3, "Ngọc Hiệp", "0453435335");
       HocSinh hs2 = new HocSinh("Lopmaugiao", "Quậy", "Trần Thứ Hai", 5, "Vĩnh Ngọc", "3465451341");
       HocSinh hs3 = new HocSinh("Lopnhatre", "Ngoan", "Trần Thứ Ba", 4, "Vạn Thạnh", "5632313135");
       
       GiaoVien gvcn = new GiaoVien("Toán", "T", "Vương Sơn Lâm", 30, "Hùng Vương", "1332535234");
       GiaoVien gv1 = new GiaoVien("Văn", "V", "Huỳnh Trí Tiến", 35, "Bến Xe Phía Bắc", "=345464534534");
       GiaoVien gv2 = new GiaoVien("Anh", "A", "Đặng Ngọc Long", 40, "Bến xe Phía Nam", "599853363");
       
       LopHoc lh = new LopHoc(gvcn);
       lh.ThemHocSinh(hs1);
       lh.ThemHocSinh(hs2);
       lh.ThemHocSinh(hs3);
       
       lh.ThemGVGD(gv1);
       lh.ThemGVGD(gv2);
       
       lh.InDSHS();
       lh.InDSGVGD();
    }
    
}
