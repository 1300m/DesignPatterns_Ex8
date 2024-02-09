import java.util.ArrayList;
import java.util.List;

public abstract class Source {
    private final List<Observer> list = new ArrayList<>();

    public void add(Observer observer) {
        list.add(observer);
    }

    public void remove(Observer observer) {
        list.remove(list.indexOf(observer));
    }

    public void notifyObserver() {
        for(int i = 0; i < list.size(); i++) {
            list.get(i).update(this);
        }
    }
}
