package vn.tvc.web;

public class NhaNuoc {

    public static void main(String[] args) {
        NhaNuoc nhaNuoc = new NhaNuoc();
        CongDan cd1 = new CongDan("Le Thi Dan");
      cd1.cancuoccd=  nhaNuoc.capCanCuocCD(cd1);
    }

    public CanCanCD capCanCuocCD(ICapCanCuocCD capCanCuocCD) {
        if (capCanCuocCD.getSoHK() == null)
            throw new RuntimeException("Khong co SHK");
        if (capCanCuocCD.getGiayGTCA() == null)
            throw new RuntimeException("Khong co SHK");
        System.out.println("Kiem tra xac minh giay to");
        System.out.println("Xu ly cap CCCD");
        return new CanCanCD();
    }
}
