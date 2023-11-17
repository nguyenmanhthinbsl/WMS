package our.thinnm00mxytp3.wms.entities;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "material")
public class Material extends BaseEntity{

    @Id()
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column(name = "id",columnDefinition = "BINARY(12)")
    private UUID id;
    @Column(name = "category_id")
    private UUID categoryId;
    @Column(name = "name")
    private String name;
    @Column(name = "code")
    private String code;

    //...
}
