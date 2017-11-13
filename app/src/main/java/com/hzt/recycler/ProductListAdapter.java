package com.hzt.recycler;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * 产品列表
 */

public class ProductListAdapter extends RefreshRecyclerView.RefreshAdapter<Product> {


    public ProductListAdapter(Context mContext, int itemLayout, boolean pullEnable) {
        super(mContext, itemLayout, pullEnable);
    }

    @Override
    public RecyclerView.ViewHolder setItemViewHolder(View itemView) {
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void initItemView(RecyclerView.ViewHolder itemHolder, int postion, final Product entity) {
        ViewHolder holder = (ViewHolder) itemHolder;

        holder.product_name_tv.setText(entity.getProduct_name() + "");
        holder.product_no_tv.setText(entity.getProduct_no() + "");
        holder.product_price_tv.setText(entity.getDml_sale_price() + "");
        if (entity.getPics().size() != 0) {//有预览图
            Glide.with(mContext)
                    .load(R.mipmap.image_default)
                    .into(holder.product_pic_iv);
        }

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        RelativeLayout product_layout;
        ImageView product_pic_iv;//物品图片
        TextView product_name_tv;//物品名
        TextView product_no_tv;//物品编号
        TextView product_price_tv;//价格

        public ViewHolder(View itemView) {
            super(itemView);
            product_layout = (RelativeLayout) itemView.findViewById(R.id.product_layout);
            product_pic_iv = (ImageView) itemView.findViewById(R.id.product_pic_iv);
            product_name_tv = (TextView) itemView.findViewById(R.id.product_name_tv);
            product_no_tv = (TextView) itemView.findViewById(R.id.product_no_tv);
            product_price_tv = (TextView) itemView.findViewById(R.id.product_price_tv);
        }
    }
}
