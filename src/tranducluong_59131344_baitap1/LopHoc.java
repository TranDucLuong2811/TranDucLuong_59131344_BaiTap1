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
public class LopHoc 
{
    private final QLDS dshs;
    private final QLDS dsgvgd;
    private final GiaoVien gvcn;
    
    public LopHoc(GiaoVien gvcn)
    {
        this.gvcn = gvcn;
        dshs = new QLDS();
        dsgvgd = new QLDS();
    }
    
    public void ThemHocSinh (HocSinh hs)
    {
        dshs.them(hs);
    }
    
    public void ThemGVGD (GiaoVien gv)
    {
        dsgvgd.them(gv);
    }
    
    public void InDSHS ()
    {
        dshs.inDS();
    }
    
    public void InDSGVGD ()
    {
        dsgvgd.inDS();
    }
}
