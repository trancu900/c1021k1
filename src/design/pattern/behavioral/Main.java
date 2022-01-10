package design.pattern.behavioral;

public class Main {
    public static void main(String[] args) {
        CongDan congDan1 = new CongDan("Giau");
        CongDan congDan2 = new CongDan("Duong");
        NhaNuocPublisher nhaNuocPublisher = new NhaNuocPublisher();

        nhaNuocPublisher.register(congDan1);
        nhaNuocPublisher.register(congDan2);

        nhaNuocPublisher.thongbaomoi("");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nhaNuocPublisher.unregister(congDan2);
        nhaNuocPublisher.thongbaomoi("");
    }


}
