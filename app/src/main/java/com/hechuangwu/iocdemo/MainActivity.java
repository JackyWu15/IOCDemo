package com.hechuangwu.iocdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.hechuangwu.baselibrary.ioc.BindView;
import com.hechuangwu.baselibrary.ioc.ButterKnife;
import com.hechuangwu.baselibrary.ioc.OnCheckNet;
import com.hechuangwu.baselibrary.ioc.OnClick;

/**
 * Created by cwh on 2019/9/19 0019.
 * 功能:
 */
public class MainActivity extends AppCompatActivity {
    @BindView(R.id.tv_text)
    TextView tv_text;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        tv_text.setText("反射注解");
    }


    @OnClick({R.id.tv_text,R.id.bt_click})
    @OnCheckNet
    private void onClick(View view){
        Toast.makeText(this,"点击",Toast.LENGTH_LONG).show();
    }


}
