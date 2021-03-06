package com.bh.wechat.request;

import java.io.Serializable;

import com.bh.wechat.gateway.Parameter;

public class PaginationRequest implements Serializable {

    private static final long serialVersionUID = 1201389992604376408L;

    @Parameter(required = false)
    private Integer offset;

    @Parameter(required = false)
    private Integer limit;

    public Integer getOffset() {
        if (null == offset) {
            return 0;
        } else {
            return offset;
        }
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        if (null == limit || limit <= 0) {
            return 10;
        } else {
            return limit;
        }
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
