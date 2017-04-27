package ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import fragments.HomeFragment;
import fragments.MeFragment;
import fragments.MoreFragment;
import fragments.OrderFragment;
import mark.come.cn.waimai.R;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    @BindView(R.id.container)
    FrameLayout container;
    @BindView(R.id.home)
    RadioButton home;
    @BindView(R.id.order)
    RadioButton order;
    @BindView(R.id.me)
    RadioButton me;
    @BindView(R.id.more)
    RadioButton more;
    @BindView(R.id.rg)
    RadioGroup rg;
    private List<Fragment> fragments;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initFragments();
        initEvent();
    }

    //初始化Fragments
    private void initFragments() {
        fragments = new ArrayList<>();
        fragments.add(new HomeFragment());
        fragments.add(new OrderFragment());
        fragments.add(new MeFragment());
        fragments.add(new MoreFragment());
    }

    //设置监听切换Fragment
    private void initEvent() {
        rg.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.home :
                switchFragment(0);
                break;
            case R.id.order :
                switchFragment(1);
                break;
            case R.id.me :
                switchFragment(2);
                break;
            case R.id.more:
                switchFragment(3);
                break;
        }
    }

    private void switchFragment(int position) {
        for (int i = 0; i < fragments.size(); i++) {

        }
    }
}
