package vn.tvc.web;

public class CongDan  implements ICapCanCuocCD{
    public CanCanCD cancuoccd;
    private String fullName;

    public CongDan(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return fullName;
    }

    public CanCanCD getCancuoccd() {
        return cancuoccd;
    }

    @Override
    public SoHK getSoHK() {
        System.out.println("Dang tim so HK");
        return new SoHK();
    }

    @Override
    public GiayGTCA getGiayGTCA() {
        System.out.println("Dang xin giay gioi thieu tu cong an");
        return new GiayGTCA();
    }
}
