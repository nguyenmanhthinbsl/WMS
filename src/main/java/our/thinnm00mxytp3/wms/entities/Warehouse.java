package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.GenericGenerator;
import our.thinnm00mxytp3.wms.enums.WarehouseStatusEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "warehouse")
public class Warehouse extends BaseEntity{

    private static final long serialVersionUID = 1L;

    @Id()
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",columnDefinition = "BINARY(12)")
    private UUID id;
    private String warehouseName;
    private String warehouseAddress;
    private String warehouseContact;
    private int warehouseManagerId;
    private int warehouseCreaterId;
    private WarehouseStatusEnum status;

    public String getWarehouseName() {
        return warehouseName;
    }

    public void setWarehouseName(String warehouseName) {
        this.warehouseName = warehouseName;
    }

    public String getWarehouseAddress() {
        return warehouseAddress;
    }

    public void setWarehouseAddress(String warehouseAddress) {
        this.warehouseAddress = warehouseAddress;
    }

    public String getWarehouseContact() {
        return warehouseContact;
    }

    public void setWarehouseContact(String warehouseContact) {
        this.warehouseContact = warehouseContact;
    }

    public int getWarehouseManagerId() {
        return warehouseManagerId;
    }

    public void setWarehouseManagerId(int warehouseManagerId) {
        this.warehouseManagerId = warehouseManagerId;
    }

    public int getWarehouseCreaterId() {
        return warehouseCreaterId;
    }

    public void setWarehouseCreaterId(int warehouseCreaterId) {
        this.warehouseCreaterId = warehouseCreaterId;
    }

    public WarehouseStatusEnum getStatus() {
        return status;
    }

    public void setStatus(WarehouseStatusEnum status) {
        this.status = status;
    }
}
