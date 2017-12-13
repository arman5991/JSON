
package json.com.json.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Business___ {

    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("companyAreaActivities")
    @Expose
    private List<CompanyAreaActivity__> companyAreaActivities = null;
    @SerializedName("foundingDate")
    @Expose
    private String foundingDate;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("legalName")
    @Expose
    private String legalName;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<CompanyAreaActivity__> getCompanyAreaActivities() {
        return companyAreaActivities;
    }

    public void setCompanyAreaActivities(List<CompanyAreaActivity__> companyAreaActivities) {
        this.companyAreaActivities = companyAreaActivities;
    }

    public String getFoundingDate() {
        return foundingDate;
    }

    public void setFoundingDate(String foundingDate) {
        this.foundingDate = foundingDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

}
