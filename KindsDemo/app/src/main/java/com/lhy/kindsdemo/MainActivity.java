package com.lhy.kindsdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity implements View.OnClickListener{
    private Context mcontex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mcontex = this;
        findViewById(R.id.circular).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.circular:
                Intent intent = new Intent(this, CircularActivity.class);
                startActivity(intent);
                break;
        }
    }
}
