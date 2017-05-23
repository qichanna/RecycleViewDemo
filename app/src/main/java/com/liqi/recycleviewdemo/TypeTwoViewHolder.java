package com.liqi.recycleviewdemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by liqi on 2017/5/22.
 */

public class TypeTwoViewHolder extends TypeAbstractViewHolder<DataModel> {
    public ImageView imageView;
    public TextView textView;


    public TypeTwoViewHolder(View itemView) {
        super(itemView);
        textView = (TextView) itemView.findViewById(R.id.item_two);
    }

    @Override
    public void bindHolder(DataModel model) {
        textView.setText(model.type+"");
    }
}
