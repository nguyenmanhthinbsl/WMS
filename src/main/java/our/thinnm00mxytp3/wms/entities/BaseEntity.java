package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="created_at")
    @CreationTimestamp
    private Date createdAt; // determine that time when entity created

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="updated_at")
    @UpdateTimestamp
    private Date updatedAt; // determine that time when entity created

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

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getCreatedAtFormatVN() {
        return this.getDatetimeFormatVN(createdAt);
    }

    public String getUpdatedAtFormatVN() {
        return this.getDatetimeFormatVN(updatedAt);
    }

}
