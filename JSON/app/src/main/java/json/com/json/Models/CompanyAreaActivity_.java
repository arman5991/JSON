
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class CompanyAreaActivity_ {

    @SerializedName("activityName")
    @Expose
    private String activityName;
    @SerializedName("activityType")
    @Expose
    private String activityType;
    @SerializedName("id")
    @Expose
    private Integer id;

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
