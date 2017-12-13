
package json.com.json;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("birthDate")
    @Expose
    private String birthDate;
    @SerializedName("userType")
    @Expose
    private String userType;
    @SerializedName("userStatus")
    @Expose
    private String userStatus;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("userEmails")
    @Expose
    private List<Object> userEmails = null;
    @SerializedName("userInterests")
    @Expose
    private List<Object> userInterests = null;
    @SerializedName("userPhoneNumbers")
    @Expose
    private List<Object> userPhoneNumbers = null;
    @SerializedName("userProfessions")
    @Expose
    private List<Object> userProfessions = null;
    @SerializedName("userWorkplaces")
    @Expose
    private List<Object> userWorkplaces = null;
    @SerializedName("businesses")
    @Expose
    private List<Object> businesses = null;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Object> getUserEmails() {
        return userEmails;
    }

    public void setUserEmails(List<Object> userEmails) {
        this.userEmails = userEmails;
    }

    public List<Object> getUserInterests() {
        return userInterests;
    }

    public void setUserInterests(List<Object> userInterests) {
        this.userInterests = userInterests;
    }

    public List<Object> getUserPhoneNumbers() {
        return userPhoneNumbers;
    }

    public void setUserPhoneNumbers(List<Object> userPhoneNumbers) {
        this.userPhoneNumbers = userPhoneNumbers;
    }

    public List<Object> getUserProfessions() {
        return userProfessions;
    }

    public void setUserProfessions(List<Object> userProfessions) {
        this.userProfessions = userProfessions;
    }

    public List<Object> getUserWorkplaces() {
        return userWorkplaces;
    }

    public void setUserWorkplaces(List<Object> userWorkplaces) {
        this.userWorkplaces = userWorkplaces;
    }

    public List<Object> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Object> businesses) {
        this.businesses = businesses;
    }

}
