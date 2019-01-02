package com.luodong.statelayout.view;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.TextView;

import com.luodong.statelayout.R;
import com.luodong.statelayout.SBaseStateView;


public class EmptyView extends SBaseStateView {
    private ImageView iv_image;
    private TextView tv_content;

    public EmptyView(Context context) {
        super(context);
        init(null);
    }

    public EmptyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public EmptyView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs) {
        setContentView(R.layout.view_base_state);

        iv_image = findViewById(R.id.iv_image);
        tv_content = findViewById(R.id.tv_content);
        iv_image.setImageResource(R.drawable.img_empty);
        tv_content.setText(R.string.no_content_for_the_time);
    }

    public void setImageResource(@DrawableRes int resId) {
        iv_image.setImageResource(resId);
    }

    public void setText(@StringRes int resid) {
        tv_content.setText(resid);
    }

    public void setText(CharSequence text) {
        tv_content.setText(text);
    }
}
