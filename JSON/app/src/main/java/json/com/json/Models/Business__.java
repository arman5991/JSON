
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business__ {

    @SerializedName("business")
    @Expose
    private Business___ business;
    @SerializedName("userPosition")
    @Expose
    private String userPosition;

    public Business___ getBusiness() {
        return business;
    }

    public void setBusiness(Business___ business) {
        this.business = business;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

}
