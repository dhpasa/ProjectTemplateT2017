package com.logictech.dwzq.core.exception.type;

public class DirtyDataException extends BaseException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 带Message的构造函数
     * 
     * @param message
     */
    public DirtyDataException(final String message) {
        super(message);
    }
}
