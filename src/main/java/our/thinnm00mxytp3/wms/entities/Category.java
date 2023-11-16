package our.thinnm00mxytp3.wms.entities;

import our.thinnm00mxytp3.wms.enums.CategoryStatusEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category {
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private CategoryStatusEnum status;
}
