package zowecli.globalteamconfig.sections;

public class Schema {

    private String schema;

    public Schema(String schema) {
        this.schema = schema;
    }

    public String getSchema() {
        return schema;
    }

    @Override
    public String toString() {
        return "Schema{" +
                "schema='" + schema + '\'' +
                '}';
    }

}