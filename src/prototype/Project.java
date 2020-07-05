package prototype;

public class Project  implements Copyable{
    private  int Id;
    private String name;
    private  String SourceCod;

    public Project(int id, String name, String sourceCod) {
        Id = id;
        this.name = name;
        SourceCod = sourceCod;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSourceCod() {
        return SourceCod;
    }

    public void setSourceCod(String sourceCod) {
        SourceCod = sourceCod;
    }

    @Override
    public Object copy() {
        Project copy = new Project(Id, name, SourceCod);
        return copy;
    }

    @Override
    public String toString() {
        return "Project{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", SourceCod='" + SourceCod + '\'' +
                '}';
    }
}
