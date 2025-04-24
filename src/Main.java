public class Main {
    public static void main(String[] args) {
        // Create instances
        Product product = new Product("P1", "Project Management Tool");
        Release release = new Release("R1", "v1.0", "Initial Version");
        Sprint sprint = new Sprint("S1", "Sprint 1", "2025-04-01", "2025-04-15");

        // Create backlog items with associations
        BacklogItem item1 = new BacklogItem("1", "Fix Bug", "Resolve the login issue.", product, release, sprint);
        BacklogItem item2 = new BacklogItem("2", "Add Feature", "Implement dark mode.", product, release, sprint);

        // Print backlog items
        System.out.println(item1);
        System.out.println(item2);
    }
}
