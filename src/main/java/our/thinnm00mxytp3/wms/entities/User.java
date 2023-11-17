package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "user")
public class User extends BaseEntity{
    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",columnDefinition = "BINARY(12)")
    private UUID id;

    @Column(name = "first_name")
    private String firstName;
    @Column(name = "mid_name")
    private String midName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "address")
    private String address;
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
