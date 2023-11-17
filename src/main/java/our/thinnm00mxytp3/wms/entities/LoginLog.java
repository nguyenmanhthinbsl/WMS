package our.thinnm00mxytp3.wms.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "login_log")
public class LoginLog {
    @Id
    @Column(name = "token")
    private String token;

    @Column(name = "login_date")
    private Instant loginDate;

    @Column(name = "expires_in")
    private Instant expiresIn;

    @Column(name = "logout_date")
    private  Instant logoutDate;

    @Column(name = "ip_address")
    private String ipAddress;

    @Column(name = "device_info")
    private String deviceInfo;

    @Column(name = "browser_info")
    private String browserInfo;

    @Column(name = "is_active")
    private Boolean isActive;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

}
