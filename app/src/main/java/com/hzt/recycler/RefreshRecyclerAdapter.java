package com.hzt.recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Administrator on 2017/11/9.
 */

public class RefreshRecyclerAdapter extends RefreshRecyclerView.RefreshRecyclerViewAdapter<String> {


    public RefreshRecyclerAdapter(List<String> dataList, int itemLayout, boolean pullEnable) {
        super(dataList, itemLayout, pullEnable);
    }

    @Override
    public RecyclerView.ViewHolder setItemViewHolder(View itemView) {
        ViewHolder viewHolder = new ViewHolder(itemView);
        return viewHolder;
    }

    @Override
    public void initItemView(RecyclerView.ViewHolder itemHolder, int posion, String entity) {
        ((ViewHolder) itemHolder).text.setText(entity);
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView text;

        public ViewHolder(View itemView) {
            super(itemView);
            text = itemView.findViewById(R.id.text);
        }
    }
}
