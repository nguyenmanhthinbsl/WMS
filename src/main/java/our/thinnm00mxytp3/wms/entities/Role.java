package our.thinnm00mxytp3.wms.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends BaseEntity{

    private String roleName;
}
