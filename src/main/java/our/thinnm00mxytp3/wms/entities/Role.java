package our.thinnm00mxytp3.wms.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role extends BaseEntity{

    @Id
    @Column(name = "id")
    private String roleId;
    @Column(name = "role_name")
    private String roleName;
    @Column(name = "role_description")
    private String roleDescription;

}
