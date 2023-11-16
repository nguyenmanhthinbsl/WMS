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
    @Column(name = "ipaddress")
    private String ipAddress;
    @Column(name = "email")
    private String email;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "phone")
    private String phone;
    @Column(name = "is_verified")
    private boolean isVerified;
    @Column(name = "verify_code")
    private String verifyCode;
    @Column(name = "verify_fail_count")
    private int verifyFailCount; // check if verify fail in time
    @Column(name = "last_login_datetime")
    private Date lastLoginDateTime;
}
