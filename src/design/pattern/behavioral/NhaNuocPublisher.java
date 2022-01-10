package design.pattern.behavioral;


import java.util.ArrayList;
import java.util.List;

public class NhaNuocPublisher implements Subject<ThongBaoMoiObserver> {
    List<ThongBaoMoiObserver> ThongBaoMoiObserverList = new ArrayList<>();

    public void register(ThongBaoMoiObserver observer) {
        ThongBaoMoiObserverList.add(observer);
    }

    public void unregister(ThongBaoMoiObserver observer) {
        ThongBaoMoiObserverList.remove(observer);
    }

    public void notifyALL() {
        for (ThongBaoMoiObserver observer : ThongBaoMoiObserverList) {
            observer.thongbaoUpdate();
        }
    }

    public void thongbaomoi(String tintuc) {
        System.out.println("Thong Bao Moi:");
        notifyALL();
    }

}
