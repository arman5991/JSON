
package json.com.json.Models;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Director {

    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("birthDate")
    @Expose
    private String birthDate;
    @SerializedName("businesses")
    @Expose
    private List<Business> businesses = null;
    @SerializedName("firstName")
    @Expose
    private String firstName;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("lastName")
    @Expose
    private String lastName;
    @SerializedName("mobileNumber")
    @Expose
    private String mobileNumber;
    @SerializedName("pinCode")
    @Expose
    private String pinCode;
    @SerializedName("userEmails")
    @Expose
    private List<UserEmail> userEmails = null;
    @SerializedName("userInterests")
    @Expose
    private List<UserInterest> userInterests = null;
    @SerializedName("userPhoneNumbers")
    @Expose
    private List<UserPhoneNumber> userPhoneNumbers = null;
    @SerializedName("userProfessions")
    @Expose
    private List<UserProfession> userProfessions = null;
    @SerializedName("userStatus")
    @Expose
    private String userStatus;
    @SerializedName("userType")
    @Expose
    private String userType;
    @SerializedName("userWorkplaces")
    @Expose
    private List<UserWorkplace> userWorkplaces = null;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public List<Business> getBusinesses() {
        return businesses;
    }

    public void setBusinesses(List<Business> businesses) {
        this.businesses = businesses;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }

    public List<UserEmail> getUserEmails() {
        return userEmails;
    }

    public void setUserEmails(List<UserEmail> userEmails) {
        this.userEmails = userEmails;
    }

    public List<UserInterest> getUserInterests() {
        return userInterests;
    }

    public void setUserInterests(List<UserInterest> userInterests) {
        this.userInterests = userInterests;
    }

    public List<UserPhoneNumber> getUserPhoneNumbers() {
        return userPhoneNumbers;
    }

    public void setUserPhoneNumbers(List<UserPhoneNumber> userPhoneNumbers) {
        this.userPhoneNumbers = userPhoneNumbers;
    }

    public List<UserProfession> getUserProfessions() {
        return userProfessions;
    }

    public void setUserProfessions(List<UserProfession> userProfessions) {
        this.userProfessions = userProfessions;
    }

    public String getUserStatus() {
        return userStatus;
    }

    public void setUserStatus(String userStatus) {
        this.userStatus = userStatus;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public List<UserWorkplace> getUserWorkplaces() {
        return userWorkplaces;
    }

    public void setUserWorkplaces(List<UserWorkplace> userWorkplaces) {
        this.userWorkplaces = userWorkplaces;
    }

}
