package design.pattern.behavioral;

public class CongDan implements ThongBaoMoiObserver {
    private String name;

    public CongDan(String name) {
        this.name = name;
    }

    @Override
    public void thongbaoUpdate() {
        System.out.println("Cong Dan " + name + " Da Nhan duoc tin thong bao");
    }
}
