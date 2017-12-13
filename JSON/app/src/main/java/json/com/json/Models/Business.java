
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business {

    @SerializedName("business")
    @Expose
    private Business_ business;
    @SerializedName("userPosition")
    @Expose
    private String userPosition;

    public Business_ getBusiness() {
        return business;
    }

    public void setBusiness(Business_ business) {
        this.business = business;
    }

    public String getUserPosition() {
        return userPosition;
    }

    public void setUserPosition(String userPosition) {
        this.userPosition = userPosition;
    }

}
