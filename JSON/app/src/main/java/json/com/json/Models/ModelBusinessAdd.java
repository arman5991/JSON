
package json.com.json.Models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ModelBusinessAdd {

    @SerializedName("businessDto")
    @Expose
    private BusinessDto businessDto;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("responseStatus")
    @Expose
    private String responseStatus;

    public BusinessDto getBusinessDto() {
        return businessDto;
    }

    public void setBusinessDto(BusinessDto businessDto) {
        this.businessDto = businessDto;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(String responseStatus) {
        this.responseStatus = responseStatus;
    }

}
