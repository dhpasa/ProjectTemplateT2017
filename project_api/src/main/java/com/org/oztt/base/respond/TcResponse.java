package com.org.oztt.base.respond;

/**
 * 最后使得返回的数据是这样的一种格式 { "meta": { "success": true, "message": "ok" }, "data": ... }
 */
public class TcResponse {

    private static final String OK    = "ok";

    private static final String ERROR = "error";

    private Meta                meta;

    private Object              data;

    public TcResponse success() {
        this.meta = new Meta(true, OK);
        return this;
    }

    public TcResponse success(Object data) {
        this.meta = new Meta(true, OK);
        this.data = data;
        return this;
    }

    public TcResponse failure() {
        this.meta = new Meta(false, ERROR);
        return this;
    }

    public TcResponse failure(String message) {
        this.meta = new Meta(false, message);
        return this;
    }

    public Meta getMeta() {
        return meta;
    }

    public Object getData() {
        return data;
    }

    public class Meta {

        private boolean success;

        private String  message;

        public Meta(boolean success)
        {
            this.success = success;
        }

        public Meta(boolean success, String message)
        {
            this.success = success;
            this.message = message;
        }

        public boolean isSuccess() {
            return success;
        }

        public String getMessage() {
            return message;
        }
    }
}
