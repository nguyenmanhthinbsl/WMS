package our.thinnm00mxytp3.wms.entities;

import our.thinnm00mxytp3.wms.enums.CategoryStatusEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class Category extends BaseEntity{
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private CategoryStatusEnum status;

//    public Category(String name, String code, String description, CategoryStatusEnum status) {
//        this.name = name;
//        this.code = code;
//        this.description = description;
//        this.status = status;
//    }
}
