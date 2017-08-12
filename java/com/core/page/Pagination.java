package com.core.page;


public class Pagination<E> extends AbstractPage<E> {

    protected int start;//记录起始查询索引
    protected int totalItemsCount;
    protected int totalPageCount;

    public Pagination() {
    }

    public int getTotalItemsCount() {
        return totalItemsCount;
    }

    /**
     * 求页码数一定要先减1再除以
     *
     * @param totalItemsCount
     */
    public void setTotalItemsCount(int totalItemsCount) {
        this.totalItemsCount = totalItemsCount;
        this.totalPageCount = (getTotalItemsCount() - 1) / getPageSize() + getFirstPageNum();
    }

    @Override
    public boolean isLastPage() {
        return getLastPageNum() <= getPageNum();
    }


    public int getLastPageNum() {
        return this.totalPageCount;
    }

    @Override
    public String toString() {
        return String.format("Page[%d] of [%d] in total [%d] :%s", this.getPageNum(), this.getLastPageNum(), this.getTotalItemsCount(), items.toString());
    }

    public int getTotalPageCount() {
        return totalPageCount;
    }

    //初始查询记录数
    public int getStart() {
        //this.start = (this.pageNum - 1) * this.pageSize;
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

}


