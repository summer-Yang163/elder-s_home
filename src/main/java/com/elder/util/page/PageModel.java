package com.elder.util.page;


//import sun.jvm.hotspot.debugger.Page;

import java.util.ArrayList;
import java.util.List;

public class PageModel<T> {
    //用户输入的分页条件
    private int currentPage;//当前页
    private int pageSize;//每页最大条数

    //用于实现分页的SQL条件，是根据用户输入条件计算而来的
    private int beginPage;
    private int endPage;

    //自动计算出的总行数
    private int totalRows;
    //根据计算总行数，计算出总的页数输出给页面
    private int totalPage;
    //存储数据
    private List<T> dataList;

    //是否分页
    private Boolean isPaging;

    public PageModel() {
        this.currentPage = 1;
        this.pageSize = 15;
        this.isPaging = true;
        this.dataList = new ArrayList<>();
    }


    public Boolean getPaging() {
        return isPaging;
    }

    public void setPaging(Boolean paging) {
        isPaging = paging;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(int currentPage) {
        this.currentPage = currentPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getBeginPage() {
        //在mapper.xml使用begin属性时，对其进行计算
        beginPage = (currentPage - 1) * pageSize;
        return beginPage;
    }

    public void setBeginPage(int beginPage) {
        this.beginPage = beginPage;
    }

    public int getEndPage() {
        //在mapper.xml中使用end属性时，对其进行计算
        endPage = currentPage * pageSize + 1;
        return endPage;
    }

    public void setEndPage(int endPage) {
        this.endPage = endPage;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalPage() {
        //根据总行数，计算总页数
        if (totalRows % pageSize == 0) {
            totalPage = totalRows / pageSize;
        } else {
            totalPage = totalRows / pageSize + 1;
        }
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    //用于limit的第一个参数计算
    public int currentTotalCount(int currentPage) {
        int currentTotalCount = (currentPage - 1) * pageSize;
        return currentTotalCount;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
