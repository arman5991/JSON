
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserPhoneNumber_ {

    @SerializedName("hidden")
    @Expose
    private Boolean hidden;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("phoneNumber")
    @Expose
    private String phoneNumber;

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
