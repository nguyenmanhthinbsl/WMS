package our.thinnm00mxytp3.wms.enums;

public enum CategoryStatusEnum {

    ACTIVE(1),
    INACTIVE(-1),
    ARCHIVED(0);

    private final int status;

    CategoryStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    public static CategoryStatusEnum valueOf(int status) {
        switch (status) {
            case -1:
                return INACTIVE;
            case 1:
                return ACTIVE;
            default:
                return ARCHIVED;
        }
    }
}
