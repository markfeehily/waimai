package fragments;

import android.view.View;
import android.widget.TextView;

import base.Basefragment;

/**
 * Created by Administrator on 2017/4/28.
 */
public class MeFragment extends Basefragment{
    @Override
    protected void initData() {

    }

    @Override
    public View initLayout() {
        TextView tv=new TextView(getContext());
        tv.setText(getClass().getSimpleName());
        return tv;
    }
}
