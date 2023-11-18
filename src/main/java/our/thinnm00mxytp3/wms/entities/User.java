package our.thinnm00mxytp3.wms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "user")
public class User extends BaseEntity{
    private static final long serialVersionUID = 1L;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "mid_name")
    private String midName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
    @Column(name = "google_uid")
    private String googleUID;
    @Column(name = "facebook_uid")
    private String facebookUID;
    @Column(name = "phone_uid")
    private String phoneUID;
    @Column(name = "email", unique = true)
    private String email;
    @Column(name = "username", unique = true)
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "phone", unique = true)
    private String phone;
    @Column(name = "is_verified")
    private boolean isVerified;
    @Column(name = "verify_code")
    private String verifyCode;
    @Column(name = "verify_fail_count")
    private int verifyFailCount; // check if verify fail in time
    @Column(name = "last_login_datetime")
    private Date lastLoginDateTime;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMidName() {
        return midName;
    }

    public void setMidName(String midName) {
        this.midName = midName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGoogleUID() {
        return googleUID;
    }

    public void setGoogleUID(String googleUID) {
        this.googleUID = googleUID;
    }

    public String getFacebookUID() {
        return facebookUID;
    }

    public void setFacebookUID(String facebookUID) {
        this.facebookUID = facebookUID;
    }

    public String getPhoneUID() {
        return phoneUID;
    }

    public void setPhoneUID(String phoneUID) {
        this.phoneUID = phoneUID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public boolean isVerified() {
        return isVerified;
    }

    public void setVerified(boolean verified) {
        isVerified = verified;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public int getVerifyFailCount() {
        return verifyFailCount;
    }

    public void setVerifyFailCount(int verifyFailCount) {
        this.verifyFailCount = verifyFailCount;
    }

    public Date getLastLoginDateTime() {
        return lastLoginDateTime;
    }

    public void setLastLoginDateTime(Date lastLoginDateTime) {
        this.lastLoginDateTime = lastLoginDateTime;
    }
}
