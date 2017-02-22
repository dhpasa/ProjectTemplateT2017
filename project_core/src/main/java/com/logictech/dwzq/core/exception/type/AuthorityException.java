package com.logictech.dwzq.core.exception.type;

public class AuthorityException extends BaseException {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * 构造
     * 
     * @param message
     */
    public AuthorityException(final String message) {
        super(message);
    }

    /**
     * 构造，带message
     * 
     * @param message
     */
    public AuthorityException() {
        super();
    }
}
