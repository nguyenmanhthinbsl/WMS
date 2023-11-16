package our.thinnm00mxytp3.wms.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "material")
public class Material extends BaseEntity{

    private int categoryId;
    private String name;
    private String code;

    //...
}
