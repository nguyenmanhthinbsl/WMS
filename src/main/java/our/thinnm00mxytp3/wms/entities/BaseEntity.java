package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {
    /**
     * serializable: cơ chế để ghi trạng thái của một đối tượng vào một byte stream.
     * Nó chủ yếu được sử dụng trong các công nghệ Hibernate, RMI, JPA, EJB và JMS.
     * <p>
     * deserialiable:ngược lại với serializable
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time")
    @CreationTimestamp
    private Date createTime; // determine that time when entity created

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_time")
    @UpdateTimestamp
    private Date updateTime; // determine that time when entity created

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Constructors, getters, and setters
    public String getDateFormatVN(Date date) {
        if(date == null) {
            date = new Date();
            return (new SimpleDateFormat("dd/MM/yyyy").format(date));
        } else {
            return (new SimpleDateFormat("dd/MM/yyyy").format(date));
        }
    }

    public String getDatetimeFormatVN(Date date) {
        if(date == null) {
            date = new Date();
            return (new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date));
        } else {
            return (new SimpleDateFormat("dd/MM/yyyy HH:mm").format(date));
        }
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreatedAtFormatVN() {
        return this.getDatetimeFormatVN(createTime);
    }

    public String getUpdatedAtFormatVN() {
        return this.getDatetimeFormatVN(updateTime);
    }

}
