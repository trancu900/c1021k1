package vn.tvc.web;

public class NhaNuoc {

    public static void main(String[] args) {
        NhaNuoc nhaNuoc = new NhaNuoc();
        ObjectNew cd1 = new ObjectNew("Le Thi Dan");
        nhaNuoc.capCanCuocCD(cd1);

    }

    public void capCanCuocCD(ICapCanCuocCD capCanCuocCD) {
        if (capCanCuocCD.getSoHK() == null)
            throw new RuntimeException("Khong co SHK");
        if (capCanCuocCD.getGiayGTCA() == null)
            throw new RuntimeException("Khong co SHK");
        System.out.println("Kiem tra xac minh giay to");
        System.out.println("Xu ly cap CCCD");
        CanCanCD canCanCD= new CanCanCD("Giau");

        capCanCuocCD.canCuocCDHoanThanh(canCanCD);
    }
}
