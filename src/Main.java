public class Main {
    public static void main(String[] args) {
        BacklogItem item1 = new BacklogItem("1", "Fix Bug", "Resolve the login issue.");
        BacklogItem item2 = new BacklogItem("2", "Add Feature", "Implement dark mode.");

        Backlog backlog = new Backlog();
        backlog.addItem(item1);
        backlog.addItem(item2);

        System.out.println(backlog);
    }
}
