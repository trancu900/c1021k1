package vn.tvc.web;

public class ObjectNew implements ICapCanCuocCD, Runnable {
    public CanCanCD cancuoccd;
    private String fullName;

    public ObjectNew(String fullName) {
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

    @Override
    public void canCuocCDHoanThanh(CanCanCD canCanCD) {
        System.out.println("Cong dan da nhan can cuoc CD");
    }

    @Override
    public void run() {
        System.out.println("Cong dan dang chay");
    }
}
