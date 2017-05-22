package com.liqi.recycleviewdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by liqi on 2017/5/22.
 */

public abstract class TypeAbstractViewHolder extends RecyclerView.ViewHolder {

    public TypeAbstractViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void bindHolder(DataModel model);
}
