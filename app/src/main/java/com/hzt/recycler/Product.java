package com.hzt.recycler;

import java.util.List;

/**
 * 推荐列表
 */

public class Product {

    private String id;//产品id
    private String create_time; //创建日期
    private String product_name;//产品名称
    private String product_no;//产品号
    private String sale_price;
    private String fmd_create_time;
    private String dml_sale_price;
    private String edml_sale_price;//销售价格
    private int is_new;//是否为新品 1是 0否; type=new无此字段
    private int is_collect;//是否为收藏产品 1是 0否; type=collect无此字段
    private int is_promotion;//是否为促销产品 1是 0否; type=promotion无此字段

    //促销产品字段
    private String promotion_product_rule;// 1满赠 2直降 3打折
    private String straight_down;//直降价格
    private String promotion_discount;//打折
    private String dml_straight_down;
    private String edml_straight_down;
    private String dml_promotion_discount;
    private String edml_promotion_discount;
    private String dd_promotion_product_rule;//促销规则

    private String pics_path;
    private List<Integer> promotion_country;
    private List<PromotionRegion> promotion_region;
    private List<Pics> pics;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_no() {
        return product_no;
    }

    public void setProduct_no(String product_no) {
        this.product_no = product_no;
    }

    public String getSale_price() {
        return sale_price;
    }

    public void setSale_price(String sale_price) {
        this.sale_price = sale_price;
    }

    public String getFmd_create_time() {
        return fmd_create_time;
    }

    public void setFmd_create_time(String fmd_create_time) {
        this.fmd_create_time = fmd_create_time;
    }

    public String getDml_sale_price() {
        return dml_sale_price;
    }

    public void setDml_sale_price(String dml_sale_price) {
        this.dml_sale_price = dml_sale_price;
    }

    public String getEdml_sale_price() {
        return edml_sale_price;
    }

    public void setEdml_sale_price(String edml_sale_price) {
        this.edml_sale_price = edml_sale_price;
    }

    public int getIs_new() {
        return is_new;
    }

    public void setIs_new(int is_new) {
        this.is_new = is_new;
    }

    public int getIs_collect() {
        return is_collect;
    }

    public void setIs_collect(int is_collect) {
        this.is_collect = is_collect;
    }

    public int getIs_promotion() {
        return is_promotion;
    }

    public void setIs_promotion(int is_promotion) {
        this.is_promotion = is_promotion;
    }

    public String getPromotion_product_rule() {
        return promotion_product_rule;
    }

    public void setPromotion_product_rule(String promotion_product_rule) {
        this.promotion_product_rule = promotion_product_rule;
    }

    public String getStraight_down() {
        return straight_down;
    }

    public void setStraight_down(String straight_down) {
        this.straight_down = straight_down;
    }

    public String getPromotion_discount() {
        return promotion_discount;
    }

    public void setPromotion_discount(String promotion_discount) {
        this.promotion_discount = promotion_discount;
    }

    public String getDml_straight_down() {
        return dml_straight_down;
    }

    public void setDml_straight_down(String dml_straight_down) {
        this.dml_straight_down = dml_straight_down;
    }

    public String getEdml_straight_down() {
        return edml_straight_down;
    }

    public void setEdml_straight_down(String edml_straight_down) {
        this.edml_straight_down = edml_straight_down;
    }

    public String getDml_promotion_discount() {
        return dml_promotion_discount;
    }

    public void setDml_promotion_discount(String dml_promotion_discount) {
        this.dml_promotion_discount = dml_promotion_discount;
    }

    public String getEdml_promotion_discount() {
        return edml_promotion_discount;
    }

    public void setEdml_promotion_discount(String edml_promotion_discount) {
        this.edml_promotion_discount = edml_promotion_discount;
    }

    public String getDd_promotion_product_rule() {
        return dd_promotion_product_rule;
    }

    public void setDd_promotion_product_rule(String dd_promotion_product_rule) {
        this.dd_promotion_product_rule = dd_promotion_product_rule;
    }

    public String getPics_path() {
        return pics_path;
    }

    public void setPics_path(String pics_path) {
        this.pics_path = pics_path;
    }

    public List<Integer> getPromotion_country() {
        return promotion_country;
    }

    public void setPromotion_country(List<Integer> promotion_country) {
        this.promotion_country = promotion_country;
    }

    public List<PromotionRegion> getPromotion_region() {
        return promotion_region;
    }

    public void setPromotion_region(List<PromotionRegion> promotion_region) {
        this.promotion_region = promotion_region;
    }

    public List<Pics> getPics() {
        return pics;
    }

    public void setPics(List<Pics> pics) {
        this.pics = pics;
    }

    private class PromotionRegion {

        private String country_name;//促销国家名称
        private String country_code;//促销国家编号
        private String country_id;//促销国家ID
        private String promotion_id;

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getPromotion_id() {
            return promotion_id;
        }

        public void setPromotion_id(String promotion_id) {
            this.promotion_id = promotion_id;
        }
    }



}
