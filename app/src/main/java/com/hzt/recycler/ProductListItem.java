package com.hzt.recycler;

import java.util.List;

/**
 * 首页推荐
 */

public class ProductListItem {

    private int nowPage;//当前页码
    private int sort;
    private String order;//排序字段
    private String sortType;//排序方式
    private RS rs;
    private int request_id;//请求id
    private int status;//请求状态 1成功，0失败（错误提示info为文本） 2失败（错误提示info为数组）
    private String info;//提示内容


    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }


    public RS getRs() {
        return rs;
    }

    public void setRs(RS rs) {
        this.rs = rs;
    }

    public int getRequest_id() {
        return request_id;
    }

    public void setRequest_id(int request_id) {
        this.request_id = request_id;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


    public class RS {
        private List<Product> list;

        public List<Product> getList() {
            return list;
        }

        public void setList(List<Product> list) {
            this.list = list;
        }
    }

}
