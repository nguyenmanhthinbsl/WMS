package our.thinnm00mxytp3.wms.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "user_role_mapper")
public class UserRoleMapper extends BaseEntity{
    private int userId;
    private int roleId;

}
