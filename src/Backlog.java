import java.util.ArrayList;
import java.util.List;

public class Backlog {
    private List<BacklogItem> items;

    public Backlog() {
        this.items = new ArrayList<>();
    }

    public void addItem(BacklogItem item) {
        items.add(item);
    }

    public List<BacklogItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Backlog{" + "items=" + items + '}';
    }
}
