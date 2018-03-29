package json.com.json;

public class ModelGson {
    private String ver;
    private String name;
    private String api;

    public ModelGson(String version, String name, String api) {
        this.ver = version;
        this.name = name;
        this.api = api;
    }

    public String getVer() {
        return ver;
    }

    public String getName() {
        return name;
    }

    public String getApi() {
        return api;
    }
}
