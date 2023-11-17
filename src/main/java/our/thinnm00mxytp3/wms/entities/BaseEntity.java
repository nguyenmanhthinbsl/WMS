package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

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

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_time")
    @CreationTimestamp
    private Date createTime; // determine that time when entity created

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_time")
    @UpdateTimestamp
    private Date updateTime; // determine that time when entity created

    @Column(name = "is_delete")
    private boolean isDelete;

    @Column(name = "deleteBy")
    private UUID deteleBy;

    public boolean isDelete() {
        return isDelete;
    }

    public void setDelete(boolean delete) {
        isDelete = delete;
    }

    public UUID getDeteleBy() {
        return deteleBy;
    }

    public void setDeteleBy(UUID deteleBy) {
        this.deteleBy = deteleBy;
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
