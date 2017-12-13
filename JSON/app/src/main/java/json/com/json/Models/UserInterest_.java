
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserInterest_ {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("userInterest")
    @Expose
    private String userInterest;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserInterest() {
        return userInterest;
    }

    public void setUserInterest(String userInterest) {
        this.userInterest = userInterest;
    }

}
