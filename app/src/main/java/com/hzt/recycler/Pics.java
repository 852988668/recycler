package com.hzt.recycler;

/**
 * 图片名
 */

public class Pics {

    private String id;
    private String file_url;
    private String relation_id;
    private String relation_type;
    private String cpation_name;
    private String tocken;
    private String upload_date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFile_url() {
        return file_url;
    }

    public void setFile_url(String file_url) {
        this.file_url = file_url;
    }

    public String getRelation_id() {
        return relation_id;
    }

    public void setRelation_id(String relation_id) {
        this.relation_id = relation_id;
    }

    public String getRelation_type() {
        return relation_type;
    }

    public void setRelation_type(String relation_type) {
        this.relation_type = relation_type;
    }

    public String getCpation_name() {
        return cpation_name;
    }

    public void setCpation_name(String cpation_name) {
        this.cpation_name = cpation_name;
    }

    public String getTocken() {
        return tocken;
    }

    public void setTocken(String tocken) {
        this.tocken = tocken;
    }

    public String getUpload_date() {
        return upload_date;
    }

    public void setUpload_date(String upload_date) {
        this.upload_date = upload_date;
    }
}
