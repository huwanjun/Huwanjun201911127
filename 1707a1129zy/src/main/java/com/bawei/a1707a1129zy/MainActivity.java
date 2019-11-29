package com.bawei.a1707a1129zy;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager vp;
    private RadioGroup rg;
    private Fragment fragment1;
    private Fragment fragment2;
    private Fragment fragment3;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.vp);
        rg=findViewById(R.id.rg);
        fragment1=new Fragment1();
        fragment2=new Fragment2();
        fragment3=new Fragment3();

        list=new ArrayList<>();
        list.add(fragment1);
        list.add(fragment2);
        list.add(fragment3);

        vp.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int i) {
                return list.get(i);
            }

            @Override
            public int getCount() {
                return list.size();
            }
        });

        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {

                switch (i){

                    case 0:
                        rg.check(R.id.rb_1);
                        break;

                    case 1:
                        rg.check(R.id.rb_2);
                        break;


                    case 2:
                        rg.check(R.id.rb_3);
                        break;


                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                switch (checkedId){

                    case R.id.rb_1:
                        vp.setCurrentItem(0);
                        break;

                    case R.id.rb_2:
                        vp.setCurrentItem(1);
                        break;

                    case R.id.rb_3:
                        vp.setCurrentItem(2);
                        break;
                }
            }
        });
    }

    public void tiao(){
        vp.setCurrentItem(2);
    }
}
