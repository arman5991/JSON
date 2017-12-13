
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserWorkplace {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("userWorkplace")
    @Expose
    private String userWorkplace;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserWorkplace() {
        return userWorkplace;
    }

    public void setUserWorkplace(String userWorkplace) {
        this.userWorkplace = userWorkplace;
    }

}
