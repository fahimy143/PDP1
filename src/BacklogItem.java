public class BacklogItem {
    private String id;
    private String title;
    private String description;
    private Product product;
    private Release release;
    private Sprint sprint;

    public BacklogItem(String id, String title, String description, Product product, Release release, Sprint sprint) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.product = product;
        this.release = release;
        this.sprint = sprint;
    }

    public String getId() { return id; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Product getProduct() { return product; }
    public Release getRelease() { return release; }
    public Sprint getSprint() { return sprint; }

    @Override
    public String toString() {
        return "BacklogItem{" +
               "id='" + id + '\'' +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", product=" + product +
               ", release=" + release +
               ", sprint=" + sprint +
               '}';
    }
}
