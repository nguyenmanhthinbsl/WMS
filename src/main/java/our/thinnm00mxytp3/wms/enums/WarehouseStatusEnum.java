package our.thinnm00mxytp3.wms.enums;

public enum WarehouseStatusEnum {
    // is Openning now
    OPEN(1),

    // is closed forever like DELETED
    CLOSED(-1),

    // closed short time -> will be back after time
    UNDER_MAINTENANCE(0),

    // is shipping rn
    SHIPPING(2),

    // is reveiving rn
    RECEIVING(3);
    private final int status;

    private WarehouseStatusEnum(int status) {
        this.status = status;
    }

    public static WarehouseStatusEnum valueOf(int status) {
        switch (status) {
            case -1:
                return CLOSED;
            case 1:
                return OPEN;
            case 2:
                return SHIPPING;
            case 3:
                return RECEIVING;
            default:
                return UNDER_MAINTENANCE;
        }
    }
}
