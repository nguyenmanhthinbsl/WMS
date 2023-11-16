package our.thinnm00mxytp3.wms.models.responsemodels;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class BaseListDataResponse<T> {
    private boolean isSuccess;
    private int limit;

    @JsonProperty("total_record")
    private long totalRecord;

    private List<T> listData;

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(long totalRecord) {
        this.totalRecord = totalRecord;
    }

    public List<T> getListData() {
        return listData;
    }

    public void setListData(List<T> listData) {
        this.listData = listData;
    }

    public BaseListDataResponse() {
    }

    public BaseListDataResponse(int limit, long totalRecord) {
        super();
        this.limit = limit;
        this.totalRecord = totalRecord;
    }

    public BaseListDataResponse(boolean isSuccess, int limit, long totalRecord, List<T> listData) {
        super();
        this.isSuccess = isSuccess;
        this.limit = limit;
        this.totalRecord = totalRecord;
        this.listData = listData;
    }
}
