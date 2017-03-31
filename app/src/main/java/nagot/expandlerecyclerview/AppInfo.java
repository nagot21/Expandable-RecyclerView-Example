package nagot.expandlerecyclerview;

/**
 * Created by Nagot on 31/03/2017.
 */

public class AppInfo {
    String name;
    String version;
    String comment;

    public AppInfo(String name, String version, String comment) {
        this.name = name;
        this.version = version;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
