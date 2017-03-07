package org.larry.cms.core.page;

import java.util.List;

/**
 * Created by Larry on 2017/2/27.
 */
public class Page<T> {

    // 当前偏移量
    private int offset ;

    //总记录数
    private int total ;
    // 每页记录数
    private int pageSize = 10;

    // 当前页数
    private int rows = 1;
    // 数据
    private T data ;

    private List<T> list ;

    public int getOffset() {
        return this.getPageSize() * (this.getRows() - 1) ;
    }

    public void setOffset(int offset) {
        this.offset = offset ;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Page page = new Page() ;
        page.setRows(2);
        System.out.println(page.getOffset());
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
