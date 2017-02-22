package com.logictech.dwzq.core.base.resp;

/**
 * @ClassName: PaginationResp
 * @Description: 分页放返回结果
 */
public class PaginationResp extends JsonResp {

    /**
     * @Fields currpage : 当前页
     */
    private int     currpage;

    /**
     * @Fields nextpage : 下一页
     */
    private int     nextpage;

    /**
     * @Fields hasnext : 是否有下一页
     */
    private boolean hasnext;

    public PaginationResp()
    {
        this(false);
    }

    public PaginationResp(int _result, String _msg)
    {
        this(_result, _msg, false);
    }

    public PaginationResp(int _result, String _msg, boolean _hasnext)
    {
        super(_result, _msg);
        this.hasnext = _hasnext;
    }

    public PaginationResp(boolean _hasnext)
    {
        super();
        this.hasnext = _hasnext;
    }

    /**
     * @return currpage
     */
    public int getCurrpage() {
        return currpage;
    }

    /**
     * @param currpage 要设置的 currpage
     */
    public void setCurrpage(int currpage) {
        this.currpage = currpage;
    }

    /**
     * @return nextpage
     */
    public int getNextpage() {
        return nextpage;
    }

    /**
     * @param nextpage 要设置的 nextpage
     */
    public void setNextpage(int nextpage) {
        this.nextpage = nextpage;
    }

    /**
     * @return hasnext
     */
    public boolean isHasnext() {
        return hasnext;
    }

    /**
     * @param hasnext 要设置的 hasnext
     */
    public void setHasnext(boolean hasnext) {
        this.hasnext = hasnext;
    }

}
