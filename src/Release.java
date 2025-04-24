public class Release {
    private String id;
    private String version;
    private String description;

    public Release(String id, String version, String description) {
        this.id = id;
        this.version = version;
        this.description = description;
    }

    public String getId() { return id; }
    public String getVersion() { return version; }
    public String getDescription() { return description; }

    @Override
    public String toString() {
        return "Release{" +
               "id='" + id + '\'' +
               ", version='" + version + '\'' +
               ", description='" + description + '\'' +
               '}';
    }
}
