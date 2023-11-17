package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.GenericGenerator;
import our.thinnm00mxytp3.wms.enums.CategoryStatusEnum;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "category")
public class Category {

    @Id()
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",columnDefinition = "BINARY(12)")
    private UUID id;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;
    @Column(name = "description")
    private String description;
    @Column(name = "status")
    private CategoryStatusEnum status;
}
