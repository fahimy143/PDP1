public class Sprint {
    private String id;
    private String name;
    private String startDate;
    private String endDate;

    public Sprint(String id, String name, String startDate, String endDate) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public String getStartDate() { return startDate; }
    public String getEndDate() { return endDate; }

    @Override
    public String toString() {
        return "Sprint{" +
               "id='" + id + '\'' +
               ", name='" + name + '\'' +
               ", startDate='" + startDate + '\'' +
               ", endDate='" + endDate + '\'' +
               '}';
    }
}
